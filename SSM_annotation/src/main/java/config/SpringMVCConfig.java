package config;

/**
 * SpringMVC配置
 */

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc//开启SpringMVC
@Configuration
@ComponentScan("controller")//扫包范围，添加到IOC容器中
public class SpringMVCConfig {
}
