package pack211109;
class A{
	int i;
	int j;
}
class B extends A{
	int k;
	int l;
}

public class p276 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new B();
		B b=(B)a;
		if(a instanceof b) //<<<b는 현제 B데이터타입의 변수b이므로 조건자체가 잘못됨. 대문자 B라면 참.
			System.out.println("GO");
		if(b instanceof A)
			System.out.println("STOP");
	}

}
