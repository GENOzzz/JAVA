package chapter8_Ex;
import java.io.*;
import java.util.*;

public class Ex8_04 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		FileWriter fout=null;
		int c;
		try {
			fout=new FileWriter("e:/school/geno/JAVA/211214_chapter8/test2.txt");//���ϰ� ����� ��¹��� ��Ʈ�� ����
			while(true) {
				String line = sc.nextLine();//��ĭ�� �����Ͽ� ���� �б�>>line�� \n������.
				if(line.length()==0)//�ٸ��Է¾��� enterŰ�� �Է��Ѱ��
					break;
				fout.write(line,0,line.length());//���� ���ڿ��� ���Ͽ� ����<<line�� ����� ���ڿ��߿� 0��°���� line.length()��ŭ
				fout.write("\r\n",0,2);
			}
			fout.close();
		}catch(IOException e) {
			System.out.println("����� ����");
		}
		sc.close();
	}
}

