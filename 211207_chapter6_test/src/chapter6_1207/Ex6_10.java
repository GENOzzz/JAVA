package chapter6_1207;

public class Ex6_10 {

	public static void main(String[] args) {
		double a=Math.PI;
		System.out.println(Math.PI);//������ ��� ���
		System.out.println(Math.ceil(a));//ceil(�ø�)
		System.out.println(Math.floor(a));//floor(����)
		System.out.println(Math.sqrt(9));//������
		System.out.println(Math.exp(2));//e�� 2��
										//e = ��2.71828182846
		System.out.println(Math.round(3.14));//�ݿø�
		
		//[1,45]������ ������ ���� 5�� �߻�
		System.out.print("�̹��� ����� ��ȣ�� ");
		int rotto[]=new int [6];
		for(int i=0;i<6;i++) {
			rotto[i]=(int)(Math.random()*45+1);
			if(i>1&&rotto[i-1]==rotto[i]) {
				i--;
			}
//			if(i==5)
//				System.out.println("�߰���ȣ : "+(int)(Math.random()*45+1));
//			else
//				System.out.print((int)(Math.random()*45+1)+" ");	
		}
		System.out.println(java.util.Arrays.toString(rotto));

	}

}
