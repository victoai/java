package prj1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTestFor {

	public static void main(String[] args) throws IOException {
		
		
	 
		FileInputStream fin = new  FileInputStream( "data.txt" );	 
		FileOutputStream fout = new FileOutputStream( "data-copy2.txt" );
  
		
		int x;			
	  
		for( int i=1; i<=10 ; i++) {	
		    x= fin.read( )  ;
			System.out.println( x );			
			fout.write(x);

		}
	   
	
		fin.close();
		fout.close(); 
		
	}

}
