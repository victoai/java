package thread.Mythread_박혜리;

public class MusicThread extends Thread{
	@Override
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println("음악재생중: "+i);
		}		
	}
}
