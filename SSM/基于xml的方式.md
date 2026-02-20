## 基于xml的方式启动项目
1) config软件包：存放SpringMVC的配置文件和注册文件
2) controller包：控制器层，使用SpringMVC控制页面跳转
3) dao包：数据库访问层，存放Mybatis映射的代理接口
4) entity包：存放实体类
5) service包：业务逻辑层，注意需要手动提交事务。
6) resources/mappers：表的映射mapper
7) resources/mybatis-config.xml：mybatis的配置文件

SQL语句存放在mapper.xml中，通过接口进行代理，调用接口下的方法就能够执行相应的SQL语句。