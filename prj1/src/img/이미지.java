package img;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class 이미지 {

	public static void main(String[] args) {
		
		
		try {
			FileInputStream f = new FileInputStream("res/a.png");
			
			
			f.read();
			f.read();
			
			
			f.read();
			f.read();
			f.read();
			f.read();
			
			f.read();
			f.read();
			f.read();
			f.read();
			
			 
			
			
			int n1=f.read();
			int n2=f.read();
			int n3=f.read();
			int n4=f.read();
			
			
			
			int n5=f.read();
			int n6=f.read();
			int n7=f.read();
			int n8=f.read();
			
			
			
		int width =  (n1<<0) & 0x000000ff  |  (n2<<8) & 0x0000ff00  |( n3<< 16) & 0x00ff0000  | ( n4<<24) & 0xff000000 ;
		int height = n5<<0 |  n6<<8  | n7<< 16 | n8<<24;
		
		
		
		System.out.println(    width);
		System.out.println(    height);
		
		// 12 12747008    byte  ->  1024     12k   
		
		 
		
		
		 
		
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
