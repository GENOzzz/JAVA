package Exercise;

import java.io.*;
import java.net.*;
import java.util.*;

public class CalcServerEx {
	public static String calc(String exp) {
		StringTokenizer st = new StringTokenizer(exp," ");
		if(st.countTokens()!=3) return "ERROR!!!";
		
		String res="";
		int op1 = Integer.parseInt(st.nextToken());
		String opcode = st.nextToken();
		int op2=Integer.parseInt(st.nextToken());
		switch(opcode) {
		case "+":res=Integer.toString(op1+op2);
		break;
		case "-":res=Integer.toString(op1-op2);
		break;
		case "*":res=Integer.toString(op1*op2);
		break;
		case "/":res=Integer.toString(op1/op2);
		break;
		default : res="ERROR!!!";
		}
		return res;
	}
	public static void main(String[] args) {
		BufferedReader in= null;
		BufferedWriter out = null;
		ServerSocket listener = null;
		Socket socket = null;
		try {
			listener = new ServerSocket(9999);
			System.out.println("연 결 대 기 중");
			socket = listener.accept();
			System.out.println("연 결 완 료");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) {
				String inputMessage = in.readLine();
				if(inputMessage.equalsIgnoreCase("bye")){
					System.out.println("클라이언트에서 연결을 종료하였음");
					break;
				}
				System.out.println(inputMessage);
				String res = calc(inputMessage);
				out.write(res +"\n");
				out.flush();
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(socket != null)socket.close();
				if(listener !=null)listener.close();
			}catch(IOException e) {
				System.out.println("클라이언트와 채팅 중 오류가 발생했습니다.");
			}
	}
	}
}
