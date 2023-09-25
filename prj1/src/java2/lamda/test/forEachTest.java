package java2.lamda.test;

import java.util.ArrayList;

public class forEachTest {

	public static void main(String[] args) {
		
		
		ArrayList<String> list  = new ArrayList<>();
		
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("for");
		
		
		list.forEach(  (String item) ->{ System.out.println( item);});		
		list.forEach(  (Object item) ->{ System.out.println( item);});
		 
		list.forEach(   item  ->  System.out.println( item  ) );
			
		

	}

}
