import java.util.Scanner;

class Add{				//Add Ŭ����
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
class Sub{				//Sub Ŭ����
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
class Mul{				//Mul Ŭ����
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
class Div{				//Div Ŭ����
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
public class Calc {			//Calc Ŭ����
	void push(int a,int b,String c) {	//���� a,b�� ���ڿ�c�� �޴� push�Լ�����
		
		switch(c) {	//����ġ ���� ����� �Ű����� c�� �Ʒ� �� ����
		case "+":	//+�ϰ��
			Add add=new Add();	//Add��ü�� �����ϰ�
			add.calculate(a,b);	//AddŬ������ calculate�Լ��� ȣ��
			System.out.println(add.calculate(a,b));
			break;
		case "-":	//-�ϰ��
			Sub sub=new Sub();	//Sub��ü�� �����ϰ�
			sub.calculate(a,b);	//SubŬ������ calculate�Լ� ȣ��
			System.out.println(sub.calculate(a,b));
			break;
		case "*":	//*�ϰ��
			Mul mul=new Mul();	//Mul��ü�� �����ϰ�
			mul.calculate(a,b);//MulŬ������ calculate�Լ� ȣ��
			System.out.println(mul.calculate(a,b));
			break;
		case "/":	//'/'�ϰ��
			Div div=new Div(); //Div��ü����
			div.calculate(a,b);//DivŬ������ calculate�Լ� ȣ��
			System.out.println(div.calculate(a,b));
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
