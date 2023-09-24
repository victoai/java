package java2.lamda;

import java.util.function.Consumer;

interface MyConsumer2<T>{
	   void accept( T str);
}
 
public class MyUtils3 {	
	
	String[] arr ;
	
	public MyUtils3() {
	 
	}
	
	MyUtils3( String[] arr ){
		this.arr = arr;
	}
	
	
	public void forEach(   MyConsumer2<String>  c) {		 
		 for( int i=0; i< arr.length; i++ ) {
			 c.accept(arr[i]);
		 }		
	}
	
	
	public static void main(String[] args) {
		
		 String[] strs = {"kim", "lee" ,  "hong"};
		 MyUtils3 u = new MyUtils3(strs );		 
		 u.forEach( (s) -> System.out.println( s));
		 
	}

}
