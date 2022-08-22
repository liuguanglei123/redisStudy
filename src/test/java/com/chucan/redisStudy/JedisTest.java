package com.chucan.redisStudy;

import org.junit.AfterClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.annotation.Resource;
import java.util.List;

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

    @Autowired
    private JedisPool jedisPool;

    @Test
    public void ping(){
        String pong = client.ping();
        System.out.println(pong);
    }

    @Test
    public void lpush(){
        Long len = client.lpush("animal:list","dog","cat","pig");
        System.out.println(len);

        List<String> lrange = client.lrange("animal:list", 0, 1);
        lrange.forEach(System.out::println);
    }

    @Test
    public void testJedisPool(){
        Jedis jedis = jedisPool.getResource();

        String pong = jedis.ping();
        System.out.println(pong);
    }

}
