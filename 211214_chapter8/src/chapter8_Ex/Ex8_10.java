package chapter8_Ex;

import java.io.*;

public class Ex8_10 {
	public static void main(String[] args) {
		File src = new File("e:/school/geno/JAVA/test3/charmander.jfif");//�������ϰ��
		File dest= new File("e:/school/geno/JAVA/temp/copy1.jfif");//���纻 ���
		
		int c;
		
		try {
			FileInputStream fi=new FileInputStream(src);//���� �Է� ����Ʈ ��Ʈ�� ����
			FileOutputStream fo=new FileOutputStream(dest);//���� ��� ����Ʈ ��Ʈ�� ����
			
			while((c=fi.read())!=-1) {
				fo.write((byte)c);
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath()+"�� "+dest.getPath()+"�� �����Ͽ����ϴ�.");
		}catch(IOException e) {
			System.out.println("���� ���� ����");
		}
	}

}
