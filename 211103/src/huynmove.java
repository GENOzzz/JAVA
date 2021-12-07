import java.util.Scanner;

class Seat{
	private String seatClass; //�¼� ����
	private String[] seatNo=new String[10]; //�¼� ��ȣ
	Seat(int no){
		switch (no){ //SeatŬ������ �¼� ���� �ʱ�ȭ
		case 0 : this.seatClass="S"; break;
		case 1 : this.seatClass="A"; break;
		case 2 : this.seatClass="B"; break;
		}
		for (int i=0;i<seatNo.length;i++) { //SeatŬ������ �¼� ��ȣ10�� --- �� �ʱ�ȭ
			seatNo[i]=null;
		}
	}
			
	public void seatShow() { //�¼� �����ֱ�
		System.out.print(this.seatClass+">>");
		for (int i=0;i<seatNo.length;i++) {
			System.out.print(seatNo[i]);
		}System.out.println();
	}
	
	public void setSeatNo(int num,String name) { //�¼���ȣ ���� �޼ҵ�
		if(this.seatNo[num-1].equals(null)) {
			this.seatNo[num-1]=" "+name+" ";
			return;
		}System.out.println("[!] �ش� �¼��� �̹� ������ �� �¼��Դϴ�.");	
	}
	
	public void delSeatNo(String name) { //�¼���ȣ ���� �޼ҵ�
		int count=0;
		for(int i=0;i<seatNo.length;i++) {
			if(seatNo[i].equals(" "+name+" ")){
				this.seatNo[i]=" --- ";
				return;
			}count++;
		}if(count==seatNo.length) {
			System.out.println("[!] �ش� �����ڰ� �����ϴ�. �̸��� �ٽ� Ȯ���ϼ���.");
		}
	}
}


class Reservation{
	Scanner sc = new Scanner(System.in);
	boolean f = true;	
	Seat[] seat = new Seat[3]; //S,A,B �¼� 3���� ���� ���۷����� �� �ִ� Seat��ü�迭 
	
	public Reservation(){
		for (int i=0;i<seat.length;i++) {
			seat[i]=new Seat(i); //seat[0]=S, seat[1]=A, seat[2]=B �¼�����
		}
	}
	
	public void input() { //�¼� ���� �޼ҵ�
		System.out.print("<����޴�>\n[�¼�] S:1, A:2, B:3 >>");
		int chk=sc.nextInt();
		seat[chk-1].seatShow();
		System.out.print("�̸� >>");
		String name=sc.next();
		System.out.print("�¼� ��ȣ >>");
		int seatNo = sc.nextInt();
		if(seatNo>10) {
			System.out.println("[!] �¼� ��ȣ�� 1~10�Դϴ�.");
			return;
		}
		seat[chk-1].setSeatNo(seatNo,name);
	}
	
	public void view() { //��ü �¼� ��ȸ �޼ҵ�
		System.out.println("<��ȸ �޴�>");
		for (int i=0;i<seat.length;i++) {
			seat[i].seatShow();
		}
		System.out.println("<<< ��ȸ�� �Ϸ� �߽��ϴ�. >>>");
	}
	
	public void reset() { //���� �¼� ��� �޼ҵ�
		System.out.print("<��� �޴�>\n[�¼�] S:1, A:2, B:3 >>");
		int chk=sc.nextInt();
		seat[chk-1].seatShow();
		System.out.print("�̸� >>");
		String name=sc.next();
		seat[chk-1].delSeatNo(name);
	}
	
	public boolean finish() { //���� ���� �޼ҵ�
		System.out.println("<<< ���� �ý����� �����մϴ�. >>>");
		return f=false;
	}
		
	public void run() {	
		while(f) {
			System.out.print("����:1, ��ȸ:2, ���:3, ������:4 >> ");
			int num=sc.nextInt();
			switch(num){
			case 1: input(); break;	
			case 2: view(); break;		
			case 3: reset(); break;			
			case 4: finish(); break;			
			default: System.out.println("1~4�� �Է��ϼ���.");				
			}
		}
	}	
}
public class huynmove {

	public static void main(String[] args) {
		System.out.println("<<< ��ǰ�ܼ�ƮȦ ���� �ý��� �Դϴ�. >>>");
		Reservation x = new Reservation();
		x.run();
	}
}