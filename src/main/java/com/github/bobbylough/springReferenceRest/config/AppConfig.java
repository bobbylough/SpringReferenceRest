package com.github.bobbylough.springReferenceRest.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Configuration
@ComponentScan("com.github.bobbylough.springReferenceRest")
@EnableWebMvc
public class AppConfig {

}
