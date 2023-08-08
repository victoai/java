package t1;

import java.util.ArrayList;

public class BookingHandler {
	
	ArrayList<Booking> list = new  ArrayList<>();
	
	
	void register(){
		System.out.println("예약 등록");
		
		//사용자로 부터 정보를 받는다. 예약 정보를 보여준다
		// 지역, 여행지, 호텔, 날짜 선택후 예약 객체 생성
		Booking booking = new Booking();		
		list.add(booking);		
	}
	
	
	
	boolean update( String regNo){			
		// list에서 검색 찾은 book객체 정보 전달		
		return true; 
	}
	
	
	 
	

}
