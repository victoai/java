package thread.join;

public class JoinTest {

	
	
	public static void main(String[] args) {
		
		
		
		Thread t  =new Thread( new Runnable() {

			@Override
			public void run() {
				   for( int i =0 ;i<100; i++)
					   System.out.println( Thread.currentThread().getName() + i);
			}});
		
		t.start();
		
		System.out.println("main !!!!");
		
		

	}

}
