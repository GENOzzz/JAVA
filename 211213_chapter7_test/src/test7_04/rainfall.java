package test7_04;
import java.util.*;

public class rainfall {
	check ck = new check();
	Scanner sc=new Scanner(System.in);
	Vector<Integer> raindrop=new Vector<Integer>();
	
	public void pushrain() {
		while(true) {
			System.out.print("������ �Է� 0�Է½� ���� >> ");
			int rain=ck.checkk(sc.next());
			if(rain==0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			raindrop.add(rain);
			for(int i=0;i<raindrop.size();i++) {
				System.out.print(raindrop.get(i)+" ");
			}
			System.out.println("");
			double sum=0;
			double avr=0;
			for(int i=0;i<raindrop.size();i++) {
				sum+=raindrop.get(i);
			}
			avr=sum/raindrop.size();
			System.out.println("���� ��� : "+avr);
		}
	}
	
	public static void main(String[] args) {
		rainfall rainfall=new rainfall();
		rainfall.pushrain();

	}

}
