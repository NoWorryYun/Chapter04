package com.javaex.ex04;

import java.util.ArrayList;
import java.util.List;

public class MyListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ArrayList<Point> pList = new ArrayList<Point>();
		List<Point> pList = new ArrayList<Point>();	//linkedlist랑 호환될 수 있게
//		List<Point> pList = new LinkedList<Point>();	

		
		Point p01 = new Point(3, 5);
		Point p02 = new Point(13, 15);
		Point p03 = new Point(113, 115);
		Point p04 = new Point(100, 101);

		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
//		pList.add(c01);		//원은 담을 수 없다.

		System.out.println(pList.size());
		System.out.println(pList.get(1).getX());
		System.out.println(pList.get(1).getY());

		System.out.println(pList.get(0).toString());

		System.out.println("=============================");

		pList.remove(1); // 방번호
		// pList.remove(p02); //주소

		for (int i = 0; i < pList.size(); i++) {
			System.out.println(pList.get(i).getX());
		}
		System.out.println("=============================");
		System.out.println(pList.toString()); // Point toString() 구분할 것

		System.out.println("=============================");

		// for 다른표현법(향상된 for문)
		for (Point p : pList) { // pList 전체
			System.out.println(p.toString());
			System.out.println(p.getX());
			System.out.println(p.getY());
		}

		// p04를 2번째(방번호 1번[1]째 추가)
		// pList.add(p04);
		pList.add(1, p04);
		System.out.println(pList.toString());
		
		System.out.println("=============================");

		ArrayList<Circle> cList = new ArrayList<Circle>();
		Circle c01 = new Circle(3);
		Circle c02 = new Circle(13);
		Circle c03 = new Circle(113);
		Circle c04 = new Circle(100);

		cList.add(c01);
		cList.add(c02);
		cList.add(c03);
		cList.add(c04);

		System.out.println(cList.toString());
		
		cList.remove(1);
		System.out.println(cList.toString());

	}

}
