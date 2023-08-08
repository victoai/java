package t1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class UserHandler {
	
	ArrayList<User> list = new ArrayList<>(); 
	
	void add( String  bookinfo){
		User info  = new User();
		info.setName(bookinfo);
		list.add(info);
	}
	
	
	//고객정보 변경	
	void change( String name){	
		 list.get(0).setName(name);
		
	}
	
	void showUsers(){
		System.out.println(" 고객정보 전체 조회");
		for( User user : list){
			System.out.println( user);
		}
	}
	
	User search( String name){	
		// 찾은 후 
		return  list.get(0) ;
	}
	
	
	//예약된 고객정보만 제공
	
	void showUsersRev(){
		System.out.println("예약된 정보 제공");
		for( User user : list){
			if( user.getFlag())
			  System.out.println( user);
		}
	}
	
	
	public void saveUserList(){			
		//ObjectOutputStream os  = new ObjectOutputStream( new FileWriter( "res/output.txt");		
	}
	
	
	public void ShowOrderingName(){
		
		Collections.sort( list, new Comparator<User> () {

			@Override
			public int compare(User o1, User o2) {
				return o1.getName().compareTo(o2.getName());   // 문자열의 비교
			}}); 
		
		
		//전체조회
		showUsers();
		
	}

}
