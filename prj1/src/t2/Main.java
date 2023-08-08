package t2;

public class Main {

	
	
	//고객정보에 대한 클래스 
	//고객정보를 조회 등록 변경, 저장시 파일에 쓰기 
	UserHandler h = new UserHandler();
	//예약정보를 관리하는 객체
	ProductHandler b = new ProductHandler();
	
	void run(){		
		//1.회원 메뉴
		System.out.println(" 프로그램시작!!!!");
		h.add("테스트");  // 사용자  등록
		h.change("테스트 변경"); 
		
		h.add("홍길동");  // 사용자  등록
		 
		
		
		//고객정보 조회
		
		h.showUsers();
		
		
		
		//2.상품등록
		b.register();
		boolean result = b.update("상품번호");
		if( result){
			System.out.println("변경완료"); 		 
		
		}
		else System.out.println("찾을 수 없다");
		
		
	   //3. 매출등록
		
		//주문정보등록	
		//고객주문금액 업데이트
		h.userTotalPrice("홍길동", 25000);
		
		
		
		//4.상품조회 베이스
		b.showBaseItem();
		
		 
	}
	
	
	
	public static void main(String[] args) {		
		//	전체적인 프로그램의 시작  run	
		Main m = new Main();
		m.run(); 
	}

}
