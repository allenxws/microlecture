package com.microlecture;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Created by xuwushun on 2016/10/12.
 */
@Configuration
@ComponentScan(basePackages = "com.microlecture")
public class AppConfig {
	@Bean
	public static PooledDataSource pooledDataSource() {
		PooledDataSource pooledDataSource = new PooledDataSource();
		pooledDataSource.setUrl("jdbc:mysql://192.168.0.120:3306/suerpay");
		pooledDataSource.setUsername("writeuser");
		pooledDataSource.setPassword("writeuser");
		pooledDataSource.setDriver("com.mysql.cj.jdbc.Driver");
		pooledDataSource.setPoolMaximumActiveConnections(100);
		return pooledDataSource;
	}

	@Bean
	public static SqlSessionFactoryBean sqlSessionFactoryBean() {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(pooledDataSource());
		return sqlSessionFactoryBean;
	}

	@Bean
	public static MapperScannerConfigurer mapperScannerConfigurer() {
		MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
		mapperScannerConfigurer.setBasePackage("com.suerpay");
		mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactoryBean");
		mapperScannerConfigurer.setAddToConfig(true);
		return mapperScannerConfigurer;
	}

	@Bean
	public static JedisPoolConfig jedisPoolConfig() {
		JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
		jedisPoolConfig.setMaxTotal(100);
		jedisPoolConfig.setMaxIdle(5);
		jedisPoolConfig.setMaxWaitMillis(1000 * 5);
		jedisPoolConfig.setTestOnBorrow(true);
		return jedisPoolConfig;
	}

	@Bean
	public static JedisPool jedisPool() {
		JedisPool jedisPool = new JedisPool(jedisPoolConfig(), "192.168.0.119", 5757, 1000, "suerpay");
		return jedisPool;
	}

	@Bean
	public static Jedis jedis() {
		Jedis jedis = jedisPool().getResource();
		return jedis;
	}

}
