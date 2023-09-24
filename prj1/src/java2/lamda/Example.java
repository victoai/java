package java2.lamda;

/*
 * 실습과제
 * 1. 함수형인터페이스 만들기 ,예시)   AddInterface  
 * 2. 함수형인터페이스 구현  ,  클래스이름, 익명, 람다
 * 
 */


//이 인터페이스에는 하나의 매서드만 작성해야 함  => 함수형인터페이스
 interface AddInterface{
	 int add( int x, int y);	 
 }

 
 class AddInterfaceImp implements AddInterface{

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}
	 
 }
 
 
 
public class Example {	
	
	public static void main(String[] args) {		
	//1.	
	AddInterfaceImp imp  = new AddInterfaceImp();
	int result1= imp.add(5, 3);	
	
	//2. 익명클래스	
	AddInterface  imp2 = new AddInterface() {

		@Override
		public int add(int x, int y) {
			// TODO Auto-generated method stub
			return x+y;
		}
		
	};
	
	int result2 = imp2.add(5, 3);
	
	//3.람다식으로 작성
	AddInterface  imp3 = (x,y) -> x+y;
    int result3 = imp3.add(5, 3);
    
    System.out.println( result1);
    System.out.println( result2);
    System.out.println( result3);
    
    

	}

}
