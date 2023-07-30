package prj1.라이브러리;

public class MyMath {
	
	public static  int abs( int x){
		
		return  (x>0 )? x:  (x==0) ? 0 : -x ;
		
	}
	
	
	public static void main(String[] args){
		
	    int result=   MyMath.abs(5);	    
	    System.out.println(result);
		
	}

}
