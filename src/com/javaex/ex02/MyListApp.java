package com.javaex.ex02;

public class MyListApp {

	public static void main(String[] args) {

		MyList plist = new MyList();

		// 포인트 관리
		Point p01 = new Point(3, 5);
		Point p02 = new Point(13, 15);

		plist.add(p01);
		plist.add(p02);

		System.out.println(plist.size());
		System.out.println(plist.get(0).toString());

		System.out.println("-----------------------------");
		for (int i = 0; i < plist.size(); i++) {
//			System.out.println(plist.get(i).toString());

			// x값만 출력하고 싶을 때
			Point p = (Point) plist.get(i);
			System.out.println(p.getX());
		}
		System.out.println("-----------------------------");
		System.out.println("-----------------------------");

		// 원 관리
		MyList clist = new MyList();
		
		Circle c01 = new Circle(5);
		Circle c02 = new Circle(10);

		clist.add(c01);
		clist.add(c02);

		System.out.println(clist.size());
		System.out.println(clist.get(0).toString());
		
		System.out.println("-------------------------------");
		for(int i = 0 ; i < clist.size() ; i++) {
			System.out.println(clist.get(i).toString()); 
			System.out.println(((Circle)clist.get(i)).getRadius());
		}
	}
}
