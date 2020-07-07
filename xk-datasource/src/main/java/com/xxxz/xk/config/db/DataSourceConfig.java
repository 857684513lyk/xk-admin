package com.xxxz.xk.config.db;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/**
 * creator：djx
 * date: 2020/7/3
 */
@SpringBootConfiguration
public class DataSourceConfig {

    Logger logger = LoggerFactory.getLogger(DataSourceConfig.class);

    @Bean
    DataSource dataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("root");
        druidDataSource.setUrl("jdbc:mysql://120.25.223.121:3306/szp_db_test?serverTimezone=Asia/Shanghai");
        return druidDataSource;
    }

    @Bean
    SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) {

        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);

        try {
            Configuration configuration = sqlSessionFactoryBean.getObject().getConfiguration();
            configuration.setMapUnderscoreToCamelCase(true);
            sqlSessionFactoryBean.setConfiguration(configuration);
//            sqlSessionFactoryBean.getObject().getConfiguration().setMapUnderscoreToCamelCase(true);
            PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();

            Resource[] resource = resolver.getResources("classpath*:mybatis/mapper/**/*.xml");
            sqlSessionFactoryBean.setMapperLocations(resource);

            logger.info("DataSource=========数据库地址：" + dataSource.getConnection().getMetaData().getURL());
            return sqlSessionFactoryBean;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}
