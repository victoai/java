package java2.lamda.foreach;

import java.util.function.Consumer;

public class MyUtils2 {	
	
	String[] arr ;
	
	public MyUtils2() {
	 
	}
	
	MyUtils2( String[] arr ){
		this.arr = arr;
	}
	
	
	public void forEach(   Consumer< String >  c) {		 
		 for( int i=0; i< arr.length; i++ ) {
			 c.accept(arr[i]);
		 }		
	}
	
	
	public static void main(String[] args) {
		
		 String[] strs = {"kim", "lee" ,  "hong"};
		 MyUtils2 u = new MyUtils2(strs );		 
		 u.forEach( (s) -> System.out.println( s));
		 
	}

}
