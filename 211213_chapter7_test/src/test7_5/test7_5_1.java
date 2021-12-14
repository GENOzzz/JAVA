package test7_5;
import java.util.*;

public class test7_5_1 {
	check ck=new check();
	Scanner sc=new Scanner(System.in);
	ArrayList<Student> students=new ArrayList<Student>();
	
	public void joinStudent(int num) {
		int k=0;
		System.out.println("학생 이름,학과,학번,학점평균을 차례로 입력하세요.");
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
						System.out.print("존재하는 학번입니다. id만 다시 입력해 주십시오.>>");
						newid=ck.checkk(sc.next());
						newStudent.setId(newid);
						newStudent=new Student(name,department,newid,grade);
						i=-1;
					}
				}
			}
			students.add(newStudent);
			System.out.println(name+" 학생등록완료");
			k++;
		}

	}
	public void allStudents(ArrayList<Student> students) {
		
		for(int i =0;i<students.size();i++) {
			System.out.println("========================");
			System.out.println(students.get(i));
//			System.out.println("이름 : "+students.get(i).getName()); <<toString()오버라이딩 하면 안써도 됨...
//			System.out.println("학과 : "+students.get(i).getDepartment());
//			System.out.println("학번 : "+students.get(i).getId());
//			System.out.println("학점평균 : "+students.get(i).getGrade());
			
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
		System.out.print("몇명의 학생을 가입시키시겠습니까>>");
		int num=t.ck.checkk(t.sc.next());
		t.joinStudent(num);
		t.allStudents(t.students);
		t.searchStudent();
		
	}

}
