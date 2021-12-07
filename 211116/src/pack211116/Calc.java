package pack211116;

import java.util.Scanner;
abstract class calcul{
	abstract void setValue(int a,int b);
	abstract int calculate();
}

class Add extends calcul{				//Add 클래스
	int a,b;
	public void setValue(int a,int b) {
		this.a=a;
		this.b=b;
	}
	public int calculate() {
		return a+b;
	}
}

class Sub extends calcul{				//Sub 클래스
	int a,b;
	void setValue(int a,int b) {
		this.a=a;
		this.b=b;
	}
	public int calculate() {
		return a-b;
	}

}

class Mul extends calcul{				//Mul 클래스
	int a,b;
	void setValue(int a,int b) {
		this.a=a;
		this.b=b;
	}
	public int calculate() {
		return a*b;
	}
}

class Div extends calcul{				//Div 클래스
	int a,b;
	void setValue(int a,int b) {
		this.a=a;
		this.b=b;
	}
	public int calculate() {
		return a/b;
	}
}

public class Calc {			//Calc 클래스
	void push(int a,int b,String c) {	//정수 a,b와 문자열c를 받는 push함수선언
		
		switch(c) {	//스위치 문을 사용해 매개변수 c로 아래 비교 실행
		case "+":	//+일경우
			Add add=new Add();	//Add객체를 생성하고
			add.setValue(a, b);
			add.calculate();	//Add클래스의 calculate함수를 호출
			System.out.println(add.calculate());
			break;
		case "-":	//-일경우
			Sub sub=new Sub();	//Sub객체를 생성하고
			sub.setValue(a, b);
			sub.calculate();	//Sub클래스의 calculate함수 호출
			System.out.println(sub.calculate());
			break;
		case "*":	//*일경우
			Mul mul=new Mul();	//Mul객체를 생성하고
			mul.setValue(a, b);
			mul.calculate();//Mul클래스의 calculate함수 호출
			System.out.println(mul.calculate());
			break;
		case "/":	//'/'일경우
			Div div=new Div(); //Div객체생성
			div.setValue(a, b);
			div.calculate();//Div클래스의 calculate함수 호출
			System.out.println(div.calculate());
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