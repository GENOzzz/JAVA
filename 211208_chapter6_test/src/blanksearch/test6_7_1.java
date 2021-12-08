package blanksearch;

import java.util.Scanner;
import java.util.StringTokenizer;

public class test6_7_1 {
	Scanner sc=new Scanner(System.in);
	public void searchblank() {
		int a=0;
		while(a<1) {
			System.out.print("해석할 문장>>");
			StringTokenizer st=new StringTokenizer(sc.nextLine()," ");
			int n=st.countTokens();
			if(st.nextToken().equals("그만")) a++;//equals로 비교하는 순간 Token하나 잃어서 위에서 미리 세줘야함.
			else {
				System.out.println("어절의 개수는 : "+n+" 개입니다.");
			}
		}
		System.out.println("프로그램을 종료합니다");
	}
	
	public static void main(String[] args) {
		test6_7_1 t=new test6_7_1();
		t.searchblank();
	}

}
