package com.javaex.ex06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {

		//set을 만든다
		Set<Integer> iSet = new HashSet<Integer>();
		
		//반복한다 (set의 갯수가 6보다 작을 때 까지
		while(true) {
			
			if(iSet.size()>=6) {
				break;
			}
			
			//번호를 생성한다.
			int num = (int) (Math.random() * 45) + 1;
			
			//set에 add한다.
			iSet.add(num);
		}
		System.out.println("==========================");
		for(Integer num : iSet) {
			System.out.println(num);
		}
		
	}

}
