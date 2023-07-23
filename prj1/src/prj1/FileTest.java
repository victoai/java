package prj1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		
		
	 
		FileInputStream fin = new  FileInputStream( "data.txt" );	 
		FileOutputStream fout = new FileOutputStream( "data-copy1.txt" );
  
		
		int x;			
	    x= fin.read( )  ;
		System.out.println( x );			
		fout.write(x);
	
	    x= fin.read( )  ;
		System.out.println( x );			
		fout.write(x);

	    x= fin.read( )  ;
		System.out.println( x );			
		fout.write(x);
		
	    x= fin.read( )  ;
		System.out.println( x );			
		fout.write(x);
		
	    x= fin.read( )  ;
		System.out.println( x );			
		fout.write(x);
		
	    x= fin.read( )  ;
		System.out.println( x );			
		fout.write(x);
		
	    x= fin.read( )  ;
		System.out.println( x );			
		fout.write(x);
		
	    x= fin.read( )  ;
		System.out.println( x );			
		fout.write(x);
		
	    x= fin.read( )  ;
		System.out.println( x );			
		fout.write(x);
		
	    x= fin.read( )  ;
		System.out.println( x );			
		fout.write(x);
		 
			
		 
	
		fin.close();
		fout.close(); 
		
	}

}
