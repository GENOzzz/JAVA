package TEST_6;

import java.util.Calendar;
import java.util.Scanner;

public class test6_6 {
	static Scanner sc=new Scanner(System.in);
	public static void vstime() {
		int i=0;
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		System.out.print("사용자수를 정해 주십시오.>>");
		int mem = sc.nextInt();
		String mems []=new String[mem];
		int check[]=new int[mem];
		while(i<mem) {
			System.out.print(i+1+" 번째 사용자의 이름을 입력해 주십시오>>>");
			mems[i]=sc.next();
			i++;
		}
		System.out.println("게임을 시작합니다.");
		sc.nextLine();
		int j=0;
		while(j<mem) {
			System.out.println(mems[j]+"시작 <press enter>");
			sc.nextLine();
			int a=checktime();
			System.out.println("현재 초 : "+a);
			//sc.nextLine();
			System.out.println("10초를 세고 눌러주십시오 <press enter>");
			sc.nextLine();
			int b=checktime();
			System.out.println("현재 초 : "+b);
			int num=b-a;
			if(num<0) num=num+60;
			check[j]=num;
			//sc.nextLine();
			j++;
		}
		
		int w=Math.abs(10-check[0]);//10초 비교를 위한 초기값.
		int winer=0;
		for(int k=0;k<mem;k++) {
			if(Math.abs(10-check[k])<w) {
				w=check[k];
				winer=k;
			}
			System.out.print(mems[k]+"결과 : "+check[k]+", ");
		}
		System.out.print("승자는 ");
		System.out.println(mems[winer]);
		
	}
	public static int checktime() {
		Calendar now=Calendar.getInstance();
		int sec=now.get(Calendar.SECOND);
		return sec;
	}
	
	public static void main(String[] args) {
		vstime();
	}

}
