package gamblemain;
import java.util.Scanner;

import gamblehuman.gamehuman;
public class gamble {
	
	public boolean gamblee(gamehuman human) {//정수 3개를 랜덤으로 뽑고 판단하는 함수
		int a=(int)(Math.random()*3+1);
		int b=(int)(Math.random()*3+1);
		int c=(int)(Math.random()*3+1);
		
		if(a==b&&b==c) {
			System.out.print(a+" "+b+" "+c+" ");
			System.out.println(human.getName()+"님 이 이겼습니다.");
			return true;
		}else{
			System.out.print(a+" "+b+" "+c+" ");
			System.out.println("아쉽네요");
			return false;
		}
	}
}
