package test7_6;

import java.util.*;


public class test7_6 {
	Check ck=new Check();
	Scanner sc=new Scanner(System.in);
	HashMap<String,Location> cnl=new HashMap<String,Location>();
	
	public void push(Location con) {
		cnl.put(con.getCountry(),con);
	}
	
	public Location infoCon() {
		Location loc;
		String country;
		int lati,longi;
		while(true) {
			System.out.println("도시,경도,위도를 순서대로 입력하세요.");
			System.out.print(">>");
			String [] infoLoc=sc.nextLine().split(",");
			if(infoLoc.length!=3) {
				System.out.println("다시 입력해주시기 바랍니다.");
				continue;
			}else {
				country=infoLoc[0];
				lati=ck.intcheck((infoLoc[1]));
				longi=ck.intcheck((infoLoc[2]));
			}
			loc=new Location(country,lati,longi);
			return loc;
		}
	}
	
	public void AllLocation(HashMap<String,Location> cnl) {
		//Set<String>keys=cnl.keySet();
		for(String key:cnl.keySet()) {
			System.out.println(cnl.get(key).toString()); 
			System.out.println();
		}
	}
	
	public void searchLoc() {
		while(true) {
			System.out.print("검색할 도시이름 >>>");
			String country=sc.next();
			System.out.println("");
			if(country.equals("그만")) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			if(cnl.containsKey(country)) {
				System.out.println(cnl.get(country).toString());
			}else {
				System.out.println(country+"도시는 없습니다.");
			}
			
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		test7_6 t =new test7_6();
		System.out.print("몇개의 도시를 입력하시겠습니까>>>");
		int num=t.ck.intcheck(sc.next());
		int put=0;
		while(put<num) {
			t.push(t.infoCon());
			put++;
		}
		t.AllLocation(t.cnl);
		t.searchLoc();
	}

}
