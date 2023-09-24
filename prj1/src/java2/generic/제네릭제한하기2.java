package java2.generic;

import java.util.ArrayList;
import java.util.List;

public class 제네릭제한하기2 {

	public static void main(String[] args) {		
		ArrayList<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		print( list); 	
		
		 
		ArrayList<Object> list2 = new ArrayList<>();
		list.add("one");
		list.add("two");
		
		
		print ( list2); 	
		//print2( list2); 	
		
		 
	}

	
	
	public	  static void print( ArrayList< ? super  String> list) {		
		list.forEach( str -> System.out.println(str));		
	}
	
	
	public	  static void print2( ArrayList<  String> list) {		
		list.forEach( str -> System.out.println(str));		
	}
	
	 
}
