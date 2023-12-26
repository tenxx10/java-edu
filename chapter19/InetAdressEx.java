package chapter19;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAdressEx {

	public static void main(String[] args) {
		
		try {
			//getbyname 메서드로 Inetadress 쓰기
			InetAddress ip = InetAddress.getByName("www.google.co.kr");
			System.out.println("hostname:"+ip.getHostAddress());
			
			//getallname 메서드로 Inetadress 객체 배열 생성 할거임........
			InetAddress [] ips = InetAddress.getAllByName("www.google.co.kr");
			for (InetAddress i : ips) {
				System.out.println("ip 주소 :"+ i);
			}
			
			// ip 주소값을 byte[] 배열로 리턴
			byte [] ipAddr = ip.getAddress();
			//byte 자료형의 표현범위 128~127
			//127 이상의 값은 음수로 표현됨
			
			for (byte b : ipAddr) {
				System.out.print(((b <0 ) ? b + 256 : b ) + ".");
			}
			System.out.println();
			
			//getLocalHost로 adress 객체 생성ㅁ ㅊ
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내 컴퓨터 ip : "+local);
			
			//getByAdress로 객체 생성
			InetAddress ip2 = InetAddress.getByAddress(ips[0].getAddress());
			System.out.println(ips[0].getHostAddress()+"주소:"+ip2);
			
			
			
		} catch (UnknownHostException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
}
