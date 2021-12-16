package test7_03;
import java.util.*;

public class world {
	check ck = new check();
	Scanner sc=new Scanner(System.in);
	HashMap<String,Integer>nations=new HashMap<String,Integer>();
	public void pushworld() {
		System.out.println("나라 이름과 인구를 입력하세요(ex> Korea 5000 )");
		while(true) {
			System.out.print("나라이름, 인구 >>> ");
			String wd=sc.next();
			if(wd.equals("그만")) {
				System.out.println("국가 입력을 종료합니다.");
				break;
			}
			else {
				int pp=ck.checkk(sc.next());
				nations.put(wd,pp);
			}
		}
	}
	public void searchWorld(world world) {
		while(true) {
			System.out.print("나라 검색 >>> ");
			String wd=sc.next();
			if(wd.equals("그만")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			if(world.nations.containsKey(wd)) {
				System.out.println(wd+"의 인구는 "+world.nations.get(wd)+"입니다.");
			}else {
				System.out.println("입력하신 국가는 없습니다.");
			}
		}
	}

	public static void main(String[] args) {
		world world=new world();
		world.pushworld();
		world.searchWorld(world);
	}

}
