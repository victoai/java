package com.woo.acron.oop;

public class InCapsulation {
	
	private String 필드1;
	private String 필드2;
	
	
	
	//생성자
	public InCapsulation(){
		
	}
	
	
	
	//생성자는 객체가 생성될 떄  new 될 때 단 한번 호춛됨( 객체의 멤버변수 값의 초기화를 담당)
	
	public InCapsulation( String 필드1, String 필드2){
		
		this.필드1 =필드1;
		this.필드2 =필드2;
		
		
	}
	
	

	//멤버변수를 다루는 기능  , 매서드 ,
	
	// toString이 호출시  생성된 객체의 정보가 전달됨,  this라는 참조형변수가 그 값을 저장함
	// 매서드는 첫번째 매개변수로 this가 준비됨
	@Override
	//public String toString( InCapculation this) {
	public String toString() {
		
		return   "객체정보 제공=>" +   this.필드1+ this.필드2 ;		
		//return   "객체정보 제공=>" +   필드1+ 필드2 ;	 (this는 생략할 수 있음)
	}
	
	
}
