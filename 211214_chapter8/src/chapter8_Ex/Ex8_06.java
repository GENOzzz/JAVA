package chapter8_Ex;
import java.io.*;

public class Ex8_06 {
	public static void main(String[] args) {
		byte b[]=new byte[11];//����ִ� byte�迭
		String file="e:/school/geno/JAVA/211214_chapter8/test3.txt";
		try {
			//"e:/school/geno/JAVA/211214_chapter8/test3.txt"������ �о� b�� ����
			FileInputStream fin = new FileInputStream(file);
			int n=0,c;
			while((c=fin.read())!=-1) {//-1�� ���� ��(EOF)
				b[n]=(byte)c;//���� ����Ʈ�� �迭�� ����.
				n++;
			}
			//b�� ����� ��� ���� ȭ�鿡 ���
			System.out.println(file+" ���� ���� �迭�� ����մϴ�.");
			for(int i=0;i<b.length;i++)
				System.out.print(b[i]+" ");
			System.out.println();
			fin.close();
		}catch(IOException e) {
			System.out.println(file+"���� ���� ���߽��ϴ�. ��θ��� Ȯ���� �ּ���.");
		}

	}

}
