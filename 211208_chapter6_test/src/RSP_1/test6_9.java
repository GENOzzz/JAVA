package RSP_1;

import java.util.Scanner;

import RSP_main.com;
import RSP_main.human;
import RSP_main.versus;

public class test6_9 {
	check ck=new check();
	Scanner sc=new Scanner(System.in);
	versus vs=new versus();
	public void run() {//��ü���� ������ ������ run�Լ�
		int n=0;
		System.out.print("������� �̸��� �Է��Ͻʽÿ� >> ");
		String name=sc.next();
		human human=new human(name);//human��ü ���۷��� human����
		com com=new com();//com��ü ����
		while(n<1) {
			System.out.print(name+"[����(1),����(2),��(3),��(4)]>>> ");//����ڰ� 1~4�Է��ϸ�
			int hand=ck.checkk(sc.next());//�������� Ȯ���ϰ� ����
			if(hand==4) {
				n++;
			}else {
				human.humanhand(hand);//�Է¹��� ����hand�� human Ŭ������ humanhand(hand)ȣ��
				com.hand();//comŬ������ hand() ȣ��
				System.out.println(human+" : "+ com);
				vs.versuss(human,com);//�ΰ�ü�� versusŬ������ versuss(human,com)ȣ��
			}
		}
		System.out.println("@@���������� ����@@");
	}
	public static void main(String[] args) {
		test6_9 t=new test6_9();
		t.run();
	}

}
