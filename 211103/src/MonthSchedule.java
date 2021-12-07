import java.util.Scanner;

class Day{		//Day클래스 선언
	private String work;	//객체변수 work, date
	int date;
	Day(){}					//생성자
	Day(int date){			//정수 date를 매개변수로 받는 생성자
		this.date=date;		//매개변수 정수형 date가 객체변수 date로
	}
	Day(int date,String work){	//매개변수 정수형 date,문자열 work를 받는 생성자
		this.date=date;			//매개변수 date가 객체변수 date로
		this.work=work;			//매개변수 work가 객체변수 work로
	}
	public void set(String work) { //리턴값이없는(void) 함수set() 매개변수 문자형work
		this.work=work;			   //매개변수 work를 객체변수 work로 반환해줌.
		} 
	public String get() {return work;} //문자열을 돌려주는 함수get() work를 돌려줌 <<현재 코드에서는 Day클래스 안에서 work를 가져오기때문에 get불필요.
	
	public void show() {			   //리턴값이없는(void) 함수show()
		if(work==null)System.out.println("없습니다.");//work가 null(없으면) 없습니다 출력
		else System.out.println("하실일은" + work + "입니다");		//외에(null이 아닌경우) work+입니다 출력
	}
}

public class MonthSchedule {			//MonthSchedule클래스 생성
	Scanner scan=new Scanner(System.in);
	static int last;					//last를 static으로 선언<<<아래 모든 함수와 생성자에서 사용할수있게 하기위함.
	Day[] Schedule;						//Day객체를 받을수있는 배열 Schedule선언
	MonthSchedule(int a){				//정수형a를 매개변수로받는 MonthSchedule객체 생성
		last=a;							//static last를 >> 매개변수 a로 변경
		this.Schedule=new Day[last];	//현재Schedule(배열)의 크기를 Day[Last]로 설정.
		for(int i=0;i<a;i++) {		//Last만큼 반복하는동안
			this.Schedule[i]=new Day(i+1);//Schedule배열에i번째마다 Day(i+1)의 값을가지는 객체 생성
		}													//Day(int a)객체 생성
	}
	void input(){						//리턴값없는 함수 input()
		String work;					//문자열 work선언
		int day;
		while(true) {
			System.out.print("날짜(1~"+last+")>>");//사용자로부터 정수 입력받음.
			day=scan.nextInt();			//정수형 day에 입력받은값 대입
			if(day<1||day>last)			//만약 입력받은 값이 범위를 벗어나면
				System.out.println("날짜를 확인하여 주십시오");//확인부탁 출력
			else
				break;				//아니라면(범위 안에 있다면) while 탈출
		}
		System.out.print("할일?(빈칸없이입력)>>");
		work=scan.next();		//.next();<<스페이스를 띄우기전까지 리턴 .nextLine();<<엔터를치기전까지 문자열 전부를 리턴
		Schedule[day-1].set(work);//Schedule의 [day-1]번째 배열에 set.(work)함수 호출<<<55번줄 추가설명
	}
	void view() {				//리턴값이 없는 함수view()
		System.out.print("날짜(1~"+last+")>>");//사용자로부터 값을 입력받음
		int day=scan.nextInt();				 //입력받은 값으로부터
		Schedule[day-1].show();				 //스케줄배열의 day-1번째를 찾아감 
	}										 //└배열의0번째가 Day(1)의 객체를 담고있으므로 사용자입장에서 1을입력하도록
	void finish(){	 //리턴값이 없는 finish();
		System.out.println("프로그램을 종료합니다.");//프로그램 종료출력
	}
	void run(){
		while(true) {	//무한반복
			System.out.print("할일(입력:1, 보기:2, 끝내기:3)>>");
			int w=scan.nextInt();	//사용자로부터 입력받은 w
			if(w>=1&&w<=3) {}		//w크기 판별(1,2,3)이 맞는지
			else { 					//아니라면 아래 문구 출력후 재입력받도록함
				System.out.println("1,2,3중에 입력하여주십시오");
				continue;
			}
			switch(w){	//switch문실행 w를 매개변수로
			case 1:		//입력받은 w가 1이라면
				input();	//input()함수 호출
				continue;	//continue <<<할일 입력 부분으로 돌아감
			case 2:		//w가 2라면
				view();	//view() 함수 호술
				continue;
			case 3:		//w가 3이라면
				finish();//finish()함수 호출
				break;	//switch 탈출
			}break;		//while 탈출
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("월 스케쥴 관리 프로그램");
		System.out.print("마지막 날짜를 입력해주십시오>>");
		int a = scan.nextInt();	//사용자로부터 입력받은 a를 매개변수로
		MonthSchedule Month=new MonthSchedule(a);	//MonthSchedule객체 생성;(레퍼런스:이름)은 Month
			Month.run();
			scan.close();
		}
}
