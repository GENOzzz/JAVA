package chapter8_Ex;

import java.io.*;

public class Ex8_09 {

	public static void main(String[] args) {
		File src = new File("e:/school/geno/JAVA/temp/test.txt");//�������� ��θ�
		File dest = new File("e:/school/geno/JAVA/temp/test3.txt");//���� ���� ��θ�
		int c;
		try {
			FileReader fr=new FileReader(src);//���� �Է� ���� ��Ʈ�� ����
			FileWriter fw=new FileWriter(dest);//���� ��� ���� ��Ʈ�� ����
			while((c=fr.read())!=-1) {//���� �ϳ� �а�
				fw.write((char)c);//�ϳ����� //�ش� ����� ������ ū��� ����ð��� ���� �ɸ���.
			}
			fr.close();
			fw.close();
			System.out.println((src.getPath()+"�� \n"+dest.getPath()+"�� �����Ͽ����ϴ�."));
		}catch(IOException e) {
			System.out.println("���� ���� ����");
		}
	}

}
