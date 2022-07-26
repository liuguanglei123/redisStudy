package com.chucan.redisStudy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;

/**
 * @Author: Yeman
 * @CreatedDate: 2022-07-24-16:15
 * @Description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class JedisTest {

    @Autowired
    private Jedis client;

    @Test
    public void ping(){
        String pong = client.ping();
        System.out.println(pong);
    }
}
