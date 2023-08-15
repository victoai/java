package thread.비동기문제;

public class 자원공유문제_비동기 {

	
	
	static int sum=0;
	 
	
	
	
	
	public synchronized  void run1(){
		
		 Thread t = new Thread(  new Runnable(){

			@Override
			public void run() {
			
				for( int i=0;i<200; i++)
				{
					sum= sum+1;
					System.out.println( "t"+  i    +   sum); 
				}
			} 
			
		 });
		 
		 
		 t.start();
		
	}
	
	
	public  void run2(){
		
		
	 
		
		 Thread t = new Thread(  new Runnable(){

			
			 
			 
			@Override
			public void run() {
				
				for( int i=0;i<200; i++)
				{
					sum= sum+1;
					System.out.println( "t2"+   i +"= "+    sum); 
				}
			} 
			
		 });
		 t.start();
		
	}
	
	
	public static void main(String[] args) {
		
		자원공유문제_비동기 m = new 자원공유문제_비동기();
		m.run1();
		m.run2();
		

	}

}
