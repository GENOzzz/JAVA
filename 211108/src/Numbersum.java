import java.util.Scanner;

class number{
	int x,y,z;
	number(){}
	number(int x,int y){
		this.x=x;
		this.y=y;
	}
	void numpic() {
		System.out.println("�̰Ǻθ�!");
	}
}
class numberA extends number{
	String A;
	numberA(){}
	numberA(int x, int y) {
		super(x, y);
	}
	void numpic() {
		System.out.println("�̰�A!");
	}
}
class numberB extends number{
	String B;
	numberB(){}
	numberB(int x, int y) {
		super(x, y);
	}
	numberB(int x, int y,String B) {
		super(x, y);
		this.B=B;
	}
}
class numberC extends number{
	String C;
	String CC;
	numberC(){}
	numberC(int x, int y) {
		super(x, y);
	}
	numberC(int x, int y,String C,String CC) {
		super(x,y);
		this.C=C;
		this.CC=CC;
	}
}


public class Numbersum {
	Scanner scan=new Scanner(System.in);
	void sum(number num,number num2) {
		int S=num.x+num2.x;
		int T=num.y+num2.y;
		System.out.println(S+" "+" "+T);
	}
	void min(numberB num, numberC num2) {
		int S=num.x+num2.x;
		int T=num.y+num2.y;
		System.out.println(S+" "+" "+T);
	}
	public static void main(String[] args) {
		Numbersum numS=new Numbersum();	
		numberB numB = new numberB(10,20,"PUMKINE");
		numberC numC = new numberC(40,35,"name","C�Դϴ�.");
		System.out.println(numC.x+" "+numC.y);
		System.out.println(numC.C+" "+numC.CC);
		
		numS.sum(numC,numB); //<<<����Ŭ���� ��ü�� ����Ŭ������ ��ü�� ����Ҽ��յ�
									//�� �׷��� ��޴��ϸ� ���Ѽ��� ��ĳ������ �Ͼ������
		number numc=numC;
		System.out.println("------------------------");
		System.out.println("numC.x+numC.y");
		System.out.println("��ĳ���õ�C "+numC.x+" "+numC.y); //<<number��ü�����ִ� x�� y�� ȣ�Ⱑ��	//"����� �����̴�"�� ��.
		System.out.println("-------------------------");
		System.out.println("��ĳ���õ�C C CC");
		System.out.println(numC.C+numC.CC); 
		System.out.println("sum.numB,numC");
		numS.sum(numB, numC);					
		System.out.println("------------------------");															
		//numS.min(numB,numC); //�Լ� min�� numberB,C ��ü�� ������ �ޱ⿡ ��ĳ���õ� B,C�ºҰ�<<<��ĳ������ �߱⶧���� ����Ŭ������ ����Ŭ������ ��ü�� ���X
		numB=(numberB)numB; //	��											//"������ ����̴�"�� �Ұ����Ѱ�ó��.
		numC=(numberC)numC; //	��
		numS.min(numB, numC);//�ٽ� �ٿ�ĳ���� �Ͽ� ���԰���
		System.out.println("-------------------------");
		System.out.println(numC.C+" "+numC.CC);
		System.out.println("-------------------------");
		number numa=new number();
		number numA = new numberA();
		numA.numpic();
		numA=(number)numa;
		numA.numpic();
		
	}

}
