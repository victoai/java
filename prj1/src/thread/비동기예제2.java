package thread;

import javax.swing.JOptionPane;

public  class 비동기예제2 {
	public static void main(String[] args)  	{
		 

		Thread tt = new Thread( new Runnable(){

			@Override
			public void run() {
				String input = JOptionPane.showInputDialog("아무 값이나 입력하세요."); 
				System.out.println("입력하신 값은 " + input + "입니다.");
				
			}});
	
		
		tt.start();
		MyThread3 th1 = new MyThread3();
		th1.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		th1.interrupt();
		
	
	}
}

class MyThread3 extends Thread {
	public void run() {
		for(int i=10; i > 0; i--) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch(Exception e ) {
				
			}
		}
	}
}