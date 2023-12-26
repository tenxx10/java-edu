package chapter19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket; 
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
	public static void main(String[] args) {
		
		
		try {
			//키보드 입력
			BufferedReader sysin = new BufferedReader(new InputStreamReader(System.in));
			//서버 아이피 127.0.0.1  로컬
			InetAddress serverIP = InetAddress.getByName("127.0.0.1"); 
			
			while(true) {
				// 한줄 읽기
				String data = sysin.readLine();  //한줄 읽어옴
				DatagramSocket dataSocket = new DatagramSocket();
				//문자열을 바이트 배열에 저장
				byte [] msg1 = data.getBytes();
				 
				//서버로 전송
				DatagramPacket outPacket = new DatagramPacket(msg1, msg1.length, serverIP, 9220);
				dataSocket.send(outPacket);
				//소켓 닫기 
				dataSocket.close();
				
			
			}
			
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
	}

}
