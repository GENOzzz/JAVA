package chapter6_1207;

public class Ex6_07 {
	public static void main(String[] args) {
		String a= new String(" C#");
		String b= new String(",C++ ");
		
		System.out.println(a+"�� ���̴� "+a.length());//���ڿ��� ����(���ڰ���)
		System.out.println(a.contains("���ڿ��� ���� ���� : "+"#"));//���ڿ��� ���԰���
		
		a=a.concat(b);//���ڿ� ����
		System.out.println("���ڿ� ���� : "+a);
		
		a=a.trim();//���ڿ� �յ� ���� ����
		System.out.println("���ڿ� ���� ���� : "+a);
		
		a=a.replace("C#", "Java");//���ڿ� ��ġ
		System.out.println("���ڿ� ��ġ : "+a);
		
		String s[]=a.split("���ڿ� �и� : "+",");//���ڿ� �и�
		for(int i=0;i<s.length;i++)
			System.out.println("�и��� ���ڿ� "+i+" : "+s[i]);
		
		a=a.substring(5);//�ε��� 5���� ������ ���꽺Ʈ�� ����
		System.out.println("�ε������� ���꽺Ʈ�� ���� : "+a);
		
		char c=a.charAt(2);//�ε��� 2�� ���� ����
		System.out.println(c);
	}
}
