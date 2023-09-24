package java2.generic.test;

import java.util.function.Supplier;

interface  MySupplier<T>{	
	public T get();
}


public class MySupplierTest {

	public static void main(String[] args) {
		
		//1. 내부클래스 생성하기
		class MySupplierImp  implements MySupplier<Integer>{
			@Override
			public Integer get() {
				return (int) (Math.random() * 100);
			}			
		}
		
		MySupplierImp  imp = new MySupplierImp();
		int result =imp.get(); 
		
		//2.
		MySupplier<Integer>  imp2 = new MySupplier<>(){

			@Override
			public Integer get() {
				return (int) (Math.random() * 100);
			}};		

	   int result2= imp2.get();
	   
	   
	   //3	   
	   MySupplier<Integer>  imp3=   () -> (int) (Math.random() * 100)  ;
	   int result3= imp3.get();
	   //
	   Supplier<Integer> imp4 = () -> (int) (Math.random() * 100);
	   int result4 = imp4.get();
	   
	   
	   System.out.println( result);
	   System.out.println( result2);
	   System.out.println( result3);
	   System.out.println( result4); 
	   
	   // Supplier를 사용하여 현재 날짜 및 시간을 제공하는 예제
       Supplier<String> currentDate = () -> java.time.LocalDateTime.now().toString();
       String result5= currentDate.get();
	   
	   
	}

}
