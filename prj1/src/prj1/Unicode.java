package prj1;

public class Unicode {

	public static void main(String[] args) {

		char a1 = 'a';  // 문자로 표현
		char a2 = 97;  // 아스키코드로 표현
		char a3 = '\u0061';  // 유니코드로 표현	 
		test(a1, a2, a3);
		

	}

	public static void test(char a1, char a2, char a3) {
		System.out.println(a1);  // a 출력
		System.out.println(a2);  // a 출력
		System.out.println(a3);  // a 출력
	}

	 
	
 

}
