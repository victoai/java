package prj1;

import java.util.Arrays;

public class ArrayEx {
	
    public static void main(String[] args) {
        int[] sourceArray = {1, 2, 3, 4, 5};
        int[] destinationArray = new int[sourceArray.length];

        // sourceArray의 모든 요소를 destinationArray로 복사
        System.arraycopy(sourceArray, 0, destinationArray, 0, sourceArray.length);

        // 결과 출력
        System.out.println("원래 배열: " + Arrays.toString(sourceArray));
        System.out.println("복사된 배열: " + Arrays.toString(destinationArray));
        
        /*
         * 
         * 
         * src: 원본 배열
			srcPos: 원본 배열에서 복사를 시작할 인덱스
			dest: 복사할 대상 배열
			destPos: 복사를 시작할 대상 배열의 인덱스
			length: 복사할 요소의 개수
         */
    }
    
}
