package com.charles.blogs;

import org.activiti.spring.boot.SecurityAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wangshengli
 */
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class CharlesBlogsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CharlesBlogsApplication.class, args);
    }

}
