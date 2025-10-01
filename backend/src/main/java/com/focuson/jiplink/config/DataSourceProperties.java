package com.focuson.jiplink.config;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Data
@Configuration
@ConfigurationProperties(prefix = "spring.datasource")
public class DataSourceProperties {

    private String url;
    private String driverClassName;
    private String username;
    private String password;

}
