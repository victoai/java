package java2.lamda;

public class Test01 {

	public static void main(String[] args) {
	 	  //매소드안에서 class 작성할 수 있음    
	
		//1.클래스 작성 , 이름이 있는 클래스
		class MyInterfaceImp implements MyInterface {

			@Override
			public void method() {
				 System.out.println("기능을 구현합니다");
				
			}		
	 	}				
		
		MyInterfaceImp  imp = new MyInterfaceImp();
		imp.method();		
		
		//2. 익명클래스
		
	//	MyInterface  imp2 = new MyInterface() {}; 
		MyInterface  imp2 = new MyInterface() {

			@Override
			public void method() {
				 System.out.println("기능을 구현합니다");
				
			}}; 
			
		imp2.method();		
	
		
	  // 매서드  ->   람다식    (구현할 매서드가 한 개인 경우  한해서) , 익명함수 
		
		//람다식 , 익명클래스
		MyInterface  imp3 =  () -> System.out.println("기능을 구현합니다") ;			
		imp3.method();		
			

	}

}
