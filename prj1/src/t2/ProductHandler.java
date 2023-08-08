package t2;

import java.util.ArrayList;

public class ProductHandler {
	
	 
	 // 배열 초기화 가능
	  Product[][] list  = new Product[10][10];
	
	
	  ProductHandler(){		
		 //상품정보  베이스  0행
		list[0][0]= new Product("기초sk",30000);
		list[0][1]= new Product("기초sk",30000);
		list[0][2]= new Product("기초sk",50000);
		list[0][3]= new Product("기초sk",30000);
		list[0][4]= new Product("기초sk",30000);
		list[0][5]= new Product("기초sk",30000);
		list[0][6]= new Product("기초sk",30000);
		list[0][7]= new Product("기초sk",30000);
		list[0][8]= new Product("기초sk",30000);
		list[0][9]= new Product("기초sk",30000);
		
		
		//
		 //상품정보  색조 1행
		list[1][0]= new Product();
		list[1][1]= new Product();
		list[1][2]= new Product();
		list[1][3]= new Product();
		list[1][4]= new Product();
		list[1][5]= new Product();
		list[1][6]= new Product();
		list[1][7]= new Product();
		list[1][8]= new Product();
		list[1][9]= new Product();
		
		//
		
		//
		 //상품정보  색조 2행
		list[2][0]= new Product();
		list[2][1]= new Product();
		list[2][2]= new Product();
		list[2][3]= new Product();
		list[2][4]= new Product();
		list[2][5]= new Product();
		list[2][6]= new Product();
		list[2][7]= new Product();
		list[2][8]= new Product();
		list[2][9]= new Product();
		
		
	 
	}
	  
	//상품등록	
	void register(){ 		
		//몇행 몇열 정보 필요함 
		System.out.println(" 상품등록");		 
		Product product = new Product();			
		list[3][0]= product;
		 	
	}
	
	
	//상품정보수정
	boolean update( String goodsNo){			
		// 몇행 몇열 정보 확인
		return true; 
	}
	
	
	
	public void showBaseItem(){		
		for( Product  p : list[0]){
			System.out.println( p );
		}
	}
	
	
	public void showColorItem(){
		
		for( Product  p : list[1]){
			System.out.println( p );
		}
	}
	
	 
	
	public void showPerfumeItem(){
		
		for( Product  p : list[2]){
			System.out.println( p );
		}
	}
	
	 
	

}
