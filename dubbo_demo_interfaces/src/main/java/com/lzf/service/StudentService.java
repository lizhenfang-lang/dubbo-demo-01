package com.lzf.service;

import com.lzf.entity.Student;

public interface StudentService {
	/**
	 * 根据id 获取一个学生
	 * @param id
	 * @return
	 */
	Student getById(int id);
	
	/**
	 * 增加年龄
	 * @param n
	 * @return
	 */
	Student addAge(Student stu, int n);
}
