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
		if(a instanceof b) //<<<b�� ���� B������Ÿ���� ����b�̹Ƿ� ������ü�� �߸���. �빮�� B��� ��.
			System.out.println("GO");
		if(b instanceof A)
			System.out.println("STOP");
	}

}
