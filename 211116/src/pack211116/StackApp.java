package pack211116;
import java.util.Scanner;

interface Stack{
	int length(); //현재 스택에 저장된 개수 리턴
	int capacity();//스택의 전체 저장 가능한 개수 리턴
	String pop(); //스택의 톱(top)에 저장된 실수 리턴
	boolean push(String val);//스택의 톱(top)에 실수 저장
}
class StringStack implements Stack {
	Scanner scan=new Scanner(System.in);
	int length,cap;//스택의 저장공간 크기와 톱(top)의 값
	String[] st;//문자열 저장공간
	StringStack(int a) {
		this.length=a;
		st=new String[a];
		cap=this.length;
	}
	public int length() {//현재 스택에 저장된 개수 리턴
		return length-cap;
	}
	public int capacity() {//스택의 전체 저장가능한 개수 리턴
		return cap;
	}
	public String pop() {//스택의 top에 저장된 문자열 리턴
		int tmp=cap;	//아래 push가 진행되면서 cap은 아래로 내려감
		cap++;			//따라서 tmp에 cap을 저장후 cap을 1씩 더해주고
		return st[tmp];	//st배열의 tmp번째의 저장된 String부터 돌려줌.
	}
	public boolean push(String val) {//스택에 문자열 저장.
		if(cap>0) {	//top의 값이 0보다 크면
			st[cap-1]=val; //해당 값-1>>>배열의 마지막위치에 val저장
			cap--;			//저장 후엔 탑의 위치-1(이미 탑의 위치에는 val가 저장되었으므로 다음 탑의 위치를 cap-1로 한다.
			return true;
		}
		else;
		return false;
	}
}

class StackApp{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.print("총 스택 저장 공간의 크기 입력>> ");
		int a=scan.nextInt();
		StringStack stack=new StringStack(a);//문자열 stack 생성
		while(true) {
			System.out.print("문자열 입력 >>>");
			String val=scan.next();//스택에 저장할 문자열 입력받음
			
			if(val.equals("그만")) {//그만 입력시
				int len=stack.length();//현재 스택에 저장된 문자열 개수
				if(len==0)	//문자열이 없으면
					System.out.println("아무것도 없는데 왜 팝시켜!.");
				else {//문자열이 있으면
					System.out.print("스택에 저장된 모든 문자열 팝 :");
					for(int i =0;i<stack.length;i++) { //현재 스택에 저장된 문자열 개수만큼 pop!
						if(stack.st[i]==null) {//pop은 아래서 부터 올라가므로 0번째부터 비어있을수 있음
							System.out.print(" null ");//비었을경우 null출력
						}
						else {	//아니라면
						System.out.print(stack.pop()+" ");//해당위치에서 pop
						}
					}
				}
				break;//프로그램종료
			}
			else {//스택에 문자열 푸쉬
				if(!stack.push(val)) //스택에 공간이 없으면.
					System.out.println("스택이 꽉차서 푸시 불가!!");
			}
		}
	}
}