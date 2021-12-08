package RSP_1;

import java.util.Scanner;

import RSP_main.com;
import RSP_main.human;
import RSP_main.versus;

public class test6_9 {
	check ck=new check();
	Scanner sc=new Scanner(System.in);
	versus vs=new versus();
	public void run() {
		int n=0;
		System.out.print("사용자의 이름을 입력하십시오 >> ");
		String name=sc.next();
		human human=new human(name);
		com com=new com();
		while(n<1) {
			System.out.print(name+"[가위(1),바위(2),보(3),끝(4)]>>> ");
			int hand=ck.checkk(sc.next());
			if(hand==4) {
				n++;
			}else {
				human.humanhand(hand);
				com.hand();
				System.out.println(human+" : "+ com);
				vs.versuss(human,com);
			}
		}
		System.out.println("@@가위바위보 종료@@");
	}
	public static void main(String[] args) {
		test6_9 t=new test6_9();
		t.run();
	}

}
