package prj1;

import java.util.Scanner;

public class EnumNoProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("과일을 선택하세요 (APPLE, BANANA, ORANGE): ");
        String userInput = scanner.next().toUpperCase();

        if ("APPLE".equals(userInput)) {
            System.out.println("사과를 선택했습니다.");
        } else if ("BANANA".equals(userInput)) {
            System.out.println("바나나를 선택했습니다.");
        } else if ("ORANGE".equals(userInput)) {
            System.out.println("오렌지를 선택했습니다.");
        } else {
            System.out.println("잘못된 과일을 선택했습니다.");
        }
    }
}
