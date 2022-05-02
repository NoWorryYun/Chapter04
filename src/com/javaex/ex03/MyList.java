package com.javaex.ex03;

public class MyList<T> {

	// 필드
	private T[] oArray;
	private int crtPos;

	// 생성자
	public MyList() {
		this.oArray = (T[])new Object[3];
		this.crtPos = 0;
	}

	// GS

	
	
	// 일반
	public void add(T obj) {
		oArray[crtPos] = obj;
		crtPos++;
	}
	
	public int size() {
		return crtPos;
	}
	
	public T get(int index) {
		return oArray[index];
	}
}
