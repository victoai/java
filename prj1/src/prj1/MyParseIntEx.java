package prj1;

public class MyParseIntEx {

	public static void main(String[] args) {


		
		String strNumber="253";
		
		
		//
		
		
		int result=0;
		
	
		for( int i=0; i< strNumber.length(); i++) {
			 int digitValue  = strNumber.charAt(i) -'0';
			 result = result*10 + digitValue;			
		} 
		
		
		System.out.println( result);
	}

}
