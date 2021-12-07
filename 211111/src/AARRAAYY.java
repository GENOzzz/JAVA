
public class AARRAAYY {
	static void increase(int[]array) {
		for(int i=0;i<array.length;i++) {
			array[i]++;
		}
	}
	public static void main(String[] args) {
		int[]aa={1,2,3,4,5};
		int[]bb= {10,20,30,40,50};
		
		System.out.println(java.util.Arrays.toString(aa));
		increase(aa);
		System.out.println(java.util.Arrays.toString(aa));
		System.out.println("---------------------------");
		System.out.println(java.util.Arrays.toString(bb));
		increase(bb);
		System.out.println(java.util.Arrays.toString(bb));
		
	}

}
