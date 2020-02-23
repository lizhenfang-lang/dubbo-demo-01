package com.lzf;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lzf.service.MathService;


public class MathConsumer {
	private static ClassPathXmlApplicationContext context;
	private static MathService service;
	public static void main(String[] args) {
		context=new ClassPathXmlApplicationContext("classpath:ApplicantionContext.xml");
		service=context.getBean(MathService.class);
		
		System.out.println("相加的结果是"+service.jia(2,3));
		
	System.out.println("相减的结果是"+service.jian(2,3));
		
	System.out.println("相乘的结果是"+service.cheng(2,3));
		
	System.out.println("相除的结果是"+service.chu(9,3));
	}
	
}
