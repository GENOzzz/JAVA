package chapter6_1207;

public class Ex6_08 {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("This");
		
		sb.append(" is pencil");//���ڿ� �����̱�
		System.out.println("���ڿ� �����̱� : "+sb);
		
		sb.insert(7, " my");//"���ڿ�" ����
		System.out.println("���ڿ� ���� : "+sb);
		
		sb.replace(8, 10, "your");//�ش� �ε����� ���ڿ��� "�����ڿ�"�� ����
		System.out.println("���ڿ� ����"+sb);
		
		sb.setLength(4);//��Ʈ������ �� ���ڿ� ���� ����.
		System.out.println("��Ʈ������ ���ڿ� ���� ���� : "+sb);
	}

}
