package lib;

import java.util.Arrays;

public class Yak {

	public static int[] yak( int num){
		
		
			int[] yak = new int[20]; 

	        int j = 0; // 배열시작 0...19
	        int m = num/2;
	        for (int i = 1; i <= m; i++) {   //   i:  12  => 12/1  ~12/12   
	            if (num % i == 0){//약수 구하는식 
	                yak[j] = i; // i 가 배열에 들어가게함
	                j++;	
	            }
	        }
	        
	        //j가 약수의개수
	        
	        yak[j]=num;
	        int[] yak_result= new int[j+1];	        
	        System.arraycopy(yak, 0, yak_result, 0, j+1);
	        
	        System.out.println(   Arrays.toString(yak));
	        return yak_result;
	        
	}
	
	
	public static void main(String[] args){
		
		 int[] result  = yak(12);		 
		 System.out.println(   Arrays.toString(result));
		
		
	}

}
