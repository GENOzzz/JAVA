package blanksearch;

import java.util.Scanner;

public class test6_7_2 {
	Scanner sc=new Scanner(System.in);
	public void searchblank() {
		int a=0;
		while(a<1) {
			System.out.print("�ؼ��� ����>>");
			String st=new String(sc.nextLine());
			String [] check=st.split(" ");
			System.out.println(java.util.Arrays.toString(check));
			int n=check.length;
			if(st.equals("�׸�")) a++;
			else {
				System.out.println("������ ������ : "+n+" ���Դϴ�.");
			}
		}
		System.out.println("���α׷��� �����մϴ�");
	}
	public static void main(String[] args) {
		test6_7_2 tt=new test6_7_2();
		tt.searchblank();
	}

}
