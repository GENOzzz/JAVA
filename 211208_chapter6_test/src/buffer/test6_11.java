package buffer;

import java.util.Scanner;
import java.util.StringTokenizer;

public class test6_11 {
	StringBuffer sb;
	String[] old;
	int sbl=0;
	Scanner sc=new Scanner(System.in);
	public void ST() {
		System.out.print("문자열을 입력하여 주십시오>>");
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
			System.out.print("명령 >>> ");
			String c=sc.nextLine();
			if(c.equals("그만")) {
				System.out.println("프로그램을 종료합니다.");
				check++;
				break;
			}
			String [] nw=c.split("!");
			System.out.println(java.util.Arrays.toString(nw));
			if(nw[0].equals("")||nw.length>2) System.out.println("잘못된 명령어 입니다!");
			else {
				System.out.println(java.util.Arrays.toString(old));
				for(int i=0;i<old.length;i++) {
					if(old[i].equals(nw[0])) {
						int ch=sb.indexOf(old[i]); //StringBuffer에 입력받은 문자가 있는지 위치를 반환해주는 함수. 없으면 -1출력.
						sb.replace(ch,ch+old[i].length(),nw[1]);
						old[i]=nw[1];
						break;
					}else if(i==old.length-1) {
						System.out.println("찾을 수 없습니다.");
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
