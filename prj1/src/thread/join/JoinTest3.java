package thread.join;

public class JoinTest3 {

	
	
	public static void main(String[] args) {
		
		
		
		Thread t  =new Thread( new Runnable() {

			@Override
			public void run() {
			 
					   for( int i =0 ;i<1000000000000L; i++)
						   System.out.println( Thread.currentThread().getName() + i);
					   
					   
					   if( Thread.currentThread().isInterrupted()){
						   System.out.println("인터럽트 발생되어 종료함");
						   return;
					   }
			 
			}});
		
		t.start();
		
		
  
	 
		  try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		  t.interrupt();  // 2초가 끝나면 인터럽트 발생
		
		System.out.println("main !!!!");
		
		

	}

}
