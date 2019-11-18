package com.epam.crm.config;

import org.h2.Driver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
@PropertySource(value = "classpath:sql/db-config.yml")
@EnableAspectJAutoProxy
public class DataBaseConfig extends WebMvcConfigurationSupport {

  @Value("${db.url}")
  private String url;
  @Value("${db.username}")
  private String userName;
  @Value("${db.password}")
  private String password;
  @Value("${db.driver-class-name}")
  private Driver driver;
  @Value("${classpath:sql/schema.sql}")
  private Resource schemaScript;




}
