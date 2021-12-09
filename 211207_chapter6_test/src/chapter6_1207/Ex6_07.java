package chapter6_1207;

public class Ex6_07 {
	public static void main(String[] args) {
		String a= new String(" C#");
		String b= new String(",C++ ");
		
		System.out.println(a+"의 길이는 "+a.length());//문자열의 길이(문자개수)
		System.out.println(a.contains("문자열의 포함 관계 : "+"#"));//문자열의 포함관계
		
		a=a.concat(b);//문자열 연결
		System.out.println("문자열 연결 : "+a);
		
		a=a.trim();//문자열 앞뒤 공백 제거
		System.out.println("문자열 공백 제거 : "+a);
		
		a=a.replace("C#", "Java");//문자열 대치
		System.out.println("문자열 대치 : "+a);
		
		String s[]=a.split("문자열 분리 : "+",");//문자열 분리
		for(int i=0;i<s.length;i++)
			System.out.println("분리된 문자열 "+i+" : "+s[i]);
		
		a=a.substring(5);//인덱스 5부터 끝까지 서브스트링 리턴
		System.out.println("인덱스부터 서브스트링 리턴 : "+a);
		
		char c=a.charAt(2);//인덱스 2의 문자 리턴
		System.out.println(c);
	}
}
