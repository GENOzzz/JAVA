package chapter8_Ex;
import java.io.*;

public class Ex8_01 {

	public static void main(String[] args) {
		FileReader fin = null;
		try {
			fin=new FileReader("c:/windows/system.ini");//���� �Է� ��Ʈ�� ����
			int c;
			while((c=fin.read())!=-1) {//�� ���ھ� ���� ������ ���� //���� ���� ������ -1�� ����.
				System.out.print((char)c);
			}
			fin.close();
		}catch(IOException e) {
			System.out.println("����� ����!");
		}

	}

}
