
class ArrayUtil1 {
	public static int [] concat(int[] a,int[] b) {//�迭a�� b�� ������ ���ο� �迭����
		int [] c= new int[a.length+b.length];
		for(int i=0;i<c.length;i++) {
			if(i<a.length) {
				c[i]=a[i];
			}else {
				c[i]=b[i-a.length];
			}
		}return c;
	}
	public static void print(int [] a) {//�迭 a���
		System.out.print("[");
		for(int i=0;i<a.length;i++) {
			System.out.print(" "+a[i]+" ");
		}
		System.out.print("]");
	}
}
public class chapter4_9{
	public static void main(String [] args) {
		int [] a1= {1,5,7,9};
		int [] a2= {3,6,-1,100,77};
		int [] a3=ArrayUtil1.concat(a1, a2);
		ArrayUtil1.print(a3);
	}
}