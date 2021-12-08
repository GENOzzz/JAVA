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
		System.out.print("몇명이서 진행 하시겠습니까>>>");
		int n=ck.checkk(sc.next());
		gamehumans team=new gamehumans();
		team.set(n);//set호출
		gamehuman [] players=team.getTeam();//players레퍼런스에 team.getTeam()한 레퍼런스 복사
		
		for(int i=0;i<players.length;i++) {//각 사용자들에게 이름을 입력받는 for문
			System.out.print(i+1+"번째 사용자의 이름을 입력해 주십시오>>");
			players[i]=new gamehuman(sc.next());
		}
		sc.nextLine();
		boolean stop=false;
		while(!stop) {//게임을 판단할 while문
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
