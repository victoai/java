package thread.Mythread_박혜리;


//하나의 프로그램에 여러개의 스레드어 실행해 보는  간단한 프로그램만들기
public class PhoneEx {
	//1. Thread클래스 상속받아 재정의

	public static void main(String[] args) {
		MusicThread mt = new MusicThread();
		YoutubeThread ut = new YoutubeThread();
		CameraThread ct = new CameraThread();
		mt.start();
		ct.start();
		ut.start();
		
	}

}
