package vector;

import java.util.*;

public class Ex7_3 {
	public static void main(String[] args) {
		//문자열만 삽입 가능한 ArrayList 생성
		ArrayList<String> a=new ArrayList<String>();
		
		//키보드로부터 4개의 이름 입력받아 ArrayList에 삽입
		Scanner sc=new Scanner(System.in);//Scanner 객체생성.
		for(int i=0;i<4;i++) {
			System.out.print("이름을 입력하세요>>");
			String s=sc.next();//사용자로부터 입력받음.
			a.add(s);//ArrayList컬렉션에 삽입
		}
		//ArrayList에 있는 모든 이름 출력
		for(int i =0;i<a.size();i++) {
			String name=a.get(i);//ArrayList의 i번째 얻어오기
			System.out.print(name+" ");
		}
		//가장 긴 이름 출력
		int longnameidx=0;
		for(int i=1;i<a.size();i++) {
			if(a.get(longnameidx).length()<a.get(i).length())
				longnameidx=i;
		}
		System.out.println("\n가장 긴 이름은 : "+a.get(longnameidx));
		sc.close();
	}
}
