package lib;

import java.util.Scanner;

public class DayMgt {
	
	static String [][]days = new String[10][5];
	static int index=0;  // 
	static int col[]= new int[5]; // 각행의 등록된 열의 개수를 저장하기 위한 배열
	static Scanner sc = new Scanner( System.in);
	

	public static void main(String[] args) {
		
		
		
		loop : while(  true){			
			
			System.out.println(  "메뉴>> 1.등록, 2조회 3.종료");
			String menu_  = sc.nextLine();			
			int menu = Integer.parseInt(menu_);
			
			
			switch( menu){
			
			case 1:
				registerDay();
				break;
			case  2:
				selectDay();
				break;
			case 5:
				break  loop;				
			}
		}
		
	
		

	}


	private static void registerDay() {
		
		System.out.println("일정을 등록");
		
		int i=0;
		
		while( true){			
			
			 System.out.println("1.일정등록, 2.메뉴로 돌어검");
			 String  menu_ = sc.nextLine();			 
			 int menu  = Integer.parseInt( menu_);				 
			
			 
			 if( menu ==2 ){
				break;
			 }
			 
			 String day  =  sc.nextLine();
 			 days[index][i]=day;
 			 i++;
 			 col[index]=i; 
 			
			 
		}
		
		index++;
		
	}


	private static void selectDay() {
		
		
		//원하는 일정 선택 		
		System.out.println("원하는 일정의 순번을 입력");
		String index_ = sc.nextLine();
		int selectedIndex = Integer.parseInt( index_);		
		
		for( int i=0; i < col[selectedIndex-1] ; i++){			
			System.out.println (  i+1  + ":" +  days[selectedIndex-1][i]);
		}
		
		
	}

}
