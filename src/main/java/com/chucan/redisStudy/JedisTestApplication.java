package com.chucan.redisStudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @Author: Yeman
 * @CreatedDate: 2022-07-24-16:11
 * @Description:
 */
@SpringBootApplication
public class JedisTestApplication extends SpringBootServletInitializer {

    public static void main(final String[] args){
        SpringApplication.run(JedisTestApplication.class,args);
    }

    @Override
    protected SpringApplicationBuilder configure(final SpringApplicationBuilder application) {
        return application.sources(JedisTestApplication.class);
    }
}
