package prj1;

import java.io.FileOutputStream;
import java.io.IOException;

public class CharTest2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fout = new FileOutputStream( "res/data-char.txt" );
		
		
		//텍스트파일 편집기
		//byte 값  코드값이 저장됨
		fout.write(0);
		fout.write('0');
		fout.write( 97);
		  
	}

}
