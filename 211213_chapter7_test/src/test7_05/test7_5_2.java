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
		System.out.println("학생이름, 학과,학번,학점평균을 차례로 입력하세요.");
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
					System.out.print("존재하는 이름입니다 이름만 새로 입력해 주십시오.>>");
					newname=sc.next();
				}
				Set<String> names=students.keySet();
				Iterator<String>it=names.iterator();
				while(it.hasNext()) {
					String oldname=it.next();
					Student oldStudent=students.get(oldname);
					if(oldStudent.getId()==newStudent.getId()) {
						System.out.print("존재하는 ID입니다 id만 새로 입력해 주십시오>>");
						newId=ck.checkk(sc.next());
						newStudent=new Student(department,newId,grade);
					}
				}
			}
			students.put(newname,newStudent);
			System.out.println(newname+" 학생등록완료");
			k++;
		}

	}
	public void allStudents(HashMap<String,Student> students) {
		Set<String> names=students.keySet();
		Iterator<String>it=names.iterator();
		while(it.hasNext()) {
			String searchName=it.next();
			System.out.println("========================");
			System.out.println("이름 : "+searchName);
			System.out.println("학과 : "+students.get(searchName).getDepartment());
			System.out.println("학번 : "+students.get(searchName).getId());
			System.out.println("학점평균 : "+students.get(searchName).getGrade());
		}
	}
	
	public void searchStudent() {
		while(true) {
			System.out.println("======================");
			System.out.print("학생이름 >>>>>>>>>>>>>>> ");
			String name=sc.next();
			if(name.equals("그만")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				if(students.containsKey(name)) {
						System.out.println(name+", "+students.get(name).getDepartment()+", "
								+students.get(name).getId()+", "+students.get(name).getGrade());
				}else {
					System.out.println("존재하지 않는 이름입니다.");
				}
			}
		}
			
	}

	public static void main(String[] args) {
		test7_5_2 t=new test7_5_2();
		System.out.print("몇명의 학생을 가입시키시겠습니까>>");
		int num=t.ck.checkk(t.sc.next());
		t.joinStudent(num);
		t.allStudents(t.students);
		t.searchStudent();
	}

}
