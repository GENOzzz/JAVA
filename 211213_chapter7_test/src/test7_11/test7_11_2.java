package test7_11;

import java.util.*;
import java.util.stream.Collectors;

public class test7_11_2 {
	Scanner sc=new Scanner(System.in);
	HashMap<String, String> hn=new HashMap<String, String>();
	test7_11_2(){
		hn.put("한국","서울");
		hn.put("미국","워싱턴");
		hn.put("캐나다","오타와");
		hn.put("호주","시드니");
		hn.put("영국","런던");
		hn.put("독일","베를린");
		hn.put("이탈리아","로마");
		hn.put("일본","도쿄");
		hn.put("러시아","모스크바");
	}
	
	public void vnrun() {
		System.out.println("수도 맞추기 퀴즈를 시작합니다");
		while(true) {
			System.out.print("입력(1) 퀴즈(2) 종료(3)>>>");
			String choice=sc.next();
			switch(choice) {
			case "1":
				npush();
				break;
			case"2":
				hnQuiz();
				break;
			case"3":
				System.out.println("종료합니다.");
				return;
			default:
				System.out.println("보기의 숫자만 입력해 주십시오.");
			}
		}
	}
	
	public void npush() {
		System.out.println("현재 "+hn.size()+"개의 국가가 입력되어 있습니다.");
		while(true) {
			System.out.print("국가와 수도를 입력해 주십시오(현재 "+hn.size()+")>>");
			String country=sc.next();
			if(country.equals("그만")) break;
			String capital=sc.next();
			if(hn.entrySet().stream().anyMatch(nation->nation.getKey().equals(country))) {//람다식.
				System.out.println("존재하는 국가입니다.");
			}else {
				hn.put(country, capital);
			}
		}
	}
	
	public void hnQuiz() {
		while(true) {
			int quiz=(int)(Math.random()*hn.size());
			List<String>nations=hn.keySet().stream().peek(a->System.out.print(a))//print로 list에 들어갈 a확인.
					.collect(Collectors.toList());//keySet.stream을 list로 만들고 nation에 넘김
			System.out.print(nations.get(quiz)+"의 수도는 ??");
			String answer=sc.next();
			if(answer.equals("그만")) break;
			if(answer.equals(hn.get(nations.get(quiz)))){
				System.out.println("정답입니다!");
			}else {
				System.out.println("틀렸습니다!");
			}
		}
	}
	
	public static void main(String[]args) {
		test7_11_2 t=new test7_11_2();
		t.vnrun();
	}
}
