package thread;

public class 자동저장_데몬쓰레드2   {
	 boolean autoSave = false; 
	

	public void autoSave() {
		System.out.println("작업파일이 자동저장되었습니다.");
	}
	
	
	//스레드를 생성하고 실행하는 코드  ( 3초마다 자동저장하는 스레드)
	public void threadRun(){
		Thread t = new Thread(new Runnable(){

			public void run() {
				while(true) {
					try { 
						Thread.sleep(3 * 1000);	// 3초마다
					} catch(InterruptedException e) {}	

					// autoSave의 값이 true이면 autoSave()를 호출한다.
					if(autoSave) {
						autoSave();
						autoSave=false;
					}
				}
			}

		 });
		t.setDaemon(true);		// 이 부분이 없으면 종료되지 않는다.
		t.start();

	}
	
	
	public static void main(String[] args) {
		자동저장_데몬쓰레드2  p = new 자동저장_데몬쓰레드2();
		p.threadRun();		
		p.autoFlagSwitch();
		
	}


	public   void autoFlagSwitch() {
		 // 일정시간이 지나면  autoSave=true로 변경
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