import java.util.Scanner;

class Player{								//Player 클래스
	 Scanner scan=new Scanner(System.in);
	  String name;							//name과 word를 갖는.
	  String word;

	Player(String name){					//Player 생성자
		this.name=name;						//(name)이 객체.name이 됨.
	}
	
	public  void getWordFromUser(){			//Player 클래스의 함수 getWordFromUser()
			System.out.print(this.name+">>");//사용자로부터 입력받음
			String word=scan.nextLine();	 //입력받은 문자를 word에 저장
			this.word=word;					//해당word 가 객체.word가됨
		}
	
	public boolean checkSuccess(String WORD) {//Player 클래스의 함수 checkSuccess()
		int last=WORD.length()-1;			  //정수 last는 WORD의 길이-1만큼(배열은 0부터 시작하므로 배열끝자리값은 배열크기-1이됨)
		char lastChar=WORD.charAt(last);	  //캐릭터형 lastChar은 WORD의 마지막 글자.
		char firstChar=this.word.charAt(0);	  //firstChar는 this.word의 첫글자
		if(lastChar==firstChar) {			  //lastChar과 firstChar을 비교했을때 같다면<<<WORD의 마지막글자와 word의 첫글자비교
			return true;					  //true 반환
		}
		else {
			return false;					  //아니라면 false 반환
		}
	}

}

public class WordGameApp{						//클래스 WordGameApp
	WordGameApp(){								//생성자 WordGameApp
		System.out.println("끝말잇기를 시작합니다.");
		System.out.print("참가인원을 정해주십시오>>");
	}
	void run(int a){							//WordGameApp 클래스의 함수 run(int a)<<<정수 a를 매개변수로하는 함수 run
		Scanner scan=new Scanner(System.in);
		Player[] PN=new Player [a];				//Player객체를 담는 PN배열 생성 길이는 a만큼 <<<int[]은 정수형 배열 인것처럼 객체[]선언시 객체배열
		for (int i=0;i<a;i++) {					//i=0부터 i<a동안 반복 <<<입력받은 값 a가 Player 배열의 길이가됨.
			System.out.print("참가자의 이름을 정해주십시오>>");//사용자로부터 참가자의 이름 입력받음.
			String name=scan.nextLine();			//입력받은 값을 name에 저장
			PN[i]=new Player(name);					//입력받은 name을 변수로하는 객체 Player를 배열 PN에 저장
		}
		System.out.println("시작단어는 아버지 입니다.");
		
		String WORD="아버지";		//시작단어를 받기위해 WORD에 아버지 저장
		int i=0;
		while(true) {
			PN[i].getWordFromUser();		//(아버지)
			if(PN[i].checkSuccess(WORD)) {	//WORD를 매개변수로하는 함수 checkSuccess() 객체는 PN[i] (checkSuccess의 return값이 boolean이므로 if안에서 사용)
				WORD=PN[i].word;			//실행후 WORD는 PN[i]로 대입 <<<마지막으로 입력받은 문자;;
				if(i==a-1) {				//i값이 입력받은 a(객체배열PN)의길이와 같아진다면 i=0으로 초기화
					i=0;
				}i++;						//if에 걸리지않는다면 i++, while(true)안에서 움직이므로 무한반복
							
			}else {							//위 조건에 맞지 않는다면
				System.out.println(PN[i].name+"탈락");//해당 PN[i]name 출력후
				break;								 //while 문 탈출
			}
			
		}scan.close();
	}
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		WordGameApp start=new WordGameApp();	//start라는 이름의 WordGameApp생성자 생성
		int a = scan.nextInt();					//변수 a = 사용자로부터 입력값 받음
		start.run(a);							//입력받은 a를 매개변수로 run 함수 실행(start.)
		
		scan.close();
	}
}

	

