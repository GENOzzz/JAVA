package pack211116;

abstract class calculator{		//슈퍼클래스(추상)
	public abstract int add(int a,int b);	//추상메소드 add,sub,aver
	public abstract int subtract(int a,int b);
	public abstract double average(int[] a); //추상메서드 사용 이유 : 서브클래스에서 구현하도록 하기위함
}												//서브클래스가 수백개가 되어도 동일한 메소드로 호출가능.


public class Ex5_7 extends calculator{	//추상클래스를 상속받으면 추상요소들을 구현하지 않으면 선언 불가.
										//(추상이라 내용이 없기때문에)
	public int add(int a,int b) {	//calculator를 상속받은 서브클래스  Ex5_7
		return a+b;					//에서 구현한 메소드들 add, subtract, average.
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
