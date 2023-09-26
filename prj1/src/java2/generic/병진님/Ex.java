package java2.generic.병진님;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Ex {

	
	
	public static void main(String[] args) {
		
	ArrayList<Good> list2= new ArrayList<>();
	
	list2.add( new Good("앞다리살", 15000,0));
	list2.add( new Good("다진마늘", 8000,0));
	list2.add( new Good("간장1ㅣ", 3000,0));
	list2.add( new Good("메로나", 500,0));
	
	
	Consumer<Integer> f2 = new Consumer<>(){

		@Override
		public void accept(Integer t) {
			int i=0;
			while( t>=500){ // 	
			 
				if( i==4) i=0;
				Good buy =list2.get(i);
				
				if( t <buy.getPrice() ){
					i++;
					continue;
				}
				i++;
				t -=buy.getPrice() ; 
				buy.count++;
			}
			
			System.out.println( list2);
		}};
	
	 f2.accept(30000);

	}
	
	 

}
