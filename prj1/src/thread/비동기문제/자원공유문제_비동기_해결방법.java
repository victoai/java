package thread.비동기문제;

public class 자원공유문제_비동기_해결방법 {

	
	
	static int sum=0;
	 
	
	
	public    void  run1(){
		
		 Thread t = new Thread(  new Runnable(){

			@Override
			public  void run() {
			
				for( int i=0;i<100; i++)
				{
					
					//블럭동기화 
					synchronized(this){
				 
						    sum= sum+1;
						    System.out.println( "t1"+  i    +   sum); 
					}
						
					 
					
				}
			} 
			
		 });
		 
		 
		 t.start();
		
	}
	
	
	public   void run2(){
		
		
	 
		
		 Thread t = new Thread(  new Runnable(){

			
			 
			 
			@Override
			public    void run() {
				for( int i=0;i<100; i++)
				{
					synchronized(this){
					sum= sum+1;
					System.out.println( "t2"+   i +"= "+    sum); 
					}
					
				}
			} 
			
		 });
		 t.start();
		
	}
	
	
	public static void main(String[] args) {
		
		자원공유문제_비동기_해결방법 m = new 자원공유문제_비동기_해결방법();
		m.run1();
		m.run2();
		

	}

}
