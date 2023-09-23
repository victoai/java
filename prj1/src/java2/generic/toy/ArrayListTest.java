package java2.generic.toy;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {		
		ArrayList<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		print( list); 	
		
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(3);
		//print(list2);
	}

	
	
	public	  static void print( ArrayList< ? extends  String> list) {		
		list.forEach( str -> System.out.println(str));		
	}
	
	
	 
}
