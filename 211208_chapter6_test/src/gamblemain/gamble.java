package gamblemain;
import java.util.Scanner;

import gamblehuman.gamehuman;
public class gamble {
	
	public boolean gamblee(gamehuman human) {//���� 3���� �������� �̰� �Ǵ��ϴ� �Լ�
		int a=(int)(Math.random()*3+1);
		int b=(int)(Math.random()*3+1);
		int c=(int)(Math.random()*3+1);
		
		if(a==b&&b==c) {
			System.out.print(a+" "+b+" "+c+" ");
			System.out.println(human.getName()+"�� �� �̰���ϴ�.");
			return true;
		}else{
			System.out.print(a+" "+b+" "+c+" ");
			System.out.println("�ƽ��׿�");
			return false;
		}
	}
}
