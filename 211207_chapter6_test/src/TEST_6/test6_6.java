package TEST_6;

import java.util.Calendar;
import java.util.Scanner;

public class test6_6 {
	static Scanner sc=new Scanner(System.in);
	public static void vstime() {
		int i=0;
		System.out.println("10�ʿ� ����� ����� �̱�� �����Դϴ�.");
		System.out.print("����ڼ��� ���� �ֽʽÿ�.>>");
		int mem = sc.nextInt();
		String mems []=new String[mem];
		int check[]=new int[mem];
		while(i<mem) {
			System.out.print(i+1+" ��° ������� �̸��� �Է��� �ֽʽÿ�>>>");
			mems[i]=sc.next();
			i++;
		}
		System.out.println("������ �����մϴ�.");
		sc.nextLine();
		int j=0;
		while(j<mem) {
			System.out.println(mems[j]+"���� <press enter>");
			sc.nextLine();
			int a=checktime();
			System.out.println("���� �� : "+a);
			//sc.nextLine();
			System.out.println("10�ʸ� ���� �����ֽʽÿ� <press enter>");
			sc.nextLine();
			int b=checktime();
			System.out.println("���� �� : "+b);
			int num=b-a;
			if(num<0) num=num+60;
			check[j]=num;
			//sc.nextLine();
			j++;
		}
		
		int w=Math.abs(10-check[0]);//10�� �񱳸� ���� �ʱⰪ.
		int winer=0;
		for(int k=0;k<mem;k++) {
			if(Math.abs(10-check[k])<w) {
				w=check[k];
				winer=k;
			}
			System.out.print(mems[k]+"��� : "+check[k]+", ");
		}
		System.out.print("���ڴ� ");
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
