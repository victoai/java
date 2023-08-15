package thread.ptp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server0 {
	ServerSocket serverSocket;
	 	
	 Socket socket;
	 BufferedReader br;
	 InputStreamReader ir;
	 
	 BufferedWriter bw;
	 OutputStreamWriter or;
	 
	 
	
	
	 public Server0() {
		 
		 try {
			serverSocket  = new ServerSocket(6100);
			System.out.println(" server waiting");
			socket = serverSocket.accept();
			System.out.println("server start");
			String clientIp = socket.getInetAddress().toString();
			
			
			System.out.println( clientIp +"방가") ;
			// 
			br  = new BufferedReader( new InputStreamReader( socket.getInputStream()));
			bw = new BufferedWriter(  new OutputStreamWriter(socket.getOutputStream()));
			dataRecv();
			dataSend();				
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // �룷�듃踰덊샇  5500~9900		 
	 }
	
	
	private void dataSend() {		 //蹂대궡湲�		
		Scanner in = new Scanner(System.in);		
		try {
			System.out.println(" 메시지 작성");
			String message  = in.nextLine();
			bw.write(message);
			bw.newLine();
			 bw.flush();    // 버퍼 비우기 및 전송
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 
	private void dataRecv() {
		try {
			String message  =br.readLine();
			System.out.println( message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	} 


	public static void main(String[] args) {
		 new Server0();

	}

}
