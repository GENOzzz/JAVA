class A{
	A(){
		System.out.println("������A");
	}
	A(int a){
		System.out.println("a�� ����������B");
	}
}
class B extends A{
	B(){  ///A�� �⺻�����ڰ� ���ٸ� �����Ϸ����� >>> �θ� �����ڿ� �Ű������� ���� �����ڰ� �����Ƿ� ���� �� ����.
		System.out.println("������B");
	}
	B(int a){
		super(a); //<<< super�� ����Ͽ� �Ű����� �ϳ��ִ� A�� ȣ���Ͽ��޶�� ������ �������. 
				  //super�� ���ٸ� �⺻������ A�� ȣ���� <<< ���� super���� ����� �׳� ������A�� ��µ�.
				  //������ ù�ٿ� ���� �־����.<<<ȣ��Ǿ����� �θ�Ŭ������ �ٷ� �Ѿ�� ������.
		System.out.println("a�� ����������B");
	}
}
public class constructorEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		B c=new B(3);
		
	}

}
