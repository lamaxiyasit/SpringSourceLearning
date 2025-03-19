package com.chengjiahui.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description TODO
 * @Auther chengjiahui
 * @Date 2025/3/2 21:39
 * @Version 1.0
 */
@Component
public class UserService {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Transactional
	public void test() {
		System.out.println("hello world");
//		jdbcTemplate.execute("insert into my_table(a,b,c) values('1','1','1')");
	}

	@Transactional(propagation = Propagation.NEVER)
	public void a() {
		jdbcTemplate.execute("insert into my_table(a,b,c) values('2','2','2')");
	}
}
