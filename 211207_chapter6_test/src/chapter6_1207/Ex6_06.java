package chapter6_1207;

public class Ex6_06{
	
	public static void main(String[] args) {
		int n=10;
		Integer intObject =n;//auto boxing
		//Integer intObject=Integer.valueOf(n);
		System.out.println("intObject = " + intObject);
		int m= intObject+10;//auto unboxing
		//m=IntObject.valueOf()+10
		System.out.println("m = "+ m);
	}

}
