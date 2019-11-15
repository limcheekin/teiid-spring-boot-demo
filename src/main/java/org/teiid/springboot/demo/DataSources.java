package org.teiid.springboot.demo;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSources {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.symbols")
    public DataSource symbols() {
        return DataSourceBuilder.create().build();
    }
} 