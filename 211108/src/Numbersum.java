import java.util.Scanner;

class number{
	int x,y,z;
	number(){}
	number(int x,int y){
		this.x=x;
		this.y=y;
	}
	void numpic() {
		System.out.println("이건부모!");
	}
}
class numberA extends number{
	String A;
	numberA(){}
	numberA(int x, int y) {
		super(x, y);
	}
	void numpic() {
		System.out.println("이건A!");
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
		numberC numC = new numberC(40,35,"name","C입니다.");
		System.out.println(numC.x+" "+numC.y);
		System.out.println(numC.C+" "+numC.CC);
		
		numS.sum(numC,numB); //<<<서브클래스 객체는 슈퍼클래스의 객체로 취급할수잇따
									//단 그렇게 취급당하면 당한순간 업캐스팅이 일어난것으로
		number numc=numC;
		System.out.println("------------------------");
		System.out.println("numC.x+numC.y");
		System.out.println("업캐스팅된C "+numC.x+" "+numC.y); //<<number객체에도있는 x와 y는 호출가능	//"사람은 생물이다"의 논리.
		System.out.println("-------------------------");
		System.out.println("업캐스팅된C C CC");
		System.out.println(numC.C+numC.CC); 
		System.out.println("sum.numB,numC");
		numS.sum(numB, numC);					
		System.out.println("------------------------");															
		//numS.min(numB,numC); //함수 min은 numberB,C 객체를 변수로 받기에 업캐스팅된 B,C는불가<<<업캐스팅을 했기때문에 슈퍼클래스를 서브클래스의 객체로 취급X
		numB=(numberB)numB; //	↓											//"생물은 사람이다"가 불가능한것처럼.
		numC=(numberC)numC; //	↓
		numS.min(numB, numC);//다시 다운캐스팅 하여 대입가능
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
