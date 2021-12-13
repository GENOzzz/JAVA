package test7_2;
import java.util.*;

public class gradeList {
	Scanner sc=new Scanner(System.in);
	ArrayList<grade> grades =new ArrayList<grade>();
	public void pushgrade() {
		System.out.print("성적을 띄어쓰기로 분리해 입력해 주십시오.>>>");
		String grad=sc.nextLine();
		String [] ngrads=grad.split(" ");
		System.out.println(java.util.Arrays.toString(ngrads));
		for(int i=0;i<ngrads.length;i++) {
			if(ngrads[i].length()>1) {
				System.out.println("잘못입력 하셨습니다.");
				return;
			}else {
				grades.add(new grade(ngrads[i]));
			}
		}
	}
	public void avrgrade(ArrayList<grade> grades) {
		double sum=0;
		for(int i=0;i<grades.size();i++) {
			sum+=grades.get(i).getScore();
		}
		double avr=(sum/grades.size());
		System.out.println("평균은 "+String.format("%f", avr)+"입니다.");
	}
}
