package java2.lamda;

import java.util.ArrayList;

public class ArrayListRamda {

	public static void main(String[] args) {


		ArrayList<String>  list = new ArrayList<>();		
		
		list.add("one");
		list.add("two");
		list.add("three");				
		
		list.forEach( str  -> System.out.println( str));

		
	}

}
