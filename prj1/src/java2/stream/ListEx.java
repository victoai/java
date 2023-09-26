package java2.stream;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {


	 
		//List< String> alist = new ArrayList<>(); 
	    List< String> alist = new LinkedList<>(); 
		
		alist.add("one");
		alist.add("two");
		alist.add("three"); 
		
		
	   for( int i=0 ;  i< alist.size() ; i++) {
		   System.out.println( alist.get(i)) ;
	   }
		
	   
	   
		
		

	}

}
