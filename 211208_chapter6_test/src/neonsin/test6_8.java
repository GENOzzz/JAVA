package neonsin;

import java.util.Scanner;

public class test6_8 {
	Scanner sc=new Scanner(System.in);
	public void neon() {
		int num=0;
		System.out.println("문자열을 입력하세요.(모든 문자가 가능합니다)");
		String neo=sc.nextLine();
		char[] sign=new char[neo.length()];
		for(int i=0;i<neo.length();i++) {//입력받은 문자를 배열에 저장하는 반복문
			char a=neo.charAt(i);
			sign[i]=a;
		}
		while(num<5) {//반복해서 sign을 출력하는함수
			for(int j=0;j<sign.length;j++) {
				for(int k=0;k<sign.length;k++) {
					System.out.print(sign[k]);
				}System.out.println();
				changepos(sign);
			}num++;
		}System.out.println("프로그램종료");
	}
	
	public void changepos(char[]ch) {//배열의 순서를 한칸씩 당겨주는 함수
		char tmp;
		tmp=ch[0];
		for(int i=0;i<ch.length;i++) {
			if(i==ch.length-1) {
				ch[ch.length-1]=tmp;
			}else {
				ch[i]=ch[i+1];
			}
		}
	}
	
	
	public static void main(String[] args) {
		test6_8 t=new test6_8();
		t.neon();
	}

}
