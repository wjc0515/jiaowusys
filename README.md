# 教务管理系统DEMO
>此项目为教学案例，参照宠物商店例子演示如何利用Spring MVC+Spring+Mybatis进行开发

# 更新记录
## 2018.3.22

本次更新完成管理员权限的登录界面，并显示显示学生的信息
> 需要更改宠物商店的pom文件，以及SSM的配置文件（注意要改成自己的包名）

### 步骤
1. 新建类 **domain->UserLogin**，此类对应于数据库中的userlogin表；
2. 新建接口 **persistence->UserLoginMapper**，此接口中实现**getUserLogin**方法；然后新建xml文件**UserLoginMapper.xml**，实现方法**getUserLogin**的SQL实现；
3. 新建类 **service->LoginService**，实现**getUserByNameAndPwd**方法，此方法调用**UserLoginMapper**中的**getUserLogin**方法；
4. 新建类**controller->LoginController**，调用**LoginService**中的**getUserByNameAndPwd**方法。

## 2018.4.12
本次更新完成管理员权限学生界面的添加和修改用户信息
> 日期转换问题，添加joda-time依赖
``` xml
<dependency>
	<groupId>joda-time</groupId>
	<artifactId>joda-time</artifactId>
	<version>2.9.9</version>
</dependency>
``` 


