package chapter8_Ex;
import java.io.*;

public class Ex8_05 {

	public static void main(String[] args) {
		byte b[]= {7,51,3,4,-1,24,-1,21,11,-123,42};
		
		try {
			FileOutputStream fout=new FileOutputStream("c:\\Users\\test.txt");
			for(int i=0;i<b.length;i++)								//������ ������ �ڵ����� ����(���)�� ������ �־����.
				fout.write(b[i]);//�迭b�� ���̳ʸ��� �״�� ���.
			fout.close();
		}catch(IOException e) {
			System.out.println("e:/school/geno/JAVA/211214_chapter8/test3.txt�� ������ �� �������ϴ�. ��θ��� Ȯ���� �ּ���");
			return;
		}
		System.out.println("e:/school/geno/JAVA/211214_chapter8/test3.txt�� �����Ͽ����ϴ�.");
	}

}
