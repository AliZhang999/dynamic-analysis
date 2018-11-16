package com.ali.config;

import com.zaxxer.hikari.HikariDataSource;
import org.beetl.sql.core.ConnectionSource;
import org.beetl.sql.core.ConnectionSourceHelper;
import org.beetl.sql.core.SQLManager;
import org.beetl.sql.core.db.MySqlStyle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    private DataSource getDataSource(Environment environment, String url, String username, String password) {
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setJdbcUrl(environment.getProperty(url));
        hikariDataSource.setUsername(environment.getProperty(username));
        hikariDataSource.setPassword(environment.getProperty(password));
        return hikariDataSource;
    }

    @Bean(name = "basedatasource")
    public DataSource baseDataSource(Environment environment){
        return getDataSource(environment,
                "spring.datasource.url",
                "spring.datasource.username",
                "spring.datasource.password");
    }

    @Bean(name = "master2016datasource")
    public DataSource master2016DataSource(Environment environment){
        return getDataSource(environment,
                "spring.datasource.master2016.url",
                "spring.datasource.master2016.username",
                "spring.datasource.master2016.password");
    }

    @Bean(name = "master2017datasource")
    public DataSource master2017DataSource(Environment environment){
        return getDataSource(environment,
                "spring.datasource.master2017.url",
                "spring.datasource.master2017.username",
                "spring.datasource.master2017.password");
    }

    @Bean(name = "indicator2016datasource")
    public DataSource indicator2016DataSource(Environment environment){
        return getDataSource(environment,
                "spring.datasource.indicator2016.url",
                "spring.datasource.indicator2016.username",
                "spring.datasource.indicator2016.password");
    }

    private SQLManager getSqlManager(DataSource dataSource) {
        ConnectionSource source = ConnectionSourceHelper.getSingle(dataSource);
        MySqlStyle style = new MySqlStyle();
        SQLManager sqlManager = new SQLManager(style, source);
        return sqlManager;
    }

    @Bean("baseSQLManager")
    public SQLManager getBaseSQLManager(Environment environment){
        return getSqlManager(baseDataSource(environment));
    }

    @Bean("master2016SQLManager")
    public SQLManager getMaster2016SQLManager(Environment environment){
        return getSqlManager(master2016DataSource(environment));
    }

    @Bean("master2017SQLManager")
    public SQLManager getMaster2017SQLManager(Environment environment){
        return getSqlManager(master2017DataSource(environment));
    }

    @Bean("indicator2016SQLManager")
    public SQLManager getIndicator2016SQLManager(Environment environment){
        return getSqlManager(indicator2016DataSource(environment));
    }

}
