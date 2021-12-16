package test7_04;
import java.util.*;

public class rainfall {
	check ck = new check();
	Scanner sc=new Scanner(System.in);
	Vector<Integer> raindrop=new Vector<Integer>();
	
	public void pushrain() {
		while(true) {
			System.out.print("강수량 입력 0입력시 종료 >> ");
			int rain=ck.checkk(sc.next());
			if(rain==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			raindrop.add(rain);
			for(int i=0;i<raindrop.size();i++) {
				System.out.print(raindrop.get(i)+" ");
			}
			System.out.println("");
			double sum=0;
			double avr=0;
			for(int i=0;i<raindrop.size();i++) {
				sum+=raindrop.get(i);
			}
			avr=sum/raindrop.size();
			System.out.println("현재 평균 : "+avr);
		}
	}
	
	public static void main(String[] args) {
		rainfall rainfall=new rainfall();
		rainfall.pushrain();

	}

}
