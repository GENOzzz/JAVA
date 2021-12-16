package test7_11;

import java.util.*;

public class test7_11_1 {
	Scanner sc=new Scanner(System.in);
	Vector<Nation> vn=new Vector<Nation>();
	test7_11_1(){
		vn.add(new Nation("한국","서울"));
		vn.add(new Nation("미국","워싱턴"));
		vn.add(new Nation("캐나다","오타와"));
		vn.add(new Nation("호주","시드니"));
		vn.add(new Nation("영국","런던"));
		vn.add(new Nation("독일","베를린"));
		vn.add(new Nation("이탈리아","로마"));
		vn.add(new Nation("일본","도쿄"));
		vn.add(new Nation("러시아","모스크바"));
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
				vnQuiz();
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
		System.out.println("현재 "+vn.size()+"개의 국가가 입력되어 있습니다.");
		while(true) {
			System.out.print("국가와 수도를 입력해 주십시오(현재 "+vn.size()+")>>");
			String name=sc.next();
			if(name.equals("그만")) break;
			String capital=sc.next();
			if(vn.stream().anyMatch(nation -> nation.getCountry().equals(name))) {
				System.out.println("이미 존재하는 나라 입니다.");
			}else {
				Nation newNation=new Nation(name,capital);
				vn.add(newNation);
			}
//			Nation newNation=new Nation(name,capital);
//			if(vn.contains(newNation)) {
//				System.out.println("이미 존재하는 나라입니다.");
//			}else {
//				vn.add(newNation);
//			}

		}
	}
	
	public void vnQuiz() {
		while(true) {
			int quiz=(int)(Math.random()*vn.size());
			System.out.print(vn.get(quiz).getCountry()+"의 수도는 ??");
			String answer=sc.next();
			if(answer.equals("그만")) break;
			if(answer.equals(vn.get(quiz).getCapital())) {
				System.out.println("정답입니다!");
			}else {
				System.out.println("틀렸습니다!");
			}
		}
	}
	
	public static void main(String[]args) {
		test7_11_1 t=new test7_11_1();
		t.vnrun();
	}
}
