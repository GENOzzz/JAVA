package neonsin;

import java.util.Scanner;

public class test6_8 {
	Scanner sc=new Scanner(System.in);
	public void neon() {
		int num=0;
		System.out.println("���ڿ��� �Է��ϼ���.(��� ���ڰ� �����մϴ�)");
		String neo=sc.nextLine();
		char[] sign=new char[neo.length()];
		for(int i=0;i<neo.length();i++) {//�Է¹��� ���ڸ� �迭�� �����ϴ� �ݺ���
			char a=neo.charAt(i);
			sign[i]=a;
		}
		while(num<5) {//�ݺ��ؼ� sign�� ����ϴ��Լ�
			for(int j=0;j<sign.length;j++) {
				for(int k=0;k<sign.length;k++) {
					System.out.print(sign[k]);
				}System.out.println();
				changepos(sign);
			}num++;
		}System.out.println("���α׷�����");
	}
	
	public void changepos(char[]ch) {//�迭�� ������ ��ĭ�� ����ִ� �Լ�
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
