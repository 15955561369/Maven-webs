## SpringMVC
底层由servlet封装，完成MVC模式中控制器部分。

    MVC模式=jsp(视图)+java类(连接数据库)+servlet(页面跳转)
    组成:
    1)视图:jsp、css、js、html
    2)模型:dao+service实现业务逻辑
    3)控制器:servlet页面跳转
         jsp(视图)    前端：现在流行vue，饿了么UI技术
           ↓
        servlet(控制器)   -->SpringMVC，底层由servlet封装
           ↓
        service(业务模型)  
           ↓
         dao(数据模型)  -->Mybatis/hibernate
           ↓
         数据库
### Tomcat环境
1) 可以用本地下载的Tomcat服务器
2) 也可以用Maven的插件Tomcat，在pom.xml中导入插件Tomcat。在运行配置中，添加新的maven配置，命令行添加tomcat7:run。
### 启动方式
1) 基于xml配置文件启动
2) 基于注解启动（SpringBoot后此种较多）
### 常见问题
1) 控制台输出乱码：
    先将整个项目文件设置为UTF-8编码，pom.xml中添加  
   \<properties>  
   \<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>  
   \<project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>  
   \</properties>。然后打开运行配置，设置VM选项为-Dfile.encoding=UTF-8 -Dsun.jnu.encoding=UTF-8。最后将idea控制台的编码设置为UTF-8输出即可。
