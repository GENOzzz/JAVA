package pack211109;

import java.util.Scanner;

class person{	//person객체 선언
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

class student extends person{	//person을 상속받은 student 객체 선언
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

class prof extends person{ //person을 상속받은 prof 객체 선언
	String stick;
	prof(){}
	prof(String stick){
		this.stick=stick;
	}
	void show() { //show 함수 오버라이딩 
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
		person a = new student("codding",45); //<<prof a 와 student b를 업캐스팅하여 person a,b로 생성
		person b = new prof("wood");
		
//		String stick=a.stick;
//		int grade=b.grade;  //<<두 객체가 up캐스팅 되었으므로 해당 요소는 찾을수 없음.
		
		a.show();//<<<오버라이딩된 함수는 알아서 호출하는듯;;
		//a.show2();//<<<student객체의 함수는 찾을수없음.
		
		student A;
		prof B;
		
		A=(student)a;
		B=(prof)b;  //<<두 객체를 다시 다운캐스팅 ///형태를 받을 그릇을 먼저 생성후 업캐스팅된 객체를 형변환을 통해 저장
		
		int gradea =A.grade;
		String sticka =B.stick; //<<잃어버린줄 알았던 유산을 찾음
		
		System.out.println(sticka);
		System.out.println(gradea);
		A.show2(); //<<다운캐스팅 후 잃어버린 함수도 찾음.
		
		up.personperson(a, b);
	}
}
