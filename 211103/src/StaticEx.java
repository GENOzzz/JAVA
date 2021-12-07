class ArrayUtil{
	public static int[] concat(int[] a, int[] b) {	//�� ������ �迭�� �Ű������� �ϴ� �Լ� concat����
		int []c=new int[a.length+b.length];	//�ΰ��� ���� �������� ������ �迭 c ���� , ũ��� �Է¹��� �� ������ �迭�� ũ�⸦ ���Ѹ�ŭ.
		for(int i =0; i<c.length;i++) {		//c�迭�� ũ�⵿�� �ݺ�
			if(i<a.length)					//i�� a�� ũ�⺸�� �۴ٸ�
			c[i]=a[i];						//c�迭�� i��°�� a�迭�� i��°��
			else if(i>=a.length)			//i�� a�� ũ�⺸�� Ŀ���� << ���̻� a�迭�� ���Ҽ�����.
				c[i]=b[i-a.length];			//c�迭�� i��°�� b�迭�� i-a��°�� 
		}return c;							//b�迭�� �Ѿ �ٽ� 0���� �����ؾ� �ϹǷ� i�� a���̺��� ������� a�� ���̸� ���ָ鼭 b�� 0��°���� c�迭�� �Է�����
											//�Ŀ� �迭 c�� ������.
		
	}
	public static void print(int[]a) {
		System.out.print(java.util.Arrays.toString(a)); //<<<�ش� ��ɾ��
//		System.out.print("{");							//�Ʒ��� for���� ���ִµ�?
//		for(int i=0; i<a.length; i++)
//			System.out.print(a[i]+",");
//		System.out.println("}");
	}
}
public class StaticEx {
	public static void main(String[] args) {
		int[] array1= {1,5,7,9};
		int[] array2= {3,6,-1,100,77};
		int[] array3= ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);
	}

}
