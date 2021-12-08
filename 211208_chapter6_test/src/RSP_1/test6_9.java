package RSP_1;

import java.util.Scanner;

import RSP_main.com;
import RSP_main.human;
import RSP_main.versus;

public class test6_9 {
	check ck=new check();
	Scanner sc=new Scanner(System.in);
	versus vs=new versus();
	public void run() {//전체적인 게임을 진행할 run함수
		int n=0;
		System.out.print("사용자의 이름을 입력하십시오 >> ");
		String name=sc.next();
		human human=new human(name);//human객체 레퍼런스 human생성
		com com=new com();//com객체 생성
		while(n<1) {
			System.out.print(name+"[가위(1),바위(2),보(3),끝(4)]>>> ");//사용자가 1~4입력하면
			int hand=ck.checkk(sc.next());//정수인지 확인하고 저장
			if(hand==4) {
				n++;
			}else {
				human.humanhand(hand);//입력받은 정수hand로 human 클래스의 humanhand(hand)호출
				com.hand();//com클래스의 hand() 호출
				System.out.println(human+" : "+ com);
				vs.versuss(human,com);//두객체로 versus클래스의 versuss(human,com)호출
			}
		}
		System.out.println("@@가위바위보 종료@@");
	}
	public static void main(String[] args) {
		test6_9 t=new test6_9();
		t.run();
	}

}
