package prj1;

import java.util.Arrays;

public class ArrayDelete3 {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int indexToRemove = 2; // 삭제할 요소의 인덱스 (0부터 시작)

        // 배열에서 indexToRemove 위치의 요소를 삭제
        int[] newArray = removeElement(originalArray, indexToRemove);
        // 결과 출력
        System.out.println("원래 배열: " + Arrays.toString(originalArray));
        System.out.println("삭제 후 배열: " + Arrays.toString(newArray));
    }

    
    
    public static int[] removeElement(int[] array, int index) {
        // 새로운 배열 생성
        int[] newArray = new int[array.length - 1];
        // 삭제할 요소 이전까지 복사
        System.arraycopy(array, 0, newArray, 0, index);
        // 삭제할 요소 이후의 요소들 복사
        System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);  // 8-6
        return newArray;
    }
    
    
}


// 0 1 2 3 4 5 6 7
//             *

// 0 1 2 3 4 
//   *
// 5-1=> 4-1 => 3