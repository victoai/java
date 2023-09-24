package MyArrays;

import java.util.Comparator;

public class MyArraysGTest {

	public static void main(String[] args) {

		Score[] arr = new Score[3];		
		arr[0]= new Score("이길동",90,71);
		arr[1]= new Score("김길동",70,99);
		arr[2]= new Score("박길동",90,89);
		MyArrays.sort( arr);
		
		
		for( int i=0 ;  i< arr.length ; i++ ) {
			System.out.println(  arr[i]);
		} 
		
		
		
		
		
		class ComparatorImp    implements Comparator<Score>{

			@Override
			public int compare(Score o1, Score o2) {
				return o1.getEng()-o2.getEng();
			}			
		}
		
		
		MyArraysG.sort(arr,  new  ComparatorImp());
		

		MyArraysG.sort(arr, new Comparator< >(){
			@Override
			public int compare(Score o1, Score o2) {
				return o1.getKor()-o2.getKor();
		 }});
		 
		
		
		//람다식
		MyArraysG.sort(arr, (o1, o2) -> o1.getKor() - o2.getKor());
		
		 
 
		
		
	}

}
