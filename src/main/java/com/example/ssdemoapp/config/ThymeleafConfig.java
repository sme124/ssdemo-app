package com.example.ssdemoapp.config;

import org.apache.commons.io.Charsets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

@Configuration
public class ThymeleafConfig {

  @SuppressWarnings("unused")
  private final Logger log = LoggerFactory.getLogger(ThymeleafConfig.class);

  @Bean
  @Description("Thymeleaf template resolver serving HTML 5 emails")
  public ClassLoaderTemplateResolver emailTemplateResolver() {
    ClassLoaderTemplateResolver emailTemplateResolver = new ClassLoaderTemplateResolver();
    emailTemplateResolver.setPrefix("mails/");
    emailTemplateResolver.setSuffix(".html");
    emailTemplateResolver.setTemplateMode("HTML5");
    emailTemplateResolver.setCharacterEncoding(String.valueOf(Charsets.UTF_8));
    emailTemplateResolver.setOrder(1);
    return emailTemplateResolver;
  }
}
