package com.lzf.service.Impl;

import com.lzf.entity.Student;
import com.lzf.service.StudentService;

public class StudentServiceImpl implements StudentService {

	@Override
	public Student getById(int id) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setAge(20);
		student.setId(id);
		student.setName("����" + id);
		return student;
	}

	@Override
	public Student addAge(Student stu,int n) {
		// TODO Auto-generated method stub
		//��������
		stu.setAge(stu.getAge()+n);
		return stu;
	}

}