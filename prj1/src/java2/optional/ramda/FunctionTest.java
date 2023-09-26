package java2.optional.ramda;

import java.util.function.Function;

/*@FunctionalInterface
interface Function<T, R>{
	 R  apply(T  t);
}
*/

public class FunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub				
		
		
		Function<Integer, Integer>  obj =  su  -> su*su;
		
		int result  = obj.apply(3);
		System.out.println( result);
		
	}

}
