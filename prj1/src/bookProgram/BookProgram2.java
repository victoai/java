package bookProgram;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class BookProgram2 {
	ArrayList<Book>  books ;
	ArrayList<Lend> lendList;
    Scanner  sc = new Scanner(System.in); 
	
    
    
    BookProgram2(){    	
    	books = new ArrayList<>();
    	lendList = new ArrayList<>();
    	loadBookInfo();
    }
    
    	
	private void loadBookInfo() {
		
		books.add( new Book("b001" ,"재미있는 책" , "유호열"));
		books.add( new Book("b002" ,"신나는  책" , "김소영"));
		books.add( new Book("b003" ,"재미있는 책" , "홍윤성"));
		books.add( new Book("b004" ,"재미있는 책" , "박초희"));
		books.add( new Book("b005" ,"재미있는 책" , "원재호"));
		books.add( new Book("b006" ,"재미있는 책" , "임영빈"));
	}	
	
	
	private void run() {
		loop1 :while( true) {
					
					System.out.println("1.대여  2. 조회   3.반납   4. 종료");
					int menu = sc.nextInt();			
					switch( menu) {			
					case 1:						
					    lend();   
						break;
					case 2:
						searchAll();
						break;
					case 3:					
						returnBook();						
						break;
					case 4:
						System.out.println(" 종료");
						break loop1;
					default:
						
					}
		}
	}
	
	
	
	private void searchAll() {		
		for(int i=0; i< lendList.size() ; i++) {
			System.out.println( lendList.get(i));
		}		
	}
	
	private void lend() {
		System.out.println();
		System.out.println("대여코드입력");
		String lendId= sc.next(); 
		
		
		System.out.print("도서코드입력");
		String bookId = sc.next();
		
	 
		boolean flag=false;
		// 책 대여가능여부 , 책상태 비교
		Book book=null;
		for(int i=0 ; i< books.size(); i++) {
			 book = books.get(i);
			if(book.getBookId().equals(bookId) && book.getState() ==1  ) {		
				book.setState(0);  // 대여불가능 상태로 변경 				 
				flag=true; 
				break;
			}					
		}				
		
		
		if(flag) {
			String lendDate = getLendDate();			
			String returnDate = getReturnDate();		
			Lend lend = new Lend(  lendId, lendDate, returnDate,  book );
			lendList.add(lend);
			System.out.println( lend);
			System.out.println( "대여되었습니다");
			
		}else {
			System.out.println("대여불가능" );
		}		
	}
	
	
	
	private void  returnBook() {
		System.out.println("반납할 대여번호를 입력하세요");
		String idLend = sc.next();
		//정상인경우
		
		//대여정보  출력하기
		for( int i=0 ; i< lendList.size() ; i++) {
			Lend lend = lendList.get(i);
			if(  lend.lendId.equals( idLend)) {
				lend.setReturnFlag(true);
				lend.book.setState(1);
				System.out.println("반납되었습니다");
				System.out.println("반납정보" +  lend);
				break;
			}
		}
	}
	
	
	
	private String getReturnDate( ) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat  sf = new SimpleDateFormat("yyyy-MM-dd");	
		// 14일후  , 일 기준 + 14 		
		cal.add(Calendar.DATE, 14);
		String returnDate =sf.format(cal.getTime());		
		return   returnDate;
		
	}
	
	private String getLendDate() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat  sf = new SimpleDateFormat("yyyy-MM-dd");	
		//현재일을 정해진 포멧으로		 
		String lendDate =sf.format(cal.getTime());		
		return   lendDate;
		
	}
		
	public static void main(String[] args) { 	 
			 new BookProgram2().run();			 
			 
			 // BookProgram2  program = new BookProgram2();
			 // program.run();
	} 
		
	 

	 

}
