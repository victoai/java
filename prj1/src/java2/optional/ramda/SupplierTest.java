package java2.optional.ramda;

import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {		 
				
	  //  공급 : 입력없고 반환값이 있는 매서드 
				
		Supplier<Integer>  obj  =  () -> 5;		
		int result  =obj.get();
		System.out.println( result );
		
		
		Supplier<Integer>  random  =  () -> (int) ( Math.random() *100);  // 0~99 사이의 난수 
		System.out.println( random.get());
		
		
		Supplier<String> obj2 = () -> {			
			String str="acorn";
			return str;
		};
		System.out.println( obj2.get());

		
		Supplier<String> obj3 = () -> "acorn2" ;
		System.out.println( obj3.get());	
		
		
	}

}
