package com.cjh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Auther: 程佳辉
 * @Date: 2025/3/13 16:29
 * @Description:
 */
@Service
public class UserService {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Transactional
	public void test() {
		int i = 0;
		jdbcTemplate.execute("insert into user_info(user_name,password,create_time,update_time,create_by,update_by) values('1','1',NOW(),NOW(),'1','1')");
		throw new RuntimeException();
	}
}
