package thread.ptp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client0 {

	 Socket socket;
	 BufferedReader br;
	 InputStreamReader ir;
	 
	 BufferedWriter bw;
	 OutputStreamWriter or;
	 
	 
	 
	
	public Client0() {
		 
		try {
			socket = new Socket("localhost", 6100);
			System.out.println(" connection ....");
			  
			br  = new BufferedReader( new InputStreamReader( socket.getInputStream()));
			bw = new BufferedWriter(  new OutputStreamWriter(socket.getOutputStream()));
			// 
			dataSend();
			dataRecv();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   //�꽌踰� ip , port
		
		
	}
	
	
	private void dataRecv() {
		 
		try {
			String message = br.readLine();			
			System.out.println(message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		
	}

	private void dataSend() {
		Scanner   in = new Scanner(System.in);
		
		try {
			String  message  = in.nextLine();
			bw.write(message);
			bw.newLine();
			 bw.flush();    // 버퍼 비우기 및 전송
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	public static void main(String[] args) {
		 
		new Client0();

	}

}
