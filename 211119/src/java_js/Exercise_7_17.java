package java_js;
class Unit{//슈퍼클래스  Army생성
	int x,y;//현재위치
	void move(int x,int y) { //공통 메소드 move()
		this.x=x;
		this.y=y;
	}
	void stop() {//공통메소드 stop() 현재 위치에 정지
	}
}

class Marine extends Unit{//보병
	void stimPack() {
		System.out.println("스팀팩을 사용합니다.");
	}
}

class Tank extends Unit{//탱크
	void changeMode() {
		System.out.println("공격모드를 변환합니다");
	}
	
}

class Dropship extends Unit{ //수송선
	void load() {
		System.out.println("선택된 대상을 태웁니다.");
	}
	void unload(){
		System.out.println("선택된 대상을 내립니다.");
	}
}


public class Exercise_7_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
