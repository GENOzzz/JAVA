package vector;

import java.util.*;

public class Ex7_5 {
	public static void main(String[] args) {
		HashMap<String,String> dic=new HashMap<String,String>();//해시맵 생성
		//var dic=new HashMap<String,String>();로 간략히 써도됨.
		
		//3개의 (key,value)쌍을 dic에 저장
		dic.put("baby", "아기");//"baby는 key 아기는 value
		dic.put("love","사랑");
		dic.put("aplle","사과");
		
		//사용자로 부터 영어단어를 입력받고 한글단어 검색."exit"입력 받으면 종료
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print("찾고 싶은 단어는?>>>");
			String eng=sc.next();
			if(eng.contentEquals("exit")) {
				System.out.println("종료합니다...");
				break;
			}
			//해시맵에서 key'eng'값 검색 kor탐색
			String kor=dic.get(eng);//dic에 eng없으면 null리턴
			if(kor==null)
				System.out.println(eng+"없는단어입니다.");
			else
				System.out.println(kor);
		}
		sc.close();
	}

}
