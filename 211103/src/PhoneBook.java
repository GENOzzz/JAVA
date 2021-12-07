import java.util.Scanner;

class Phone{		//Phone클래스
	String name;	//는 name과 number를 가짐
	String number;
	Phone(){}
	Phone(String name,String number){//객체 선언시 문자 두개를 받면
		this.name=name;				//해당 문자를 순서대로 name과 number에 저장
		this.number=number;
	}
}

public class PhoneBook {			//PhoneBook 클래스
Scanner scan=new Scanner(System.in);
	Phone[] Book;					//는 Phone객체를 배열을 찾을수있는 레퍼런스(Book)을 가짐
	PhoneBook(int a){				//객체 선언시 정수를 받으면
		this.Book=new Phone[a];		//입력받은 정수로
		for(int i=0;i<a;i++) {		//for문 반복
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");//name과 number를 사용자로부터 입력받음
			String name=scan.next();
			String number=scan.next();
			this.Book[i]=new Phone(name, number);		//입력받은 name과 number로 Phone객체를 생성하여 Book배열의 i번째에 저장
		}System.out.println("저장되었습니다.");
	}
	
	void search() {	//함수 such는 return이 없음
		while(true) {
			System.out.print("검색할이름>>>");	
			String cname=scan.next();		//사용자로부터 cname을 입력받음
			if(cname.equals("그만"))			//입력받은 이름이 그만이라면
				break;						//반복문 탈출
			int count=0;	//Book배열을 돌때 카운트를위한 변수 count선언 0으로 값초기화
			for(int i =0; i<this.Book.length;i++) { //Book배열의 길이만큼 반복
				if(cname.equals(this.Book[i].name))	//만약 입력받은 cname이 Book배열의 i번째의 name과 같다면<<<Book배열에 저장된 i번째 Phone객체의 name
					System.out.println(this.Book[i].name+"의 번호는"+this.Book[i].number); //i번째의 Phone객체의 이름과 번호 출력
				else {count++;}		//그렇지않은경우 count++
				if(count==this.Book.length)//count의크기가 Book.length와 같다면 >>>배열을 다 넘어갔다는 의미
					System.out.println(cname+"(은)는 없는 이름입니다.");	//입력받은 cname은 없다고 출력
			}continue;
		}
	}


	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.print("인원수>>");
		int a=scan.nextInt();	//사용자로부터 정수a입력받고
		PhoneBook Book=new PhoneBook(a);	//해당 정수로 PhoneBook객체 생성, 이름은 Book
		Book.search();						//Book객체의 함수 such 호출>>>line 26번
		scan.close();
	}

}