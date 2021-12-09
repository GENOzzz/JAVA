package chapter6_1207;

import java.util.StringTokenizer;

public class String_class {

	public static void main(String[] args) {
		String str1 = "abcd";
		char data [] = {'a','b','c','d'};
		String str2 = new String(data);
		String str3 = new String("abcd");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		//스트링 리터럴 테이블
		String a="Hello";
		String b="Java";
		String c="Hello";
		//힙메모리
		String d=new String("Hello");
		String e=new String("Java");
		String f=new String("Hello");
		String g=d.concat(e);
		
		System.out.println(d);
		System.out.println(g);
		d=d.concat("Java");
		System.out.println(d);
		
		String h="요우";
		String i="요기";
		String j="요우";
		int aa=h.compareTo(i);//두 스트링을 사전 순으로 비교하여 같으면 0 현스트링이 먼저면 음수 참조가 먼저면 양수
		System.out.println(aa);
		int bb=h.compareTo(j);
		System.out.println(bb);
		//토큰 : 제어권.
		String query ="name=geno&addr=degu&age=28";
		StringTokenizer st=new StringTokenizer(query,"&");
		
	}

}
