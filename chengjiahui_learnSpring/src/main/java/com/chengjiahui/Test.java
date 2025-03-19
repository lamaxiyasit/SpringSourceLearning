package com.chengjiahui;

import com.chengjiahui.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.annotation.PostConstruct;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Description TODO
 * @Auther chengjiahui
 * @Date 2025/3/2 21:40
 * @Version 1.0
 */
public class Test {
	public static void main(String[] args) throws IllegalAccessException {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService userService = (UserService) applicationContext.getBean("userService");
		userService.test();

//		UserService userService1 = new UserService();
//		Field[] declaredFields = userService1.getClass().getDeclaredFields();
//		for (Field field : declaredFields) {
//			if (field.isAnnotationPresent(Autowired.class)) {
//				field.set(userService1, null);
//			}
//		}
//
//		for (Method method : userService1.getClass().getDeclaredMethods()) {
//			if (method.isAnnotationPresent(PostConstruct.class)) {
//				method.invoke()
//			}
//		}
	}
}
