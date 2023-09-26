package java2.optional.ramda;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		 
		ArrayList<String>  list = new ArrayList<>();
		
		list.add("one");
		list.add("two");
		list.add("three");			
		list.forEach(  str  -> System.out.println( str +"님"));
	
		
	}

}
