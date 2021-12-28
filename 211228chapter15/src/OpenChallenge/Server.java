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
		Scanner sc=new Scanner(System.in);//Ű���� ���� Scanner��ü ����
		try {
			listener=new ServerSocket(9999);//���� ���� ����
			System.out.println("������ ��ٸ��� �ֽ��ϴ�.");
			socket = listener.accept();
			System.out.println("����Ǿ����ϴ�.");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				String inputMessage=in.readLine();
				if(inputMessage.equalsIgnoreCase("bye")) {
					System.out.println("Ŭ���̾�Ʈ���� bye�� ������ �����Ͽ���");
					break;
				}
				System.out.println("Ŭ���̾�Ʈ : "+ inputMessage);
				System.out.print("������ >> ");
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
				System.out.println("Ŭ���̾�Ʈ�� ä���� ������ �߻��߽��ϴ�.");
			}
		}
	}
}