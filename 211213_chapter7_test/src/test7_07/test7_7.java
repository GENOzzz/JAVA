package test7_07;

import java.util.*;

public class test7_7 {
	Scanner sc=new Scanner(System.in);
	Check ck=new Check();
	HashMap<String,Student> Students=new HashMap<String,Student>();

	
	public void pushStudent(int num) {
		int k=0;
		while(k<num) {
			System.out.print("�̸��� ����>>");
			String name=sc.next();
			double grade=-1;
			while(grade>4.5||grade<0) {
				try{
					grade=sc.nextDouble();
				}catch(InputMismatchException e) {
					System.out.print("4.5���� �����̰� 0���� �ּ����� �Դϴ� ������ �ٽ� �Է��� �ֽʽÿ�>>>");
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
			System.out.println("�Էµ� �л��� �����ϴ�.");
			return;
		}
		System.out.print("���л� ���� ���� ���� �Է�>>>");
		double grade=-1;
		while(grade>4.5||grade<0) {
			try{
				grade=sc.nextDouble();
			}catch(InputMismatchException e) {
				System.out.print("�������� ������ ���ڸ� �Է��� �ֽʽÿ�>>>");
				sc.nextLine();
			}
		}
		System.out.print("���л� ��� : ");
		ArrayList<String>grateStudent=new ArrayList<String>();
		for(String name:Students.keySet()) {
			if(Students.get(name).getGrade()>grade) {
				System.out.print(Students.get(name).getName()+" ");
				grateStudent.add(Students.get(name).getName());
			}
		}if(grateStudent.size()==0) {
			System.out.println("�����ϴ�. �ƽ��׿�.");
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		test7_7 t=new test7_7();
		System.out.println("�̷� ���б� ���� �ý����Դϴ�.");
		System.out.print("����� �л��� ����Ͻðڽ��ϱ�>>>");
		int num=t.ck.intcheck(sc.next());
		t.pushStudent(num);
		t.goodStudent(t.Students);

	}

}
