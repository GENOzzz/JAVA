package test7_2;
import java.util.*;

public class gradeList {
	Scanner sc=new Scanner(System.in);
	ArrayList<grade> grades =new ArrayList<grade>();
	public void pushgrade() {
		System.out.print("������ ����� �и��� �Է��� �ֽʽÿ�.>>>");
		String grad=sc.nextLine();
		String [] ngrads=grad.split(" ");
		System.out.println(java.util.Arrays.toString(ngrads));
		for(int i=0;i<ngrads.length;i++) {
			if(ngrads[i].length()>1) {
				System.out.println("�߸��Է� �ϼ̽��ϴ�.");
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
		System.out.println("����� "+String.format("%f", avr)+"�Դϴ�.");
	}
}
