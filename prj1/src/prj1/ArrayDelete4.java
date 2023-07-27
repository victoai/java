package prj1;

import java.util.Arrays;

public class ArrayDelete4 {
	
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int index = 2; // 삭제할 요소의 인덱스 (0부터 시작)

        // 배열에서 indexToRemove 위치의 요소를 삭제
        int[] newArray = removeItem(array, index);
        // 결과 출력
        System.out.println("원래 배열: " + Arrays.toString(array));
        System.out.println("삭제 후 배열: " + Arrays.toString(newArray));
    }

    
    
    
    public static int[] removeItem(int[] array, int index) {
     
    	// 한 개 작은 배열 생성
        int[] newArray = new int[array.length - 1];         
        
        for( int i=0; i< index; i++){
        	newArray[i]=array[i];
        }              
                        
        //new배열  삭제위치에서 마지막까지  반복
        //원본배열의 위치는 new배열위치+1 이다
        for( int i=index; i< newArray.length ;i++){
        	newArray[i]=array[i+1];
        }             
        return newArray;
        
    }
    
    
}

 