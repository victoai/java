package prj1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTestWhile {

	public static void main(String[] args) throws IOException {
		
		
	 
		FileInputStream fin = new  FileInputStream( "data.txt" );	 
		FileOutputStream fout = new FileOutputStream( "data-copy3.txt" );
 
	 
		
		int x;		
		
		//파일의 끝  -1 ( 아스키코드값 -1 ) 값 
		
		while((  x= fin.read( )) != -1) {
			System.out.println( x );			
			fout.write(x);		 
		}
	
		fin.close();
		fout.close(); 
		
	}

}
