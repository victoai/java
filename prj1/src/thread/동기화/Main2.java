package thread.동기화;

public class Main2 {

	
	
	static int sum=0;
	 
	
	
	public   void  run1(){
		
		 Thread t = new Thread(  new Runnable(){

			@Override
			public void run() {
			
				for( int i=0;i<10000; i++)
				{
					
					//블럭동기화 
					
					 synchronized (this) {
						    sum= sum+1;
							System.out.println( "t"+  i    +   sum); 
						
					}
					
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
		
		Main2 m = new Main2();
		m.run1();
		m.run2();
		

	}

}
