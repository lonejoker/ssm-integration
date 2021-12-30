# 初始化项目

## maven项目

- 选择maven--webapp项目

![](https://gitee.com/zybfsyqs/project-pic/raw/master/ssm-integration/image-20211230180317572.png)

![](https://gitee.com/zybfsyqs/project-pic/raw/master/ssm-integration/image-20211230180034406.png)

- 修改`pom.xml`配置文件的jdk版本和本地一致

```java
<properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.source>1.8</maven.compiler.source>
    <maven.compiler.target>1.8</maven.compiler.target>
</properties>
```

- 配置项目的目录结构

![](https://gitee.com/zybfsyqs/project-pic/raw/master/ssm-integration/image-20211230205253947.png)

- 配置tomcat

![](https://gitee.com/zybfsyqs/project-pic/raw/master/ssm-integration/image-20211230205520302.png)

## pom依赖

- 导入依赖`pom.xml`

```xml
<dependencies>
    <!-- junit -->
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.12</version>
        <scope>test</scope>
    </dependency>
    <!-- spring配置 -->
    <!-- aop -->
    <dependency>
        <groupId>org.aspectj</groupId>
        <artifactId>aspectjweaver</artifactId>
        <version>1.9.6</version>
    </dependency>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-aop</artifactId>
        <version>5.2.1.RELEASE</version>
    </dependency>
    <!-- context -->
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-context</artifactId>
        <version>5.2.1.RELEASE</version>
    </dependency>
    <!-- web -->
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-web</artifactId>
        <version>5.2.1.RELEASE</version>
    </dependency>
    <!-- mvc -->
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-webmvc</artifactId>
        <version>5.2.1.RELEASE</version>
    </dependency>
    <!-- 单元测试 -->
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-test</artifactId>
        <version>5.2.1.RELEASE</version>
    </dependency>
    <!-- 事务 -->
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-tx</artifactId>
        <version>5.2.1.RELEASE</version>
    </dependency>
    <!-- jdbc -->
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-jdbc</artifactId>
        <version>5.2.1.RELEASE</version>
    </dependency>
    <!-- mysql -->
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <version>8.0.16</version>
    </dependency>
    <!-- servlct -->
    <dependency>
        <groupId>javax.servlet</groupId>
        <artifactId>servlet-api</artifactId>
        <version>2.5</version>
        <scope>provided</scope>
    </dependency>
    <!-- jsp -->
    <dependency>
        <groupId>javax.servlet.jsp</groupId>
        <artifactId>jsp-api</artifactId>
        <version>2.1</version>
        <scope>provided</scope>
    </dependency>
    <!-- jstl -->
    <dependency>
        <groupId>jstl</groupId>
        <artifactId>jstl</artifactId>
        <version>1.2</version>
    </dependency>
    <!-- 日志相关 -->
    <dependency>
        <groupId>log4j</groupId>
        <artifactId>log4j</artifactId>
        <version>1.2.17</version>
    </dependency>
    <dependency>
        <groupId>org.slf4j</groupId>
        <artifactId>slf4j-api</artifactId>
        <version>1.7.5</version>
    </dependency>
    <dependency>
        <groupId>org.slf4j</groupId>
        <artifactId>slf4j-log4j12</artifactId>
        <version>1.7.21</version>
    </dependency>
    <!-- mybatis -->
    <dependency>
        <groupId>org.mybatis</groupId>
        <artifactId>mybatis</artifactId>
        <version>3.4.5</version>
    </dependency>
    <dependency>
        <groupId>org.mybatis</groupId>
        <artifactId>mybatis-spring</artifactId>
        <version>1.3.0</version>
    </dependency>
    <!-- 数据库连接池 -->
    <dependency>
        <groupId>com.alibaba</groupId>
        <artifactId>druid</artifactId>
        <version>1.0.9</version>
    </dependency>
    <!-- ajax/json -->
    <dependency>
        <groupId>com.fasterxml.jackson.core</groupId>
        <artifactId>jackson-databind</artifactId>
        <version>2.9.2</version>
    </dependency>
    <dependency>
        <groupId>com.fasterxml.jackson.core</groupId>
        <artifactId>jackson-core</artifactId>
        <version>2.9.2</version>
    </dependency>
    <dependency>
        <groupId>com.fasterxml.jackson.core</groupId>
        <artifactId>jackson-annotations</artifactId>
        <version>2.9.2</version>
    </dependency>
</dependencies>
```

- 启动测试

![](https://gitee.com/zybfsyqs/project-pic/raw/master/ssm-integration/image-20211230205937606.png)

## log4j日志

- `log4j.properties`

```properties
log4j.rootLogger=info ,Console
log4j.appender.Console=org.apache.log4j.ConsoleAppender
log4j.appender.Console.layout=org.apache.log4j.PatternLayout
log4j.appender.Console.layout.ConversionPattern=%d [%t] %-5p [%c] - %m%n
log4j.logger.java.sql.ResultSet=INFO
log4j.logger.org.apache=INFO
log4j.logger.java.sql.Connection=DEBUG
log4j.logger.java.sql.Statement=DEBUG
log4j.logger.java.sql.PreparedStatement=DEBUG
```

## web配置文件

- `web.xml`

```xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns="http://java.sun.com/xml/ns/javaee"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd"
         id="WebApp_ID" version="2.5">

</web-app>
```

# spring配置

- `applicationContext.xml`

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	   xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	   xmlns:context="http://www.springframework.org/schema/context"
	   xmlns:tx="http://www.springframework.org/schema/tx"
	   xmlns:aop="http://www.springframework.org/schema/aop"
	   xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
		http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd
		http://www.springframework.org/schema/tx http://www.springframework.org/schema/tx/spring-tx.xsd
		http://www.springframework.org/schema/aop https://www.springframework.org/schema/aop/spring-aop.xsd">

</beans>
```

- 告诉服务器，自动去加载这个配置文件，当当前项目启动时就自动去加载这个配置文件，在``web.xml`中配置

```xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns="http://java.sun.com/xml/ns/javaee"
		 xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		 xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd"
		 id="WebApp_ID" version="2.5">

	<!-- 启动服务器的时候加载这个全局配置文件 -->
	<context-param>
		<param-name>contextConfigLocation</param-name>
		<!-- 指定配置文件路径 -->
		<param-value>classpath:applicationContext.xml</param-value>
	</context-param>
	<!-- 监听当前tomcat容器被启动之后去加载的这个文件，spring框架提供了一个监听器 -->
	<listener>
		<!-- 完整结构包名 -->
		<listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
	</listener>

</web-app>
```

- 测试spring容器

![](https://gitee.com/zybfsyqs/project-pic/raw/master/ssm-integration/image-20211230211817321.png)

# springmvc配置整合

- `springmvc-servlet.xml`

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	   xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	   xmlns:context="http://www.springframework.org/schema/context"
	   xmlns:mvc="http://www.springframework.org/schema/mvc"
	   xsi:schemaLocation="
        http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd
        http://www.springframework.org/schema/mvc http://www.springframework.org/schema/mvc/spring-mvc.xsd">

</beans>
```

- 配置`springmvc-servlet.xml`

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	   xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	   xmlns:context="http://www.springframework.org/schema/context"
	   xmlns:mvc="http://www.springframework.org/schema/mvc"
	   xsi:schemaLocation="
        http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd
        http://www.springframework.org/schema/mvc http://www.springframework.org/schema/mvc/spring-mvc.xsd">

	<!-- 包扫描 -->
	<context:component-scan base-package="com.xiaobai">
		<context:include-filter type="annotation" expression="org.springframework.stereotype.Controller"/>
	</context:component-scan>
	<!-- 注解扫描 -->
	<mvc:annotation-driven/>
	<!-- 静态资源 -->
	<mvc:resources mapping="/static/**" location="/static/"/>

	<!-- 视图解析器 -->
	<bean id="internalResourceViewResolver" class="org.springframework.web.servlet.view.InternalResourceViewResolver">
		<!-- 前缀 -->
		<property name="prefix" value="/WEB-INF/view/"></property>
		<!-- 后缀 -->
		<property name="suffix" value=".jsp"></property>
	</bean>
</beans>
```

- 配置`web.xml`

```xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns="http://java.sun.com/xml/ns/javaee"
		 xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		 xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd"
		 id="WebApp_ID" version="2.5">

	<!-- 过滤器 -->
	<filter>
		<filter-name>characterEncodingFilter</filter-name>
		<filter-class>org.springframework.web.filter.CharacterEncodingFilter</filter-class>
		<!-- 配置初始化参数：utf-8 -->
		<init-param>
			<param-name>encoding</param-name>
			<param-value>UTF-8</param-value>
		</init-param>
		<init-param>
			<param-name>forceRequestEncoding</param-name>
			<param-value>true</param-value>
		</init-param>
		<init-param>
			<param-name>forceResponseEncoding</param-name>
			<param-value>true</param-value>
		</init-param>
	</filter>
	<!-- 配置访问路径 -->
	<filter-mapping>
		<!-- 这里的name要和上面的name一致 -->
		<filter-name>characterEncodingFilter</filter-name>
		<url-pattern>/*</url-pattern>
	</filter-mapping>

	<!-- 启动服务器的时候加载这个全局配置文件 -->
	<context-param>
		<param-name>contextConfigLocation</param-name>
		<!-- 指定配置文件路径 -->
		<param-value>classpath:applicationContext.xml</param-value>
	</context-param>
	<!-- 监听当前tomcat容器被启动之后去加载的这个文件，spring框架提供了一个监听器 -->
	<listener>
		<!-- 完整结构包名 -->
		<listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
	</listener>


	<!-- 前端控制器 -->
	<servlet>
		<servlet-name>dispatcherServlet</servlet-name>
		<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
		<!-- 给当前的serlvet配置初始化参数，当这个serlvet什么时候被创建就什么时候加载 -->
		<init-param>
			<param-name>contextConfigLocation</param-name>
			<param-value>classpath:springmvc-servlet.xml</param-value>
		</init-param>
		<!-- 一旦服务器启动就加载当前这个servlet -->
		<load-on-startup>1</load-on-startup>
	</servlet>
	<!-- 访问url路径 -->
	<servlet-mapping>
		<!-- 这里的name要和上面的name一致 -->
		<servlet-name>dispatcherServlet</servlet-name>
		<url-pattern>/</url-pattern>
	</servlet-mapping>
</web-app>
```

- 测试

- `index.jsp`

```jsp
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <meta charset="UTF-8">
        <title>这是第一个网页</title>
    </head>
    <body>
        <h2>Hello World!</h2>
        <a href="test">测试mvc搭建</a>
    </body>
</html>
```

- `TestController.java`

```java
@Controller
public class TestController {

    @RequestMapping("/test")
    public String test() {
        return "success";
    }
}
```

- `success.jsp`

```jsp
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <meta charset="UTF-8">
        <title>mvc</title>
    </head>
    <body>
        mvc搭建成功
    </body>
</html>
```

![](https://gitee.com/zybfsyqs/project-pic/raw/master/ssm-integration/image-20211230215737777.png)

# mybatis配置整合

- `mybatis-config.xml`

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE configuration  PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
		"http://mybatis.org/dtd/mybatis-3-config.dtd">
<configuration>
	<!-- myabtis配置缓存配置，驼峰配置 -->
	<settings>
		<!-- 驼峰映射 -->
		<setting name="mapUnderscoreToCamelCase" value="true"/>
		<!-- 二级缓存 -->
		<setting name="cacheEnabled" value="true"/>
	</settings>
</configuration>
```

- `jdbc.properties`

```properties
jdbc.driverClassName=com.mysql.cj.jdbc.Driver
jdbc.url=jdbc:mysql://localhost:3306/ssm_project?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=UTC
jdbc.username=root
jdbc.password=root
```

- `applicationContext.xml`

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	   xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	   xmlns:context="http://www.springframework.org/schema/context"
	   xmlns:tx="http://www.springframework.org/schema/tx"
	   xmlns:aop="http://www.springframework.org/schema/aop"
	   xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
		http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd
		http://www.springframework.org/schema/tx http://www.springframework.org/schema/tx/spring-tx.xsd
		http://www.springframework.org/schema/aop https://www.springframework.org/schema/aop/spring-aop.xsd">

	<!-- 扫描包 -->
	<context:component-scan base-package="com.xiaobai" use-default-filters="true">
		<context:exclude-filter type="annotation" expression="org.springframework.stereotype.Controller"/>
	</context:component-scan>

	<!-- 配置jdbc -->
	<!-- 引入外部配置文件 -->
	<context:property-placeholder location="classpath:jdbc.properties"/>
	<bean class="com.alibaba.druid.pool.DruidDataSource" id="dataSource">
		<property name="driverClassName" value="${jdbc.driverClassName}"></property>
		<property name="url" value="${jdbc.url}"></property>
		<property name="username" value="${jdbc.username}"></property>
		<property name="password" value="${jdbc.password}"></property>
	</bean>

	<!-- mybatis整合：SqlSessionFactoryBean类可以完成对应数据库操作工厂的创建 -->
	<bean class="org.mybatis.spring.SqlSessionFactoryBean" id="sqlSessionFactoryBean">
		<!-- 配置连接池到工厂 -->
		<property name="dataSource" ref="dataSource"/>
		<!-- 配置mybatis核心配置文件 -->
		<property name="configLocation" value="classpath:mybatis-config.xml"></property>
		<!-- mybatis映射文件 -->
		<property name="mapperLocations" value="classpath:mappers/*.xml"></property>
	</bean>

	<!-- 通过mapper配置生成的代理类对象由spring框架管理 -->
	<!-- mapper映射的扫描类 -->
	<bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">
		<!-- 指定扫描包的结构 -->
		<property name="basePackage" value="com.xiaobai.mapper"></property>
	</bean>

	<!-- 事务配置 -->
	<bean id="transactionManager" class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
		<!-- 指定数据源 -->
		<property name="dataSource" ref="dataSource"/>
	</bean>
	<!-- 事务通知 -->
	<tx:advice id="advice" transaction-manager="transactionManager">
		<tx:attributes>
			<!-- rollback-for：异常类型 -->
			<tx:method name="*" rollback-for="java.lang.Exception"/>
		</tx:attributes>
	</tx:advice>
	<!-- 配置aop切面切点 -->
	<aop:config>
		<aop:pointcut id="pc" expression="execution(* com.xiaobai.service.*.*(..))"/>
		<aop:advisor advice-ref="advice" pointcut-ref="pc"/>
	</aop:config>


</beans>
```

- 测试`MybatisTest.java`
- 可以先把`<property name="mapperLocations" value="classpath:mappers/*.xml"></property>`注释掉

```java
public class MybatisTest {

    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SqlSessionFactory factoryBean = (SqlSessionFactory) context.getBean("sqlSessionFactoryBean");
        System.out.println(factoryBean);
    }

}
```



# 实际案例

- 创建表

```sql
CREATE TABLE t_user(
    uid INT AUTO_INCREMENT COMMENT '用户id',
    username VARCHAR(20) NOT NULL UNIQUE COMMENT '用户名',
    PASSWORD CHAR(32) NOT NULL COMMENT '密码',
    phone VARCHAR(20) COMMENT '电话号码',
    gender INT COMMENT '性别：男：1，女：0',
    age INT COMMENT '年龄',
    created_user VARCHAR(20) COMMENT '日志-创建人',
    created_time DATETIME COMMENT '日志-创建时间',
    modified_user VARCHAR(20) COMMENT '日志-最后修改执行人',
    modified_time DATETIME COMMENT '日志-最后修改时间',
    PRIMARY KEY (uid)
)ENGINE=INNODB DEFAULT CHARSET=utf8;
```

- 创建实体类`User.java`

```java
public class User {
    private Integer uid;
    private String username;
    private String password;
    private String phone;
    private Integer gender;
    private Integer age;
    private String createdUser;
    private Date createdTime;
    private String modifiedUser;
    private Date modifiedTime;

    public User() {
    }

    public User(Integer uid, String username, String password, String phone, Integer gender, Integer age, String createdUser, Date createdTime, String modifiedUser, Date modifiedTime) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.gender = gender;
        this.age = age;
        this.createdUser = createdUser;
        this.createdTime = createdTime;
        this.modifiedUser = modifiedUser;
        this.modifiedTime = modifiedTime;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getModifiedUser() {
        return modifiedUser;
    }

    public void setModifiedUser(String modifiedUser) {
        this.modifiedUser = modifiedUser;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", createdUser='" + createdUser + '\'' +
                ", createdTime=" + createdTime +
                ", modifiedUser='" + modifiedUser + '\'' +
                ", modifiedTime=" + modifiedTime +
                '}';
    }
}
```

- 创建映射文件`UserMapper.xml`

```java
public interface UserMapper {
    List<User> findUserAll();
}
```

- mappers下创建`UserMapper.xml`

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="com.xiaobai.mapper.UserMapper">
	<select id="findUserAll" resultType="com.xiaobai.pojo.User">
		select * from t_user
	</select>
</mapper>
```

- 创建service层`UserService.java`和`UserServiceImpl.java`

```java
public interface UserService {
    List<User> findUserAll();
}
```

```java
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findUserAll() {
        return userMapper.findUserAll();
    }
}
```

- 创建控制层`UserController.java`

```java
@Controller
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping("/findUserAll")
    public List<User> findUserAll() {
        return userService.findUserAll();
    }

}
```