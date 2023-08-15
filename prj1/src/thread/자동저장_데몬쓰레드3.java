package thread;

public class 자동저장_데몬쓰레드3   {
	static boolean autoSave = false;
	

	class AutoSaveT extends Thread{	
		public void run() {
			while(true) {
				try { 
					Thread.sleep(3 * 1000);	// 3초마다
				} catch(InterruptedException e) {}	
	
				// autoSave의 값이 true이면 autoSave()를 호출한다.
				if(autoSave) {
					autoSave();
				}
			}
		}
		
	}

	

	public void autoSave() {
		System.out.println("작업파일이 자동저장되었습니다.");
	}
	
	
	public void threadRun(){
		AutoSaveT t = new AutoSaveT();
		t.setDaemon(true);		// 이 부분이 없으면 종료되지 않는다.
		t.start();
	}
	
	
	
	public static void main(String[] args) {
		 
		
		자동저장_데몬쓰레드3  p = new 자동저장_데몬쓰레드3();
		p.threadRun();
		
		for(int i=1; i <= 10; i++) {
			try{
				Thread.sleep(1000);
			} catch(InterruptedException e) {}
			System.out.println(i);
			
			if(i==5)
				autoSave = true;
		}

		System.out.println("프로그램을 종료합니다.");
	}
}

