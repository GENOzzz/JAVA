package buffer;

import java.util.Scanner;
import java.util.StringTokenizer;

public class test6_11 {
	StringBuffer sb;
	String[] old;
	int sbl=0;
	Scanner sc=new Scanner(System.in);
	public void ST() {
		System.out.print("���ڿ��� �Է��Ͽ� �ֽʽÿ�>>");
		String s=sc.nextLine();
		sb=new StringBuffer(s);
		sbl=sb.length();
		old=s.split(" ");
		change();
	}
	
	public void change() {
		int check=0;
		while(check<1) {
			System.out.println(sb);
			System.out.print("��� >>> ");
			String c=sc.nextLine();
			if(c.equals("�׸�")) {
				System.out.println("���α׷��� �����մϴ�.");
				check++;
				break;
			}
			String [] nw=c.split("!");
			System.out.println(java.util.Arrays.toString(nw));
			if(nw[0].equals("")||nw.length>2) System.out.println("�߸��� ��ɾ� �Դϴ�!");
			else {
				System.out.println(java.util.Arrays.toString(old));
				for(int i=0;i<old.length;i++) {
					if(old[i].equals(nw[0])) {
						int ch=sb.indexOf(old[i]); //StringBuffer�� �Է¹��� ���ڰ� �ִ��� ��ġ�� ��ȯ���ִ� �Լ�. ������ -1���.
						sb.replace(ch,ch+old[i].length(),nw[1]);
						old[i]=nw[1];
						break;
					}else if(i==old.length-1) {
						System.out.println("ã�� �� �����ϴ�.");
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		test6_11 t =new test6_11();
		t.ST();
	}

}
