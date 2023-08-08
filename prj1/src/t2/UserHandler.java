package t2;

import java.util.ArrayList;

public class UserHandler {
	
	ArrayList<User> list = new ArrayList<>(); 
	
	
	void add( String  name){
		User user  = new User();
		user.setName(name);
		list.add(user);
	}
	
	
	//고객정보 변경	
	void change( String name){	
		 list.get(0).setName(name);
		
	}
	
	void showUsers(){
		for( User user : list){
			System.out.println( user);
		}
	}
	
	User search( String name){	
		// 찾은 후 
		return  list.get(0) ;
	}
	
	
 
	void userTotalPrice( String goodsNo , int price){
		
		//고객 찾은 후 
		// 고객의 판매금액증가		
		User user  = search("홍길동");
		user.updateTotalPrice(price);	
		
	}
	
	
	public void saveUserList(){			
		//ObjectOutputStream os  = new ObjectOutputStream( new FileWriter( "res/output.txt");		
	}
	

}
