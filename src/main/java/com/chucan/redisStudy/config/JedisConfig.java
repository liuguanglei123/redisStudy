package com.chucan.redisStudy.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;

/**
 * @Author: Yeman
 * @CreatedDate: 2022-07-24-17:23
 * @Description:
 */
@Configuration
@ConfigurationProperties(prefix = "redisclient")
@Data
public class JedisConfig {

    private String host;

    private Integer port;

    @Bean
    public Jedis client(){
        System.out.println("create jedis object");
        Jedis jedis = new Jedis(host, port);
        return jedis;
    }
}
