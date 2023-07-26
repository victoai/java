package prj1;

//열거형 선언
enum DayOfWeek {
 MONDAY,
 TUESDAY,
 WEDNESDAY,
 THURSDAY,
 FRIDAY,
 SATURDAY,
 SUNDAY
}


public class Main {
    public static void main(String[] args) {
        // 열거형 변수 선언과 할당
        DayOfWeek today = DayOfWeek.WEDNESDAY;

        // 열거형 값 사용
        switch (today) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("평일입니다.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("주말입니다.");
                break;
        }
    }
}
