package day20Ex.동기화;

public class Main {

	
	
	static int sum=0;
	 
	
	
	public synchronized  void run1(){
		
		 Thread t = new Thread(  new Runnable(){

			@Override
			public void run() {
			
				for( int i=0;i<10000; i++)
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
				for( int i=0;i<10000; i++)
				{
					sum= sum+1;
					System.out.println( "t2"+   i +"= "+    sum); 
				}
			} 
			
		 });
		 t.start();
		
	}
	
	
	public static void main(String[] args) {
		
		Main m = new Main();
		m.run1();
		m.run2();
		

	}

}
