package test7_01;
import java.util.*;

public class intvector {
	check ck=new check();
	Scanner sc=new Scanner(System.in);
	Vector<Integer> iv=new Vector<Integer>();
	
	
	public void searchnum() {
		int min=0;
		int max=0;
		if(iv.toArray().length!=0) {
			Iterator<Integer> it=iv.iterator();
			min=iv.get(0);
			max=iv.get(0);
			while(it.hasNext()) {
				int now=it.next();
				if(min>now) {
					min=now;
				}else if(max<now){
					max=now;
				}
			}
		}else {
			System.out.println("���� �ƹ����� ����Ǿ� ���� �ʽ��ϴ�.");
		}
			
		System.out.println("�ִ밪�� : "+max);
		System.out.println("�ּҰ��� : "+min);
	}
	
	public void pushnum() {
		int a=0;
		System.out.print("������ �Է��� �ֽʽÿ�(-1 �Է� �� ����)>>");
		while(a<1) {
			int i=ck.checkk(sc.next());
			switch(i) {
			case -1:
				searchnum();
				System.out.println(iv);
				a++;
				break;
			default:
				iv.add(i);
				break;
			}
		}
		
	}
}
