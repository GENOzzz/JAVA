import java.util.Scanner;

class Add{				//Add 클래스
	int a,b;
	void setValue(int a,int b) {
		this.a=a;
		this.b=b;
	}
	int calculate(int a,int b) {
		this.a=a;
		this.b=b;
		return a+b;
	}
}
class Sub{				//Sub 클래스
	int a,b;
	void setValue(int a,int b) {
		this.a=a;
		this.b=b;
	}
	int calculate(int a,int b) {
		this.a=a;
		this.b=b;
		return a-b;
	}
}
class Mul{				//Mul 클래스
	int a,b;
	void setValue(int a,int b) {
		this.a=a;
		this.b=b;
	}
	int calculate(int a,int b) {
		this.a=a;
		this.b=b;
		return a*b;
	}
}
class Div{				//Div 클래스
	int a,b;
	void setValue(int a,int b) {
		this.a=a;
		this.b=b;
	}
	int calculate(int a,int b) {
		this.a=a;
		this.b=b;
		return a/b;
	}
}
public class Calc {			//Calc 클래스
	void push(int a,int b,String c) {	//정수 a,b와 문자열c를 받는 push함수선언
		
		switch(c) {	//스위치 문을 사용해 매개변수 c로 아래 비교 실행
		case "+":	//+일경우
			Add add=new Add();	//Add객체를 생성하고
			add.calculate(a,b);	//Add클래스의 calculate함수를 호출
			System.out.println(add.calculate(a,b));
			break;
		case "-":	//-일경우
			Sub sub=new Sub();	//Sub객체를 생성하고
			sub.calculate(a,b);	//Sub클래스의 calculate함수 호출
			System.out.println(sub.calculate(a,b));
			break;
		case "*":	//*일경우
			Mul mul=new Mul();	//Mul객체를 생성하고
			mul.calculate(a,b);//Mul클래스의 calculate함수 호출
			System.out.println(mul.calculate(a,b));
			break;
		case "/":	//'/'일경우
			Div div=new Div(); //Div객체생성
			div.calculate(a,b);//Div클래스의 calculate함수 호출
			System.out.println(div.calculate(a,b));
			break;
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("두정수와 연산자를 입력하시오>>");
			int a = scan.nextInt();
			int b = scan.nextInt();
			String c= scan.next();
			Calc calc=new Calc();
			calc.push(a,b,c);
		scan.close();
	}

}
