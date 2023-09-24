package java2.lamda;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[]args ){
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("hi1");
		list.add("hi2");
		list.add("hi3");
		
		//		
		list.forEach( str -> System.out.println( str));  // 소비  : 입력있고, 반환이 없는 것
		
		
		for( String str: list) {
			System.out.println( str);
		}
		
	}
	
}
