package com.springboot.jwt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@EnableWebMvc
@Configuration
public class MvcConfig implements WebMvcConfigurer {

//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
//        registry.addResourceHandler("/templates/**").addResourceLocations("classpath:/templates/");
//        super.addResourceHandlers(registry);
//    }
//
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/index");
//        registry.addViewController("/user");
//        registry.addRedirectViewController("/","/templates/login.html");
//// registry.addStatusController("/403", HttpStatus.FORBIDDEN);
//        super.addViewControllers(registry);
//    }
}
