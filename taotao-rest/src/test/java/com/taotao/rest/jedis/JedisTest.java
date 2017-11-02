package com.taotao.rest.jedis;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;


public class JedisTest {
	
	@Test
	public void testJedisSingle(){
		Jedis jedis = new Jedis("192.168.162.128",6379);
		jedis.set("key1", "jedis test");
		String string = jedis.get("key1");
		System.out.println(string);
		//关闭jedis。
		jedis.close();
	}
	/**
	 * 使用连接池
	 * <p>Title: testJedisPool</p>
	 * <p>Description: </p>
	 */
	
	@Test
	public void testJedisPool(){
		JedisPool pool = new JedisPool("192.168.162.128",6379);
		Jedis jedis = pool.getResource();
		String string = jedis.get("key1");
		System.out.println(string);
		//关闭jedis。
		jedis.close();
		pool.close();
	}
	
	@Test
	public void testSpringJedisSingle(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
		JedisPool pool = (JedisPool) applicationContext.getBean("redisClient");
		Jedis jedis = pool.getResource();
		String string = jedis.get("key1");
		System.out.println(string);
		jedis.close();
		pool.close();
		
	}
}
