package chapter8_Ex;
import java.io.*;
public class Ex8_02_03 {

	public static void main(String[] args) {
		String fileload="e:/school/geno/java/211214_chapter8/hangul.txt";
		InputStreamReader in =null;
		FileInputStream fin=null;
		try {
			fin=new FileInputStream(fileload);//�����ε� ����.
			in = new InputStreamReader(fin,"UTF-8");//�ùٸ� ���� ���� ����
			int c;								 	//����� �ؽ�Ʈ�� ���ڵ����� �����;���.
			
			System.out.println("���ڵ� ���� ������ "+in.getEncoding());
			while((c=in.read())!=-1) {
				System.out.print((char)c);
			}
			System.out.println("");
			
			fin=new FileInputStream(fileload);//read�ϰ� ���� ������;
			in=new InputStreamReader(fin,"MS949");
			int d;
			System.out.println("���ڵ� ���� ������"+in.getEncoding());
			while((d=in.read())!=-1) {
				System.out.print((char)d);//�ش� ������ utf8�� ������ ������ �����߻�.
			}
			in.close();
			fin.close();
		}catch (IOException e) {
			System.out.println("����� ���� !");	
		}

	}

}
