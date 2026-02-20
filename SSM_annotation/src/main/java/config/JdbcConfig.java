package config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

/**
 * Jdbc配置
 */
public class JdbcConfig {
    /**
     * 获取阿里数据源
     * @return
     */
    @Bean //添加到IOC容器中
    public DataSource dataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        //设置
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://127.0.0.1:3306/ssm?serverTimezone=GMT%2B8");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("zhang159357");
        return druidDataSource;
    }

    /**
     * 获取事务管理
     * @return
     */
    @Bean
    public PlatformTransactionManager  platformTransactionManager(@Autowired DataSource dataSource) { //Autowired能够自动注入IOC容器中的属性
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource);
        return dataSourceTransactionManager;
    }
}
