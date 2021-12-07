
public class valuepassing {
	static void increase(int m) {
		m=m+1;
		System.out.println(m);
	}
	static int decrease(int m) {
		m=m-1;
		System.out.println(m);
		return m;
	}
	static int sum(int a,int b) {
		return a+b;
	}
	static int summ(int a,int b) {
		return 10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		increase(n);
		System.out.println(n);
		System.out.println("---");
		decrease(n);
		System.out.println(n);
		System.out.println("---");
		int m=100;
		sum(n,m);
		System.out.println(n);
		System.out.println(m);
		System.out.println(sum(n,m));
		System.out.println(summ(n,m));
	}

}
