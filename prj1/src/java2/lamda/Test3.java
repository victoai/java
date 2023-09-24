package java2.lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;




public class Test3 {

	public static void main(String[] args) {
		 
		
		ArrayList<Student> arrys = new ArrayList<>();
		Student a= new Student("김길동","하남시" );
		Student b= new Student("강길동","부산시" );
		Student c= new Student("나길동","제주도" );
		arrys.add(a);
		arrys.add(b);
		arrys.add(c);
		
				// 정렬		
		Collections.sort(arrys);			
 
	//	Collections.sort(arrys ,  new Comparator<Student>() {} );
		
		//1. 인터페이스를 구현한 클래스를 만들어서 , 객체를 생성
		Collections.sort( arrys,  new AddressSort());
		
		//2. 인터페이스를 익명으로 작성 , 익명객체 으로 생성
		
		Collections.sort(arrys ,  new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return  o1.address.compareTo(o2.address) ; 
			}} );
		
		
		//3. 람다식 		, 익명함수  , 익명객체의 매소드가 수행됨 
		Collections.sort(  arrys,   ( o1, o2) -> o1.address.compareTo(o2.address) );
		
	}

}
