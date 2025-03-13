package com.cjh;

import com.cjh.config.AppConfig;
import com.cjh.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Auther: 程佳辉
 * @Date: 2025/3/13 16:29
 * @Description:
 */
public class test {

	public static void main(String[] args) {
		try {
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
			UserService userService = context.getBean(UserService.class);
			userService.test();
		} catch (Exception e) {
			e.printStackTrace();  // 打印出具体异常
		}
	}
}
