package collection_generic;

import java.util.*;

public class Ex7_05 {
	public static void main(String[] args) {
		HashMap<String,String> dic=new HashMap<String,String>();//�ؽø� ����
		//var dicc=new HashMap<String,String>();�� ������ �ᵵ��.�ڹ� �������� �̻�
		Object obj;
		//3���� (key,value)���� dic�� ����
		dic.put("baby", "�Ʊ�");//"baby�� key �Ʊ�� value
		dic.put("love","���");
		dic.put("aplle","���");
		
		//����ڷ� ���� ����ܾ �Է¹ް� �ѱ۴ܾ� �˻�."exit"�Է� ������ ����
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print("ã�� ���� �ܾ��?>>>");
			String eng=sc.next();
			if(eng.equals("exit")) {
				System.out.println("�����մϴ�...");
				break;
			}
			//�ؽøʿ��� key'eng'�� �˻� korŽ��
			String kor=dic.get(eng);//dic�� eng������ null����
			if(kor==null)
				System.out.println(eng+"���´ܾ��Դϴ�.");
			else
				System.out.println(kor);
		}
		sc.close();
	}

}
