package pro_1118;
import java.util.Scanner;

public class StackApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("총 스텍 저장 공간의 크기입력>>>");
		int n=scan.nextInt();
		StringStack ss=new StringStack(n);
		while(true) {
			System.out.print("문자열 입력 >>>");
			String st=scan.next();
			if(st.equals("그만")) 
				break;
			boolean result = ss.push(st);
			if(!result) {
				System.out.println("스택이 꽉 차서 푸시 불가!");
			}
		}
		System.out.print("스택에 저장된 모든 문자열 팝 : ");
		int len=ss.length();
		for(int i=0;i<len;i++) {
			System.out.print(ss.pop()+" ");
		}
		scan.close();
	}

}
