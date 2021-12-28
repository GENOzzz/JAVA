package Exercise;

import java.io.*;
import java.net.*;
import java.util.*;

public class CalcClientEx {

	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		Socket socket = null;
		Scanner sc = new Scanner(System.in);
		try {
			socket = new Socket("localhost",9999);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				System.out.print("계산식(빈칸으로 띄워 입력, Ex>24 + 45) >>");
				String outputMessage = sc.nextLine();
				if(outputMessage.equalsIgnoreCase("bye")) {
					out.write(outputMessage+ "\n");
					out.flush();
					break;
				}
				out.write(outputMessage+ "\n");
				out.flush();
				String inputMessage=in.readLine();
				System.out.println("계산 결과 : "+inputMessage);
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				sc.close();
				if(socket != null) socket.close();
			}catch(IOException e) {
				System.out.println("서버와의 채팅중 오류가 발생했습니다.");
				}
			}
		}
}

