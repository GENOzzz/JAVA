
public class Exercise6_24 {

	public static int abs(int value) { //��ȯŸ��:int, �Լ��� abs, �Ű����� : int value
		if(value >=0) {		//�Է¹��� value�� ���� 0���� ũ�ų� ���ٸ�
			return value;	//value�� ��ȯ
		} 
		else {
			return -value; // value�� ������ ���, ��ȣ�� �����Ѵ�.
		}
	}
	
	public static void main(String[] args){
		int value = 5;
		System.out.println(value+"�� ���밪:"+abs(value));
		value = -10;
		System.out.println(value+"�� ���밪:"+abs(value));
	}
}

