package pack211116;

abstract class calculator{		//����Ŭ����(�߻�)
	public abstract int add(int a,int b);	//�߻�޼ҵ� add,sub,aver
	public abstract int subtract(int a,int b);
	public abstract double average(int[] a); //�߻�޼��� ��� ���� : ����Ŭ�������� �����ϵ��� �ϱ�����
}												//����Ŭ������ ���鰳�� �Ǿ ������ �޼ҵ�� ȣ�Ⱑ��.


public class Ex5_7 extends calculator{	//�߻�Ŭ������ ��ӹ����� �߻��ҵ��� �������� ������ ���� �Ұ�.
										//(�߻��̶� ������ ���⶧����)
	public int add(int a,int b) {	//calculator�� ��ӹ��� ����Ŭ����  Ex5_7
		return a+b;					//���� ������ �޼ҵ�� add, subtract, average.
	}
	public int subtract(int a,int b) {
		return a-b;
	}
	public double average(int[] a) {
		int k;
		k=0;
		for(int i=0;i<a.length;i++) {
			k+=a[i];
		}
		return k/a.length;
	}

	public static void main(String[] args) {
		Ex5_7 goodc=new Ex5_7();
		System.out.println(goodc.add(2,3));
		System.out.println(goodc.subtract(2, 3));
		System.out.println(goodc.average(new int [] {2,3,4}));

	}

}
