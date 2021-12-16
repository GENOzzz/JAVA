package test7_08;

import java.util.*;

public class test7_8 {
	Check ck=new Check();
	Scanner sc=new Scanner(System.in);
	HashMap<String, customer> customers=new HashMap<String,customer>();
	
	public void joinmem() {
		while(true) {
			System.out.print("이름과 포인트 입력 >>");
			String name=sc.next();
			if(name.equals("그만")) {
				System.out.println("프로그램 종료");
				break;
			}
			int point=ck.intcheck(sc.next());
			System.out.println("customer생성");
			customer customer=new customer(name,point);
			if(customers.containsKey(name)) {
				customers.get(name).pluspoint(point);
			}else{
				System.out.println("새회원가입성공");
				customers.put(name,customer);
			}
		}
		Allmem(customers);	
	}
	
	public void Allmem(HashMap<String,customer>customers) {
		for(String key:customers.keySet()) {
			System.out.print(customers.get(key).toString()+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		test7_8 t=new test7_8();
		t.joinmem();
	}

}
