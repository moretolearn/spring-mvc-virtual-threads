package com.moretolearn.util;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan({ "com.moretolearn" })
public class WebConfig implements WebMvcConfigurer{

}
