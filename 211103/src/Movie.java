import java.util.Scanner;
import java.lang.*;

class sit{	//sit클래스
	int sitnum;		//정수형 sitnum
	String name;	//문자열 name을 갖는
	sit(){}
	sit(int sitnum){	//정수로 sit객체 생성시
		this.sitnum=sitnum;	//해당 sit 객체의 sitnum은 입력받은 sitnum으로
	}
	sit(String name){	//문자열 name으로 객체 생성시
		this.name=name;	//해당 sit객체의 name은 입력받은 name으로.
	}
	void sit(int sitnum) {	//정수형 sitnum을 받는 함수 sit선언
		this.sitnum=sitnum;	//해당 함수를 받은 sit 객체의 sitnum을 입력받은 sitnum으로
	}

}
//
public class Movie {	//Movie클래스
	Scanner scan=new Scanner(System.in);
	sit[][] cgv;	//sit객체를 배열로 받을수있는 2차원 배열 cgv를 가짐
	Movie(){this.cgv=new sit[3][10];}	//Movie객체의 기본 생성자는 cgv배열의 크기를 [3][10]으로 한다.<<<해당 문제의 좌석이 30개로 정해져 있으므로
//	
	void reserveAll() {	//함수 reserveAll() 선언 Movie
		while(true) {	//무한반복
			System.out.println("<<<<cgv 예약 시스템 입니다>>>>");
			System.out.print("-예약:1- -조회:2- -취소:3- -종료:4- >>>");
			String a = scan.next();	//사용자로부터 문자형 a를 입력받음
			switch(a){
				case "1":		//입력받은 문자가 1이라면
					checkin();	//checkin()함수 호출<<<line 56
					continue;	//후 while반복
				case "2":		//입력받은 문자가 2라면
					check();	//check()함수 호출<<<line 49
					continue;	//후 while반복
				case "3":		//입력받은 문자가 3이라면
					checkout(); //checkout()함수 호출 line 74
					continue;   //후 while반복
				case "4":		//입력받은 문자가 4라면
					System.out.println("프로그램을 종료합니다.");	//종료 출력
					break;			//후 switch break
				default:			//default <<< switch의  case조건에 없는 예외 발생시
					System.out.println("없는 메뉴입니다 프로그램을 종료합니다.");//없는메뉴라고 선언후 프로그램종료
			}
			break;	//switch문 을 아래로 나오면 while break;
		}
	}
//
	void check() {	//전체 좌석상태를 조회하는 함수 check() 선언
		System.out.println("<CGV>");
		for(int i=0;i<3;i++) {
			show(i+1);	//show()함수 호출 <<< line 85
		}
	}
//	
	void checkin() {//빈 좌석에 싯객체를 넣는 함수 checkin() 선언
		System.out.print("조회할 열을 선택하여 주십시오 >-S:1- -A:2- -B:3-< >>>");
		int a=scan.nextInt();
		if(a>=4||a<=0)	//입력받은 a가 4보다 크거나 같거나 0보다 작거나 같을경우
			System.out.println("존재하지않는 열 입니다.");//없다고 출력
		else {	//아닌경우 1~3사이에 있는경우
			show(a);//show(a)함수 호출 <<<line 103
			System.out.print("성함을 입력하여 주십시오 >>>");
			String name=scan.next();
			sit subscrib=new sit(name); //sit객체 생성(이름은 subscrib) name으로<<line 10
			System.out.print("좌석번호를 선택하여 주십시오(1~10)>>>");
			int sitnum=scan.nextInt();
			subscrib.sit(sitnum); //subscrib로 sit함수 호출 <<line 13
			cgv[a-1][sitnum-1]=subscrib; //cgv[][]은 0부터 시작하므로 입력값에 -1한 자리로 찾아가도록 하고 해당 자리에 sit객체 subscrib 저장 
		}
	}
//		
//	
	void checkout() {			//예약된 좌석을 취소하는 함수 checkout()선언
		System.out.print("취소할 열을 선택하여 주십시오 >-S:1- -A:2- -B:3-< >>>");
		int a=scan.nextInt(); 		//정수를 사용자로부터 입력받음
		show(a);			 		//show(a)함수 호출 <<line 103
		int Z=0;					//해당 배열을 돌면서 카운트하기위한 Z선언 초기값 0
		for(int i=0;i<cgv[a-1].length;i++) {
			if(cgv[a-1][i]==null)	//해당 좌석이 null이라면
				Z++;				//Z++ <<<카운트
			if(Z==cgv[a-1].length)	//Z++이 해당 좌석 열의 길이만큼 되면 (==10)
				System.out.println("이미 비어있는 열입니다 다시 선택해주십시오");//다시선택 출력
		}
		if(Z<cgv[a-1].length) {	//Z가 해당배열을돌다 길이보다 짧게 넘어오면
			System.out.print("성함을 입력해 주십시오>>>");
			String name=scan.next();	//사용자로부터 문자열 name 입력받음
			int X=0;	//다시 아래 for문을 카운트 하기위한 X선언 초기값0
			for(int i=0;i<cgv[a-1].length;i++) {
				if(cgv[a-1][i]==null) {
					continue;
				}
					
				else if(name.equals(cgv[a-1][i].name)) {	//입력받은 name이 cgv[a-1][i].name 과 같다면
					cgv[a-1][i]=null;	//해당 자리를 null로 비움
					System.out.println("취소되었습니다.");	//후 취소 되었다 출력
					break;	//후 for문 break;
				}
				else X++;	//if에 걸리지 않는다면 X++을하고
				if(X==cgv[a-1].length);//X가 해당열의 길이만큼되면 (==10)
					System.out.println("등록되지 않은 이름입니다X-p");//없다고 출력
					break;	//후 for문 break;
			}
		}
	}
//	
	void show(int a) {	//내가 선택한 해당열의 좌석상태를 보여주는 정수형 a를 받는 함수 show()선언
		if(a==1) {	//입력받은 a가 1이라면
			System.out.print("S>>");	//S>>출력후
			for(int i =0;i<cgv[a-1].length;i++) {	//해당 배열 탐색
				if(cgv[a-1][i]==null)	//해당자리가 null이면
					System.out.print(" --- ");//---출력 으로 비었다고 보여줌
				else {
					System.out.print(" "+cgv[a-1][i].name+" ");//아니라면 (객체가 들어가있다면) 해당 자리에 객체의 name출력
				}
			}System.out.println();
		}
		else if(a==2) {
			System.out.print("A>>");
			for(int i =0;i<cgv[a-1].length;i++) {
				if(cgv[a-1][i]==null)
					System.out.print(" --- ");
				else {
					System.out.print(" "+cgv[a-1][i].name+" ");
				}
			}System.out.println();
		}
		else {
			System.out.print("B>>");
			for(int i =0;i<cgv[a-1].length;i++) {
				if(cgv[a-1][i]==null)
					System.out.print(" --- ");
				else {
					System.out.print(" "+cgv[a-1][i].name+" ");
				}
			}System.out.println();
		}
	}

	public static void main(String[] args) {
		Movie cgv=new Movie();//Movie 객체 생성 이름은 cgv <<line22
		cgv.reserveAll(); //Movie 클래스의 cgv객체의 reserveAll()함수 출력 <<line24
	}

}
