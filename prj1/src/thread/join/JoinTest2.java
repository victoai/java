package thread.join;

public class JoinTest2 {

	
	
	public static void main(String[] args) {
		
		
		
		Thread t  =new Thread( new Runnable() {

			@Override
			public void run() {
				while( !Thread.currentThread().isInterrupted()){
					   for( int i =0 ;i<100; i++)
						   System.out.println( Thread.currentThread().getName() + i);
				}
			}});
		
		t.start();
		
		
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			System.out.println(" 스레드가 중지 되었ㅇ ");
		}
		
		t.interrupt();
		System.out.println("main !!!!");
		
		

	}

}
