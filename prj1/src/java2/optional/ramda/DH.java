package java2.optional.ramda;

 

 
	
interface InterWalk{
	
	void Walk(int x, int y);
}

class Walkable implements InterWalk{

	@Override
	public void Walk(int x, int y) {
		
		System.out.println("x:"+x+"y:"+y+"이동합니다");		

	}
	
}
	
	
 
 public class DH{

	public static void main(String[] args) {
		
 Walkable w=new Walkable();
 w.Walk(1, 1);
 
	
	//2. 익명클래스
	
 Walkable w2=new Walkable() {
	 
	 @Override
		public void Walk(int x, int y) {
			
	    System.out.println("x:"+x+"y:"+y+"이동합니다");		

		}
	 
	 
 };
 
 
	   w2.Walk(2, 2);
	  
	  //3.람다식
	 
	    InterWalk w3=  (x, y) -> System.out.println("x:"+x+"y:"+y+"이동합니다");
	  
		w3.Walk(3, 3);
		
	

	
	
	
    }
}
