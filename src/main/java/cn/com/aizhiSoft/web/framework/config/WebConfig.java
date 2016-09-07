package cn.com.aizhiSoft.web.framework.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
@Configuration
@EnableWebMvc
@ComponentScan("cn.com.aizhiSoft.web.controller")
public class WebConfig extends WebMvcConfigurerAdapter {
	
	
}
