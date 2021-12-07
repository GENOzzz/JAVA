class A{
	A(){
		System.out.println("생성자A");
	}
	A(int a){
		System.out.println("a를 가진생성자B");
	}
}
class B extends A{
	B(){  ///A에 기본생성자가 없다면 컴파일러오류 >>> 부모 생성자에 매개변수가 없는 생성자가 없으므로 읽을 수 없음.
		System.out.println("생성자B");
	}
	B(int a){
		super(a); //<<< super를 사용하여 매개변수 하나있는 A를 호출하여달라고 지정을 해줘야함. 
				  //super가 없다면 기본생성자 A를 호출함 <<< 따라서 super없이 실행시 그냥 생성자A가 출력됨.
				  //생성자 첫줄에 적어 주어야함.<<<호출되었을때 부모클래스로 바로 넘어가기 때문에.
		System.out.println("a를 가진생성자B");
	}
}
public class constructorEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		B c=new B(3);
		
	}

}
