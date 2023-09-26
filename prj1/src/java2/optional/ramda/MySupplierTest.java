package java2.optional.ramda;

import java.util.function.Supplier;

@FunctionalInterface
interface MySupplier<T>{
	 T get();
}

public class MySupplierTest {

	public static void main(String[] args) {
       //
		/* class MySupplierImp  implements MySupplier<Integer>{

			@Override
			public Integer get() {
				// TODO Auto-generated method stub
				return 5;
			}			 
		 }
		
		 MySupplierImp  imp = new MySupplierImp();
		 int result  =imp.get();
		 System.out.println(  result);
		
				
		//2.		
		MySupplier<Integer> o1 = new MySupplier<>() {
			@Override
			public Integer get() {				 
				return 5;
			}};
		
		System.out.println( o1.get());		
		
		//3.
	 */
		
		
		
		MySupplier<Integer> obj = () ->5;
		MySupplier<Integer> obj2 =() -> (int) (Math.random()*100)  ;
		MySupplier<String>  obj3  = ()-> "화이팅";		
		
		System.out.println( obj.get());
		System.out.println( obj2.get());
		System.out.println( obj3.get());
		
	 
		Supplier<String>  s1  = ()-> "화이팅";		
		
		

	}
	
	

}
