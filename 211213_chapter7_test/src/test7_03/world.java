package test7_03;
import java.util.*;

public class world {
	check ck = new check();
	Scanner sc=new Scanner(System.in);
	HashMap<String,Integer>nations=new HashMap<String,Integer>();
	public void pushworld() {
		System.out.println("���� �̸��� �α��� �Է��ϼ���(ex> Korea 5000 )");
		while(true) {
			System.out.print("�����̸�, �α� >>> ");
			String wd=sc.next();
			if(wd.equals("�׸�")) {
				System.out.println("���� �Է��� �����մϴ�.");
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
			System.out.print("���� �˻� >>> ");
			String wd=sc.next();
			if(wd.equals("�׸�")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			if(world.nations.containsKey(wd)) {
				System.out.println(wd+"�� �α��� "+world.nations.get(wd)+"�Դϴ�.");
			}else {
				System.out.println("�Է��Ͻ� ������ �����ϴ�.");
			}
		}
	}

	public static void main(String[] args) {
		world world=new world();
		world.pushworld();
		world.searchWorld(world);
	}

}
