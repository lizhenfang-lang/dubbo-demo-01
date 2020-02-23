package com.lzf.service.Impl;

import com.lzf.service.MathService;


public class MathServiceImpl implements MathService{

	@Override
	public int jia(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int jian(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int cheng(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public int chu(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

}
