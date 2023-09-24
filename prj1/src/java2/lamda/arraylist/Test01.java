package java2.lamda.arraylist;

import java.util.ArrayList;

public class Test01 {

	public static void main(String[] args) {		 
		
	     //객체배열
	 
		ArrayList list = new ArrayList();// //	Object형	담을 수 있다. , 즉 모든자료형을 다 담을 수 있다. 
		list.add(3);
		list.add("hi");
		list.add( new Member("test01", "1234"));
		
		
		for( Object obj: list) {
			System.out.println( obj);  //  obj.toString()
		}		
		
		
		// Object  < - >  Member    (  상속관계 이므로)
		// 
		
		Object tesObj = new Member("test01", "1234");   // 가능 ,  업캐스팅( 부모형 형변화), 자동으로 해 줌 
		
		String result  = tesObj.toString();  //  부모의 toString() 호출될것이냐  , 자식의  toString()호출될것이냐 ?
		                    // override된 매서드에 한해서  실제객체의 매서드가 실행됩니다.
		
		System.out.println("결과=" + result ); 		
		
		
		
		
		//ArrayList<Member> listG = new ArrayList<Membet>();    // 1.7이후 		 
	    ArrayList<Member> listG = new ArrayList<>();    // 1.7이후 생략가능  
	    
		//listG.add(3);  //   오류 , Member객체만 담을 수 있다.
		//listG.add("hi");  //오류
		listG.add( new Member("test01", "1234"));
		
		
		//출력
		for( Member obj: listG) {
			System.out.println( obj); //  obj.toString() 매서드 호출
		}	
		

	}

}
