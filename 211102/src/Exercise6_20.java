class Exercise6_20
{
	public static int[] shuffle(int[] arr) {		//��ȯ�� : int[],�Լ��� shuffle,�Ű����� : int[] arr(�������迭),
		if(arr==null || arr.length==0)				//���� arr(�迭)�� null�̰ų� ũ�Ⱑ 0�̶�� 
			return arr;								//arr�迭 ��ȯ
		for(int i=0; i< arr.length;i++) {			//i=0���� i<arr�� ���� ���� �ݺ�
			int j = (int)(Math.random()*arr.length);//int j �� arr�� ���̸�ŭ �� arr�迭�� ũ������� ������ (0~ũ��)�� �������� �� ���� ����
			// arr[i]�� arr[j]�� ���� ���� �ٲ۴�.
			int tmp = arr[i];						//arr[i]�ڸ��� ���� tmp�� ����
			arr[i] = arr[j];						//arr[j]�ڸ��� ���� arr[i]�� ����
			arr[j] = tmp;							//tmp�� �޾Ҵ� arr[i]�ڸ��� ���� arr[j]�� ����
		}
		return arr;									//arr�迭 ��ȯ
	}
	
	public static void main(String[] args)
	{
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));	//original �迭 ���
		int[] result = shuffle(original);							//result �迭�� shuffle�� original�� �Է��� �迭
		System.out.println(java.util.Arrays.toString(result));		//result ���
	}
}