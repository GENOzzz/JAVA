package vector;

import java.util.*;

public class Ex7_3 {
	public static void main(String[] args) {
		//���ڿ��� ���� ������ ArrayList ����
		ArrayList<String> a=new ArrayList<String>();
		
		//Ű����κ��� 4���� �̸� �Է¹޾� ArrayList�� ����
		Scanner sc=new Scanner(System.in);//Scanner ��ü����.
		for(int i=0;i<4;i++) {
			System.out.print("�̸��� �Է��ϼ���>>");
			String s=sc.next();//����ڷκ��� �Է¹���.
			a.add(s);//ArrayList�÷��ǿ� ����
		}
		//ArrayList�� �ִ� ��� �̸� ���
		for(int i =0;i<a.size();i++) {
			String name=a.get(i);//ArrayList�� i��° ������
			System.out.print(name+" ");
		}
		//���� �� �̸� ���
		int longnameidx=0;
		for(int i=1;i<a.size();i++) {
			if(a.get(longnameidx).length()<a.get(i).length())
				longnameidx=i;
		}
		System.out.println("\n���� �� �̸��� : "+a.get(longnameidx));
		sc.close();
	}
}
