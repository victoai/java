package java2.lamda;

import java.util.function.BiFunction;

//이 인터페이스에는 하나의 매서드만 작성해야 함  => 함수형인터페이스
 
 
 class BiImp implements BiFunction<Integer, Integer, Integer>{

	@Override
	public Integer apply(Integer t, Integer u) {
		// TODO Auto-generated method stub
		return null;
	} 
 }
 
 
 
public class Example2 {	
	
	public static void main(String[] args) {		
	//1.	
		BiImp imp  = new BiImp();
	   int result1= imp.apply(5, 3);	
	
	//2. 익명클래스	
	   BiFunction<Integer, Integer, Integer>  imp2= new BiFunction<>() {

		@Override
		public Integer apply(Integer t, Integer u) {
			// TODO Auto-generated method stub
			return t+u;
		}	 
		
	};
	
	int result2 = imp2.apply(5, 3);
	
	//3.람다식으로 작성
	BiFunction<Integer,Integer,  Integer> imp3 = (x,y) -> x+y;
    int result3 = imp3.apply(5, 3);
    
    System.out.println( result1);
    System.out.println( result2);
    System.out.println( result3);
    
    

	}

}
