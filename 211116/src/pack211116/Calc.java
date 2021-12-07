package pack211116;

import java.util.Scanner;
abstract class calcul{
	abstract void setValue(int a,int b);
	abstract int calculate();
}

class Add extends calcul{				//Add Ŭ����
	int a,b;
	public void setValue(int a,int b) {
		this.a=a;
		this.b=b;
	}
	public int calculate() {
		return a+b;
	}
}

class Sub extends calcul{				//Sub Ŭ����
	int a,b;
	void setValue(int a,int b) {
		this.a=a;
		this.b=b;
	}
	public int calculate() {
		return a-b;
	}

}

class Mul extends calcul{				//Mul Ŭ����
	int a,b;
	void setValue(int a,int b) {
		this.a=a;
		this.b=b;
	}
	public int calculate() {
		return a*b;
	}
}

class Div extends calcul{				//Div Ŭ����
	int a,b;
	void setValue(int a,int b) {
		this.a=a;
		this.b=b;
	}
	public int calculate() {
		return a/b;
	}
}

public class Calc {			//Calc Ŭ����
	void push(int a,int b,String c) {	//���� a,b�� ���ڿ�c�� �޴� push�Լ�����
		
		switch(c) {	//����ġ ���� ����� �Ű����� c�� �Ʒ� �� ����
		case "+":	//+�ϰ��
			Add add=new Add();	//Add��ü�� �����ϰ�
			add.setValue(a, b);
			add.calculate();	//AddŬ������ calculate�Լ��� ȣ��
			System.out.println(add.calculate());
			break;
		case "-":	//-�ϰ��
			Sub sub=new Sub();	//Sub��ü�� �����ϰ�
			sub.setValue(a, b);
			sub.calculate();	//SubŬ������ calculate�Լ� ȣ��
			System.out.println(sub.calculate());
			break;
		case "*":	//*�ϰ��
			Mul mul=new Mul();	//Mul��ü�� �����ϰ�
			mul.setValue(a, b);
			mul.calculate();//MulŬ������ calculate�Լ� ȣ��
			System.out.println(mul.calculate());
			break;
		case "/":	//'/'�ϰ��
			Div div=new Div(); //Div��ü����
			div.setValue(a, b);
			div.calculate();//DivŬ������ calculate�Լ� ȣ��
			System.out.println(div.calculate());
			break;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("�������� �����ڸ� �Է��Ͻÿ�>>");
			int a = scan.nextInt();
			int b = scan.nextInt();
			String c= scan.next();
			Calc calc=new Calc();
			calc.push(a,b,c);
		scan.close();
	}

}