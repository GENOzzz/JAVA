package test7_07;

import java.util.*;

public class test7_7 {
	Scanner sc=new Scanner(System.in);
	Check ck=new Check();
	HashMap<String,Student> Students=new HashMap<String,Student>();

	
	public void pushStudent(int num) {
		int k=0;
		while(k<num) {
			System.out.print("이름과 학점>>");
			String name=sc.next();
			double grade=-1;
			while(grade>4.5||grade<0) {
				try{
					grade=sc.nextDouble();
				}catch(InputMismatchException e) {
					System.out.print("4.5점이 만점이고 0점이 최소점수 입니다 점수를 다시 입력해 주십시오>>>");
					sc.nextLine();
				}
			}
			Student ns=new Student(name,grade);
			Students.put(ns.getName(), ns);
			System.out.println("");
			k++;
		}
	}
	public void goodStudent(HashMap<String,Student> Students) {
		if(Students.size()==0) {
			System.out.println("입력된 학생이 없습니다.");
			return;
		}
		System.out.print("장학생 선발 학점 기준 입력>>>");
		double grade=-1;
		while(grade>4.5||grade<0) {
			try{
				grade=sc.nextDouble();
			}catch(InputMismatchException e) {
				System.out.print("정상적인 범위의 숫자를 입력해 주십시오>>>");
				sc.nextLine();
			}
		}
		System.out.print("장학생 명단 : ");
		ArrayList<String>grateStudent=new ArrayList<String>();
		for(String name:Students.keySet()) {
			if(Students.get(name).getGrade()>grade) {
				System.out.print(Students.get(name).getName()+" ");
				grateStudent.add(Students.get(name).getName());
			}
		}if(grateStudent.size()==0) {
			System.out.println("없습니다. 아쉽네요.");
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		test7_7 t=new test7_7();
		System.out.println("미래 장학금 관리 시스템입니다.");
		System.out.print("몇명의 학생을 등록하시겠습니까>>>");
		int num=t.ck.intcheck(sc.next());
		t.pushStudent(num);
		t.goodStudent(t.Students);

	}

}
