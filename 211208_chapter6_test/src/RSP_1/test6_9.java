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
		System.out.print("������� �̸��� �Է��Ͻʽÿ� >> ");
		String name=sc.next();
		human human=new human(name);
		com com=new com();
		while(n<1) {
			System.out.print(name+"[����(1),����(2),��(3),��(4)]>>> ");
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
		System.out.println("@@���������� ����@@");
	}
	public static void main(String[] args) {
		test6_9 t=new test6_9();
		t.run();
	}

}
