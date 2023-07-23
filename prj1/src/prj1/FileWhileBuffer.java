package prj1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWhileBuffer {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream srcFis = new  FileInputStream( "res/data.txt" );	 
		FileOutputStream copyFos = new FileOutputStream( "res/data-copy6.txt" );
		
	 
		//buffer사용하기
		byte[] bs = new byte[4];
		
		int x;		
		
		while(( x = srcFis.read(bs)) != -1) {
			System.out.println( x );
		    copyFos.write(bs,0,x);
		 
		}
	
		srcFis.close();
		copyFos.close(); 
		
	}

}
