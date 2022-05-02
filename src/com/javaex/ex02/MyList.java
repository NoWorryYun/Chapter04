package com.javaex.ex02;

public class MyList {

	// 필드
	private Object[] oArray;
	private int crtPos;

	// 생성자
	public MyList() {
		oArray = new Object[3];
		crtPos = 0;
	}

	// GS

	
	
	// 일반
	public void add(Object obj) {
		oArray[crtPos] = obj;
		crtPos++;
	}
	
	public int size() {
		return crtPos;
	}
	
	public Object get(int index) {
		return oArray[index];
	}
}
