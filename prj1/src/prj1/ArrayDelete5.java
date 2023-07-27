package prj1;

import java.util.Arrays;

public class ArrayDelete5 {
	
    public static void main(String[] args) {
    	
        int[] array = {1, 2, 3, 4, 5};
        int index = 2; // 삭제할 요소의 인덱스 (0부터 시작)
      
        
        for( int i=index+1; i< array.length; i++){
        	array[i-1]=array[i];
        }       
      
        array[array.length-1]=0;        
        
        System.out.println( Arrays.toString(array) );
        
        
        
    }    
    
}

 