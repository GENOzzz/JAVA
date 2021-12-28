package OpenChallenge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client extends Thread{

	public static void main(String[] args) {
		BufferedReader in =null;
		BufferedWriter out=null;
		Socket socket = null;
		Scanner sc=new Scanner(System.in);//키보드 읽을 Scanner객체 생성
		try {
			socket=new Socket("localhost", 9999);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				System.out.print("보내기 >> ");
				String outputMessage = sc.nextLine();
				if(outputMessage.equalsIgnoreCase("bye")) {
					out.write(outputMessage+"\n");
					out.flush();
					break;
				}
				out.write(outputMessage + "\n");
				out.flush();
				String inputMessage=in.readLine();
				System.out.println("서버 : "+inputMessage);
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				sc.close();
				if(socket !=null) socket.close();
			}catch(IOException e) {
				System.out.println("서버와의 채팅중 오류가 발생했습니다.");
			}
		}		
	}
}
