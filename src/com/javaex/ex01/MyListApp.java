package com.javaex.ex01;

public class MyListApp {

	public static void main(String[] args) {

		
		/*
		Point[] pArray = new Point[100]; // 갯수를 정해야함
		Point p00 = new Point(2, 3);
		Point p01 = new Point(12, 13);
		Point p02 = new Point(22, 23);

		pArray[0] = p00;
		pArray[1] = p01;
		pArray[2] = p02;

		for (int i = 0; i < pArray.length; i++) {
			System.out.println(pArray[i].toString());
		}
		*/
		PointList plist = new PointList();
		
		Point p01 = new Point(2,3);
		Point p02 = new Point(12, 13);
		
		plist.add(p01);
		plist.add(p02);
		
		//Point 갯수
		System.out.println(plist.size());
		
		//[1]방의 y값
		Point p = plist.get(1);
		System.out.println(p.getY());
		
		//전체 출력(toString)
		for(int i = 0 ; i < plist.size() ; i++) {
			System.out.println(plist.get(i).toString());
		}
		
		
		CircleList clist = new CircleList();
		
		Circle c01 = new Circle(3);
		Circle c02 = new Circle(11);
		
		clist.add(c01);
		clist.add(c02);
		
		//Circle 갯수
		System.out.println(clist.size());
		
		//[1]
		Circle c = clist.get(1);
		System.out.println(c.getRadius());
		
		//전체 출력
		for(int i = 0 ; i <clist.size() ; i++) {
			System.out.println(clist.get(i).toString());
		}
	}

}
