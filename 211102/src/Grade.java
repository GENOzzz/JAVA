import java.util.Scanner;

public class Grade {//p241_2
	
	private int math,science,english;
	
	Grade(int math,int science,int english){
		this.math=math;
		this.science=science;
		this.english=english;
	}
	
	int average() {
		return (math+science+english)/3;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("����, ����, ���� ������ 3���� �����Է�>>");
		int math=scan.nextInt();
		int science = scan.nextInt();
		int english = scan.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("�����"+me.average());
		
		scan.close();
	}

}
