package pro_1118;
import java.util.Scanner;

public class StackApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("�� ���� ���� ������ ũ���Է�>>>");
		int n=scan.nextInt();
		StringStack ss=new StringStack(n);
		while(true) {
			System.out.print("���ڿ� �Է� >>>");
			String st=scan.next();
			if(st.equals("�׸�")) 
				break;
			boolean result = ss.push(st);
			if(!result) {
				System.out.println("������ �� ���� Ǫ�� �Ұ�!");
			}
		}
		System.out.print("���ÿ� ����� ��� ���ڿ� �� : ");
		int len=ss.length();
		for(int i=0;i<len;i++) {
			System.out.print(ss.pop()+" ");
		}
		scan.close();
	}

}
