package gamblemain;

import java.util.Scanner;

import gamblehuman.gamehuman;
import gamblehuman.gamehumans;
import RSP_1.check;

public class test6_10_12 {
	gamble gem=new gamble();
	check ck=new check();
	Scanner sc=new Scanner(System.in);
	
	public void gamestart() {
		System.out.print("����̼� ���� �Ͻðڽ��ϱ�>>>");
		int n=ck.checkk(sc.next());
		gamehumans team=new gamehumans();
		team.set(n);//setȣ��
		gamehuman [] players=team.getTeam();//players���۷����� team.getTeam()�� ���۷��� ����
		
		for(int i=0;i<players.length;i++) {//�� ����ڵ鿡�� �̸��� �Է¹޴� for��
			System.out.print(i+1+"��° ������� �̸��� �Է��� �ֽʽÿ�>>");
			players[i]=new gamehuman(sc.next());
		}
		sc.nextLine();
		boolean stop=false;
		while(!stop) {//������ �Ǵ��� while��
			for(int k=0;k<players.length;k++) {
				System.out.println("["+players[k].getName()+"] turn <press enter>");
				sc.nextLine();
				if(gem.gamblee(players[k])) {
					stop=true;
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		test6_10_12 t = new test6_10_12();
		t.gamestart();

	}

}
