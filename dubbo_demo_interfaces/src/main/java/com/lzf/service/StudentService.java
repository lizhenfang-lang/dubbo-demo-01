package com.lzf.service;

import com.lzf.entity.Student;

public interface StudentService {
	/**
	 * ����id ��ȡһ��ѧ��
	 * @param id
	 * @return
	 */
	Student getById(int id);
	
	/**
	 * ��������
	 * @param n
	 * @return
	 */
	Student addAge(Student stu, int n);
}
