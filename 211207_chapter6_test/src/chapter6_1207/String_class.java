package chapter6_1207;

import java.util.StringTokenizer;

public class String_class {

	public static void main(String[] args) {
		String str1 = "abcd";
		char data [] = {'a','b','c','d'};
		String str2 = new String(data);
		String str3 = new String("abcd");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		//��Ʈ�� ���ͷ� ���̺�
		String a="Hello";
		String b="Java";
		String c="Hello";
		//���޸�
		String d=new String("Hello");
		String e=new String("Java");
		String f=new String("Hello");
		String g=d.concat(e);
		
		System.out.println(d);
		System.out.println(g);
		d=d.concat("Java");
		System.out.println(d);
		
		String h="���";
		String i="���";
		String j="���";
		int aa=h.compareTo(i);//�� ��Ʈ���� ���� ������ ���Ͽ� ������ 0 ����Ʈ���� ������ ���� ������ ������ ���
		System.out.println(aa);
		int bb=h.compareTo(j);
		System.out.println(bb);
		//��ū : �����.
		String query ="name=geno&addr=degu&age=28";
		StringTokenizer st=new StringTokenizer(query,"&");
		
	}

}
