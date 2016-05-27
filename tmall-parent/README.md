#tmall-parent
	tmall-parent 包含三个子模块(tmall-admin,tmall-core,tmall-web)，其中两个为子web项目
	1.tmall-admin为后台管理项目
	2.tmall-web为前台项目
	3.tmall-core为业务的核心实现项目，tmall-admin,tmall-web项目均依赖此项目

#内置代码生成工具(生成dao,mapper,model)
	1.自动生成代码工具的使用（由于核心的业务实现在tmall-core项目中，故将自动生成代码的工具放到此项目中）

#后端技术：
	核心框架：Spring Framework 
	持久层框架：MyBatis 
	视图框架：Spring MVC 
	安全框架：Apache Shiro 
	服务端验证：Hibernate Validator 
	任务调度：Spring Task 
	页面静态化：freemarker
	页面伪静态化：urlrewritefilter
	全文检索：Lucene
	数据库连接池：Alibaba Druid 
	缓存框架：Ehcache 、Redis
	日志管理：SLF4J 、Log4j
	工具类：Apache Commons、Jackson 、POI

#前端技术：
	MetroNic模板 (bootstrap)
	JS框架：jQuery,Angularjs
	CSS框架：Bootstrap 
	富文本：CKEcitor
	对话框：jQuery jBox
	下拉选择框：jQuery Select2
	树结构控件：jQuery zTree
	日期控件： My97DatePicker

#安全考虑
	开发语言：系统采用Java 语言开发，具有卓越的通用性、高效性、平台移植性和安全性。
	分层设计：（数据库层，数据访问层，业务逻辑层，展示层）层次清楚，低耦合
	双重验证：用户表单提交双验证：包括服务器端验证及客户端验证，防止用户通过浏览器恶意修改
	安全编码：用户表单提交所有数据，在服务器端都进行安全编码，防止用户提交非法脚本及SQL注入获取敏感数据等，确保数据安全
	密码加密：登录用户密码进行SHA1散列加密，此加密方法是不可逆的。保证密文泄露后的安全问题
	强制访问：系统对所有管理端链接都进行用户身份权限验证，防止用户直接填写url进行访问


