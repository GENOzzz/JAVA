package OpenChallenge;

import java.io.*;
import java.net.*;
import java.util.*;

public class Server{
	public static void main(String[] args) {
		BufferedReader in =null;
		BufferedWriter out=null;
		ServerSocket listener = null;
		Socket socket = null;
		Scanner sc=new Scanner(System.in);//키보드 읽을 Scanner객체 생성
		try {
			listener=new ServerSocket(9999);//서버 소켓 생성
			System.out.println("연결을 기다리고 있습니다.");
			socket = listener.accept();
			System.out.println("연결되었습니다.");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				String inputMessage=in.readLine();
				if(inputMessage.equalsIgnoreCase("bye")) {
					System.out.println("클라이언트에서 bye로 연결을 종료하였음");
					break;
				}
				System.out.println("클라이언트 : "+ inputMessage);
				System.out.print("보내기 >> ");
				String outputMessage = sc.nextLine();
				out.write(outputMessage + "\n");
				out.flush();
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				sc.close();
				socket.close();
				listener.close();
			}catch(IOException e){
				System.out.println("클라이언트와 채팅중 오류가 발생했습니다.");
			}
		}
	}
}