package prj1;

public class EnumTest3 {
	
    public static void main(String[] args) {
        int today = 3; // 1: MONDAY, 2: TUESDAY, ..., 7: SUNDAY

        if (today >= 1 && today <= 5) {
            System.out.println("평일입니다.");
        } else if (today == 6 || today == 7) {
            System.out.println("주말입니다.");
        } else {
            System.out.println("올바르지 않은 값입니다.");
        }
    }
}
