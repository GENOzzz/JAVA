package test7_5;
import java.util.*;

public class test7_5_1 {
	check ck=new check();
	Scanner sc=new Scanner(System.in);
	ArrayList<Student> students=new ArrayList<Student>();
	
	public void joinStudent(int num) {
		int k=0;
		System.out.println("�л� �̸�,�а�,�й�,��������� ���ʷ� �Է��ϼ���.");
		while(k<num) {
			System.out.print(">> ");
			String name=sc.next();
			String department=sc.next();
			int id=ck.checkk(sc.next());
			double grade=sc.nextDouble();
			Student newStudent=new Student(name,department,id,grade);
			int newid=id;
			if(students.size()!=0) {
				for(int i=0;i<students.size();i++) {
					if(students.get(i).getId()==newStudent.getId()){
						System.out.print("�����ϴ� �й��Դϴ�. id�� �ٽ� �Է��� �ֽʽÿ�.>>");
						newid=ck.checkk(sc.next());
						newStudent.setId(newid);
						newStudent=new Student(name,department,newid,grade);
						i=-1;
					}
				}
			}
			students.add(newStudent);
			System.out.println(name+" �л���ϿϷ�");
			k++;
		}

	}
	public void allStudents(ArrayList<Student> students) {
		
		for(int i =0;i<students.size();i++) {
			System.out.println("========================");
			System.out.println(students.get(i));
//			System.out.println("�̸� : "+students.get(i).getName()); <<toString()�������̵� �ϸ� �Ƚᵵ ��...
//			System.out.println("�а� : "+students.get(i).getDepartment());
//			System.out.println("�й� : "+students.get(i).getId());
//			System.out.println("������� : "+students.get(i).getGrade());
			
		}
	}
	
	public void searchStudent() {
		while(true) {
			System.out.println("======================");
			System.out.print("�л��̸� >>>>>>>>>>>>>>> ");
			String name=sc.next();
			if(name.equals("�׸�")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}else {
				for(int i=0;i<students.size();i++) {
					if(students.get(i).getName().equals(name)) {
						System.out.println(students.get(i).getName()+", "+students.get(i).getDepartment()+", "
								+students.get(i).getId()+", "+students.get(i).getGrade());
					}
				}
			}
			
		}
	}
	public static void main(String[] args) {
		test7_5_1 t=new test7_5_1();
		System.out.print("����� �л��� ���Խ�Ű�ðڽ��ϱ�>>");
		int num=t.ck.checkk(t.sc.next());
		t.joinStudent(num);
		t.allStudents(t.students);
		t.searchStudent();
		
	}

}
