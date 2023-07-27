package prj1;

import java.util.Scanner;


 enum Fruit {
    APPLE,
    BANANA,
    ORANGE
}
 
 
public class EnumProgramTest { 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("과일을 선택하세요 (APPLE, BANANA, ORANGE): ");
        String userInput = scanner.next();         
        

        try {
            Fruit selectedFruit = Fruit.valueOf(userInput.toUpperCase());
            
            
            System.out.println(  "dfdfdfdf="+ selectedFruit);
            
            switch (selectedFruit) {
                case APPLE:
                    System.out.println("사과를 선택했습니다.");
                    break;
                case BANANA:
                    System.out.println("바나나를 선택했습니다.");
                    break;
                case ORANGE:
                    System.out.println("오렌지를 선택했습니다.");
                    break;
                default:
                    System.out.println("잘못된 과일을 선택했습니다.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("잘못된 입력입니다.");
        }
    }
}
