package com.tmall.admin.security;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tmall.web.user.model.User;
import com.tmall.web.user.service.UserService;

/**
 * 用户组件，身份授权
 * @author 甘新革
 *
 */
@Component(value = "securityRealm")
public class SecurityRealm extends AuthorizingRealm{

	@Autowired
	private UserService userService;
	/** 
     * 为当前登录的Subject授予角色和权限 
     * @see  经测试:本例中该方法的调用时机为需授权资源被访问时 
     * @see  经测试:并且每次访问需授权资源时都会执行该方法中的逻辑,这表明本例中默认并未启用AuthorizationCache 
     * @see  个人感觉若使用了Spring3.1开始提供的ConcurrentMapCache支持,则可灵活决定是否启用AuthorizationCache 
     * @see  比如说这里从数据库获取权限信息时,先去访问Spring3.1提供的缓存,而不使用Shior提供的AuthorizationCache 
     */ 
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection principals) {
		System.out.println("===检查开始====");
		SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
		return authorizationInfo;
		
		//实际的代码应该如下
//		  String currentUsername = (String)super.getAvailablePrincipal(principals);  
//	      List<String> roleList = new ArrayList<String>();  
//	      List<String> permissionList = new ArrayList<String>();  
//	      //从数据库中获取当前登录用户的详细信息  
//	      User user = userService.getByUsername(currentUsername);  
//	      if(null != user){  
//	          //实体类User中包含有用户角色的实体类信息  
//	          if(null!=user.getRoles() && user.getRoles().size()>0){  
//	              //获取当前登录用户的角色  
//	              for(Role role : user.getRoles()){  
//	                  roleList.add(role.getName());  
//	                  //实体类Role中包含有角色权限的实体类信息  
//	                  if(null!=role.getPermissions() && role.getPermissions().size()>0){  
//	                      //获取权限  
//	                      for(Permission pmss : role.getPermissions()){  
//	                          if(!StringUtils.isEmpty(pmss.getPermission())){  
//	                              permissionList.add(pmss.getPermission());  
//	                          }  
//	                      }  
//	                  }  
//	              }  
//	          }  
//	      }else{  
//	          throw new AuthorizationException();  
//	      }  
//	      //为当前用户设置角色和权限  
//	      SimpleAuthorizationInfo simpleAuthorInfo = new SimpleAuthorizationInfo();  
//	      simpleAuthorInfo.addRoles(roleList);  
//	      simpleAuthorInfo.addStringPermissions(permissionList);  
		  
	       /* SimpleAuthorizationInfo simpleAuthorInfo = new SimpleAuthorizationInfo();  
	        //实际中可能会像上面注释的那样从数据库取得  
	        if(null!=currentUsername && "mike".equals(currentUsername)){  
	            //添加一个角色,不是配置意义上的添加,而是证明该用户拥有admin角色    
	            simpleAuthorInfo.addRole("admin");  
	            //添加权限  
	            simpleAuthorInfo.addStringPermission("admin:manage");  
	            System.out.println("已为用户[mike]赋予了[admin]角色和[admin:manage]权限");  
	            return simpleAuthorInfo;  
	        }
	        //若该方法什么都不做直接返回null的话,就会导致任何用户访问/admin/listUser.jsp时都会自动跳转到unauthorizedUrl指定的地址  
	        //详见applicationContext.xml中的<bean id="shiroFilter">的配置  
	        return null;*/ 
	}
	
	/** 
     * 验证当前登录的Subject 
     * @see  经测试:本例中该方法的调用时机为LoginController.login()方法中执行Subject.login()时 
     */  
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		String username = String.valueOf(token.getPrincipal());
        String password = new String((char[]) token.getCredentials());
        // 通过数据库进行验证
        final User authentication = userService.authentication(new User(username, password));
        if (authentication == null) {
            throw new AuthenticationException("用户名或密码错误.");
        }
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(username, password, getName());
        return authenticationInfo;
	}

}
