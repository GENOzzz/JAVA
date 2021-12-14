package chapter8_Ex;

import java.io.File;

public class Ex8_08 {
	public static void listDirectory(File dir) {
		System.out.println("----"+dir.getPath()+"�� ���긮��Ʈ �Դϴ�.----");
		
		File[] subFiles=dir.listFiles();//���丮�� ���Ե� ���ϰ� ���丮 �̸��� ����Ʈ ���.
		
		for(int i=0;i<subFiles.length;i++) {//subFiles�迭 �� file�� ���� ����
			File f=subFiles[i];
			long t=f.lastModified();//���������� ������ �ð�.
			System.out.print(f.getName());
			System.out.print("\t����ũ�� : "+f.length());//����ũ��
			System.out.printf("\t������ �ð� : %tb %td %ta %tT\n",t,t,t,t);//�������
			System.out.println(t);
		}
	}

	public static void main(String[] args) {
		File f1=new File("e:/school/geno/JAVA");
		System.out.println(f1.getPath()+", "+f1.getParent()+", "+f1.getName());
		
		String res="";
		if(f1.isFile()) res="����";//���� Ÿ���̶��
		else if(f1.isDirectory()) res="���丮";//���丮 Ÿ���̸�.
		System.out.println(f1.getPath()+"��(��) "+res+"�Դϴ�.");
		
		File f2=new File("e:/school/geno/JAVA/test2");//���� ��������ϴ� ���丮
		if(!f2.exists()) {//f2 ���丮�� �����ϴ��� �˻�
			f2.mkdir();//�������� ������ ���丮 ����
		}
		
		listDirectory(new File("e:/school/geno/JAVA/"));//temp�� �ִ� ���� ����Ʈ ���
		f2.renameTo(new File("e://school/geno/JAVA/test3"));//test2->test3�� �̸�����
		listDirectory(new File("e:/school/geno/JAVA"));//������ ����Ʈ ���
	}

}
