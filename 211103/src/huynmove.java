import java.util.Scanner;

class Seat{
	private String seatClass; //좌석 구분
	private String[] seatNo=new String[10]; //좌석 번호
	Seat(int no){
		switch (no){ //Seat클래스의 좌석 구분 초기화
		case 0 : this.seatClass="S"; break;
		case 1 : this.seatClass="A"; break;
		case 2 : this.seatClass="B"; break;
		}
		for (int i=0;i<seatNo.length;i++) { //Seat클래스의 좌석 번호10개 --- 로 초기화
			seatNo[i]=null;
		}
	}
			
	public void seatShow() { //좌석 보여주기
		System.out.print(this.seatClass+">>");
		for (int i=0;i<seatNo.length;i++) {
			System.out.print(seatNo[i]);
		}System.out.println();
	}
	
	public void setSeatNo(int num,String name) { //좌석번호 세팅 메소드
		if(this.seatNo[num-1].equals(null)) {
			this.seatNo[num-1]=" "+name+" ";
			return;
		}System.out.println("[!] 해당 좌석은 이미 예약이 된 좌석입니다.");	
	}
	
	public void delSeatNo(String name) { //좌석번호 삭제 메소드
		int count=0;
		for(int i=0;i<seatNo.length;i++) {
			if(seatNo[i].equals(" "+name+" ")){
				this.seatNo[i]=" --- ";
				return;
			}count++;
		}if(count==seatNo.length) {
			System.out.println("[!] 해당 예약자가 없습니다. 이름을 다시 확인하세요.");
		}
	}
}


class Reservation{
	Scanner sc = new Scanner(System.in);
	boolean f = true;	
	Seat[] seat = new Seat[3]; //S,A,B 좌석 3개를 각각 레퍼런스할 수 있는 Seat객체배열 
	
	public Reservation(){
		for (int i=0;i<seat.length;i++) {
			seat[i]=new Seat(i); //seat[0]=S, seat[1]=A, seat[2]=B 좌석구분
		}
	}
	
	public void input() { //좌석 예약 메소드
		System.out.print("<예약메뉴>\n[좌석] S:1, A:2, B:3 >>");
		int chk=sc.nextInt();
		seat[chk-1].seatShow();
		System.out.print("이름 >>");
		String name=sc.next();
		System.out.print("좌석 번호 >>");
		int seatNo = sc.nextInt();
		if(seatNo>10) {
			System.out.println("[!] 좌석 번호는 1~10입니다.");
			return;
		}
		seat[chk-1].setSeatNo(seatNo,name);
	}
	
	public void view() { //전체 좌석 조회 메소드
		System.out.println("<조회 메뉴>");
		for (int i=0;i<seat.length;i++) {
			seat[i].seatShow();
		}
		System.out.println("<<< 조회를 완료 했습니다. >>>");
	}
	
	public void reset() { //예약 좌석 취소 메소드
		System.out.print("<취소 메뉴>\n[좌석] S:1, A:2, B:3 >>");
		int chk=sc.nextInt();
		seat[chk-1].seatShow();
		System.out.print("이름 >>");
		String name=sc.next();
		seat[chk-1].delSeatNo(name);
	}
	
	public boolean finish() { //예약 종료 메소드
		System.out.println("<<< 예약 시스템을 종료합니다. >>>");
		return f=false;
	}
		
	public void run() {	
		while(f) {
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >> ");
			int num=sc.nextInt();
			switch(num){
			case 1: input(); break;	
			case 2: view(); break;		
			case 3: reset(); break;			
			case 4: finish(); break;			
			default: System.out.println("1~4를 입력하세요.");				
			}
		}
	}	
}
public class huynmove {

	public static void main(String[] args) {
		System.out.println("<<< 명품콘서트홀 예약 시스템 입니다. >>>");
		Reservation x = new Reservation();
		x.run();
	}
}