package t1;

public class Main {

	
	
	//고객정보에 대한 클래스 
	//고객정보를 조회 등록 변경, 저장시 파일에 쓰기 
	UserHandler h = new UserHandler();
	//예약정보를 관리하는 객체
	BookingHandler b = new BookingHandler();
	
	void run(){		
		//1.회원 메뉴
		System.out.println(" 프로그램시작!!!!");
		h.add("테스트");  // 사용자  등록
		h.change("테스트 변경"); 
		h.showUsers();
		
		h.add("홍길동");  // 사용자  등록
		 
		
		//2.예약등록
		b.register();
		boolean result = b.update("예약번호");
		if( result){
			System.out.println("변경완료"); 
			User user  = h.search("홍길동");    // 예약이 되면 회원정보의 예약정보의 값이 변경된다.
			user.setFlag(true);
		      
		
		}
		else System.out.println("찾을 수 없다");
		h.showUsers();
		
		
		//3.예약된 고객정보 조회 메뉴
		
		h.showUsersRev();
		
		 
	}
	
	
	
	public static void main(String[] args) {		
		//	전체적인 프로그램의 시작  run	
		Main m = new Main();
		m.run(); 
	}

}
