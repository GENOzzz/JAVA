package blanksearch;

import java.util.Scanner;
import java.util.StringTokenizer;

public class test6_7_1 {
	Scanner sc=new Scanner(System.in);
	public void searchblank() {
		int a=0;
		while(a<1) {
			System.out.print("�ؼ��� ����>>");
			StringTokenizer st=new StringTokenizer(sc.nextLine()," ");
			int n=st.countTokens();
			if(st.nextToken().equals("�׸�")) a++;//equals�� ���ϴ� ���� Token�ϳ� �Ҿ ������ �̸� �������.
			else {
				System.out.println("������ ������ : "+n+" ���Դϴ�.");
			}
		}
		System.out.println("���α׷��� �����մϴ�");
	}
	
	public static void main(String[] args) {
		test6_7_1 t=new test6_7_1();
		t.searchblank();
	}

}
