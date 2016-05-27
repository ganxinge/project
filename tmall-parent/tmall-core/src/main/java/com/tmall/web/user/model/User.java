package com.tmall.web.user.model;

import java.io.Serializable;

/**
 * 
 * <p>title:</p>
 * <p>description:</p>
 * @author ganxinge
 * @date 2016年5月26日 下午2:51:27
 */
public class User implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 4194936292397014088L;

	private String userId;

    private String loginName;

    private String userType;

    private String password;

    private String userName;

    private String headImage;

    private String gender;

    private String age;

    private String phone;

    private String email;

    private String flag;

    private String orgId;

    public User(String loginName,String password){
    	this.loginName = loginName;
    	this.password = password;
    }
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }
}