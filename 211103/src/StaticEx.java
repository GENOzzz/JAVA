class ArrayUtil{
	public static int[] concat(int[] a, int[] b) {	//두 정수형 배열을 매개변수로 하는 함수 concat선언
		int []c=new int[a.length+b.length];	//두개를 더해 저장해줄 정수형 배열 c 선언 , 크기는 입력받은 두 정수형 배열의 크기를 더한만큼.
		for(int i =0; i<c.length;i++) {		//c배열의 크기동안 반복
			if(i<a.length)					//i가 a의 크기보다 작다면
			c[i]=a[i];						//c배열의 i번째는 a배열의 i번째로
			else if(i>=a.length)			//i가 a의 크기보다 커지면 << 더이상 a배열을 비교할수없음.
				c[i]=b[i-a.length];			//c배열의 i번째는 b배열의 i-a번째로 
		}return c;							//b배열로 넘어가 다시 0부터 시작해야 하므로 i가 a길이보다 길어지면 a의 길이를 빼주면서 b의 0번째부터 c배열에 입력해줌
											//후에 배열 c를 돌려줌.
		
	}
	public static void print(int[]a) {
		System.out.print(java.util.Arrays.toString(a)); //<<<해당 명령어는
//		System.out.print("{");							//아래의 for문을 해주는듯?
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
