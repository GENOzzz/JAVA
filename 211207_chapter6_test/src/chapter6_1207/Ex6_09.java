package chapter6_1207;

import java.util.StringTokenizer;

public class Ex6_09 {

	public static void main(String[] args) {
															//�����ڷ� "/"���
		StringTokenizer st = new StringTokenizer("ȫ�浿/��ȭ/ȫ��/����/����","/");
		
		while(st.hasMoreTokens())//��ū�� �ִµ���
			System.out.println(st.nextToken());//���� ��ū ���
	}

}
