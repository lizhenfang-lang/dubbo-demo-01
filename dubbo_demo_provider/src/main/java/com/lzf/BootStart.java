package com.lzf;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//���������ṩ��
public class BootStart {
	public static void main(String[] args) throws IOException {
		// �����������ļ�
		ClassPathXmlApplicationContext context 
		= new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
		// ���ط�������
		context.start();
		
		// ��һ������
		System.in.read();
	}
}
