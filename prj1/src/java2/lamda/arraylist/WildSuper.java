package java2.lamda.arraylist;

 

import java.util.*;

// Person 클래스
class Person {
    String name;

    // 기본 생성자
    Person() {
    }
	
    // 생성자 오버로딩
    Person(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

// Person 상속 Man 클래스
class Man extends Person {
	Man( String name){
		  super(name);
	 }
     
}

// Person 상속 Woman 클래스
class Woman extends Person {	
	  Woman( String name){
		  super(name);
	  }
    
}


public class WildSuper {
    public static void main(String[] args) {

        // Person
        List<Person> listP = new ArrayList<Person>();
        listP.add(new Person("이사람"));
        listP.add(new Person("김사람"));
        printData(listP); 
        printData2(listP);  

        // Man
        List<Man> listM = new ArrayList<Man>();
        listM.add(new Man("공유"));
        listM.add(new Man("스티브잡스"));
        printData(listM);  
        printData(listM);  

        // Woman
        List<Woman> listW = new ArrayList<Woman>();
        listW.add(new Woman("아이유"));
        listW.add(new Woman("김연아"));
        //  printData(listW);  //→ Man 클래스의 상위 클래스가 아니기 때문에 메소드 호출 불가
        printData2(listW);  

    }

    // Man 클래스와 그 상위 클래스로 생성된 인스턴스만 매개변수로 전달 가능
    public static void printData(List<?  super Man> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
    
    // Person 클래스와 그 하위 클래스로 생성된 인스턴스만 매개변수로 전달 가능
    public static void printData2(List<? extends Person> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

}