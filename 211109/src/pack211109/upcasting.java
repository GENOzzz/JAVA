package pack211109;

import java.util.Scanner;

class person{	//person��ü ����
	String name;
	int age;
	person(){}
	person(String name,int age){
		this.name=name;
		this.age=age;
	}
	void show() {
		System.out.println(name+" "+age);
	}
}

class student extends person{	//person�� ��ӹ��� student ��ü ����
	String dept;
	int grade;
	student(){}
	student(String dept,int grade){
		this.dept=dept;
		this.grade=grade;
	}
	void show2() {
		System.out.println(name+" "+age+" "+dept+" "+grade);
	}
}

class prof extends person{ //person�� ��ӹ��� prof ��ü ����
	String stick;
	prof(){}
	prof(String stick){
		this.stick=stick;
	}
	void show() { //show �Լ� �������̵� 
		System.out.println(name+" "+age+" "+stick);
	}
}

public class upcasting {
	Scanner scan=new Scanner(System.in);
	void personperson(person a,person b) {
		int A = a.age+b.age;
		String B=a.name+b.name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		upcasting up=new upcasting();
		person a = new student("codding",45); //<<prof a �� student b�� ��ĳ�����Ͽ� person a,b�� ����
		person b = new prof("wood");
		
//		String stick=a.stick;
//		int grade=b.grade;  //<<�� ��ü�� upĳ���� �Ǿ����Ƿ� �ش� ��Ҵ� ã���� ����.
		
		a.show();//<<<�������̵��� �Լ��� �˾Ƽ� ȣ���ϴµ�;;
		//a.show2();//<<<student��ü�� �Լ��� ã��������.
		
		student A;
		prof B;
		
		A=(student)a;
		B=(prof)b;  //<<�� ��ü�� �ٽ� �ٿ�ĳ���� ///���¸� ���� �׸��� ���� ������ ��ĳ���õ� ��ü�� ����ȯ�� ���� ����
		
		int gradea =A.grade;
		String sticka =B.stick; //<<�Ҿ������ �˾Ҵ� ������ ã��
		
		System.out.println(sticka);
		System.out.println(gradea);
		A.show2(); //<<�ٿ�ĳ���� �� �Ҿ���� �Լ��� ã��.
		
		up.personperson(a, b);
	}
}
