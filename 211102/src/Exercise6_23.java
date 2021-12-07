class Exercise6_23{
	public static int max(int[] arr) {
		if(arr==null || arr.length==0)	//arr�� null�̰ų� ���̰� 0�̶�� 
			return -999999;				//-999999��ȯ
		int max = arr[0]; // �迭�� ù ��° ������ �ִ밪�� �ʱ�ȭ �Ѵ�.
		for(int i=1; i< arr.length;i++) { // �迭�� �� ��° ������ ���Ѵ�.
			if(arr[i] > max)	//arr[i]��°�� ���� max(���� �����arr[0]���� ����)���� ũ�ٸ�
				max = arr[i];	//max�� arr[i]��°������ ����
		}
		return max;  //for�� �ݺ��� max��ȯ.<<<���� ū���� ��.
	}
	public static void main(String[] args)
	{
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("�ִ밪:"+max(data));
		System.out.println("�ִ밪:"+max(null));
		System.out.println("�ִ밪:"+max(new int[]{})); // ũ�Ⱑ 0�� �迭
	}
}
