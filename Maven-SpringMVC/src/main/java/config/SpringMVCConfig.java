package config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/*
* 编写SpringMVC的配置文件
* 基于注解的方式启动
* */

@Configuration //表示配置文件
@ComponentScan("controller")//扫描包controller下所有的控制器类，添加到IOC容器中
public class SpringMVCConfig {

}
