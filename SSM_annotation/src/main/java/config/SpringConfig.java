package config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Spring框架配置，相当于xml文件
 */
@Configuration//表示配置文件
@ComponentScan({"service"})//扫包范围，添加到IOC容器中
@EnableTransactionManagement//开启事务
@Import({JdbcConfig.class,MybatisConfig.class})//导入jdbc和mybatis的配置文件，配置时一起配置
@MapperScan("dao")//扫描映射
public class SpringConfig {

}
