package test7_05;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class test7_5_2 {
	check ck=new check();
	Scanner sc=new Scanner(System.in);
	HashMap<String,Student> students=new HashMap<String,Student>();
	
	public void pushStudent(String name,Student student) {
		students.put(name,student);
	}
	
	public void joinStudent(int num) {
		int k=0;
		System.out.println("�л��̸�, �а�,�й�,��������� ���ʷ� �Է��ϼ���.");
		while(k<num) {
			System.out.print(">> ");
			String name=sc.next();
			String department=sc.next();
			int id=ck.checkk(sc.next());
			double grade=sc.nextDouble();
			Student newStudent=new Student(department,id,grade);
			String newname=name;
			int newId=id;
			if(students.size()!=0) {
				if(students.containsKey(name)) {
					System.out.print("�����ϴ� �̸��Դϴ� �̸��� ���� �Է��� �ֽʽÿ�.>>");
					newname=sc.next();
				}
				Set<String> names=students.keySet();
				Iterator<String>it=names.iterator();
				while(it.hasNext()) {
					String oldname=it.next();
					Student oldStudent=students.get(oldname);
					if(oldStudent.getId()==newStudent.getId()) {
						System.out.print("�����ϴ� ID�Դϴ� id�� ���� �Է��� �ֽʽÿ�>>");
						newId=ck.checkk(sc.next());
						newStudent=new Student(department,newId,grade);
					}
				}
			}
			students.put(newname,newStudent);
			System.out.println(newname+" �л���ϿϷ�");
			k++;
		}

	}
	public void allStudents(HashMap<String,Student> students) {
		Set<String> names=students.keySet();
		Iterator<String>it=names.iterator();
		while(it.hasNext()) {
			String searchName=it.next();
			System.out.println("========================");
			System.out.println("�̸� : "+searchName);
			System.out.println("�а� : "+students.get(searchName).getDepartment());
			System.out.println("�й� : "+students.get(searchName).getId());
			System.out.println("������� : "+students.get(searchName).getGrade());
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
				if(students.containsKey(name)) {
						System.out.println(name+", "+students.get(name).getDepartment()+", "
								+students.get(name).getId()+", "+students.get(name).getGrade());
				}else {
					System.out.println("�������� �ʴ� �̸��Դϴ�.");
				}
			}
		}
			
	}

	public static void main(String[] args) {
		test7_5_2 t=new test7_5_2();
		System.out.print("����� �л��� ���Խ�Ű�ðڽ��ϱ�>>");
		int num=t.ck.checkk(t.sc.next());
		t.joinStudent(num);
		t.allStudents(t.students);
		t.searchStudent();
	}

}
