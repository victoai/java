package prj1;

import java.util.Arrays;

public class ArrayDelete2 {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 2, 4, 2, 5};
        int elementToRemove = 2;

        // 배열에서 elementToRemove를 제외한 새로운 배열을 생성
        int[] newArray = removeElement(originalArray, elementToRemove);

        // 결과 출력
        System.out.println("원래 배열: " + Arrays.toString(originalArray));
        System.out.println("삭제 후 배열: " + Arrays.toString(newArray));
    }
    
    

    public static int[] removeElement(int[] array, int element) {
        // 배열에서 제거할 요소의 개수를 파악하여 새 배열의 크기 계산
        int countToRemove = 0;
        for (int value : array) {
            if (value == element) {
                countToRemove++;
            }
        }

        // 새로운 배열 생성
        int[] newArray = new int[array.length - countToRemove];

        // 요소 복사 (elementToRemove를 제외하고 나머지 요소들만 복사)
        int index = 0;
        for (int value : array) {
            if (value != element) {
                newArray[index++] = value;
            }
        }

        return newArray;
    }
}
