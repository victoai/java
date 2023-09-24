package java2.lamda;

interface MyConsumer{
	   void accept( String str);
}



public class MyUtils {	
	
	String[] arr ;
	
	public MyUtils() {
	 
	}
	
	MyUtils( String[] arr ){
		this.arr = arr;
	}
	
	
	public void forEach(   MyConsumer  c) {		 
		 for( int i=0; i< arr.length; i++ ) {
			 c.accept(arr[i]);
		 }		
	}
	
	
	public static void main(String[] args) {
		
		 String[] strs = {"kim", "lee" ,  "hong"};
		 MyUtils u = new MyUtils(strs );		 
		 u.forEach( (s) -> System.out.println( s));
		 
	}

}
