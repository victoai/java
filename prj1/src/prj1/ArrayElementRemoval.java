package prj1;

import java.util.Arrays;

public class ArrayElementRemoval {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int elementToRemove = 3;

        // 배열에서 elementToRemove를 제외한 새로운 배열을 생성
        int[] newArray = removeElement(originalArray, elementToRemove);

        // 결과 출력
        System.out.println("원래 배열: " + Arrays.toString(originalArray));
        System.out.println("삭제 후 배열: " + Arrays.toString(newArray));
    }

    public static int[] removeElement(int[] array, int element) {
        // 배열에서 제거할 요소의 인덱스 찾기
        int indexToRemove = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                indexToRemove = i;
                break;
            }
        }//2

        // 배열에 제거할 요소가 없는 경우 원래 배열 반환
        if (indexToRemove == -1) {
            return array;
        }

        // 새로운 배열 생성
        int[] newArray = new int[array.length - 1];

        // 요소 복사 (삭제할 요소 이전까지 복사)
        System.arraycopy(array, 0, newArray, 0, indexToRemove);//2
        
        // 삭제할 요소 이후의 요소들 복사  //3                       //2             // 5- 2 -1 => 
        System.arraycopy(array, indexToRemove + 1, newArray, indexToRemove, array.length - indexToRemove - 1);

        return newArray;
    }
}
