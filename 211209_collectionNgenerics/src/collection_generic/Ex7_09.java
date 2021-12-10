package collection_generic;//제네릭 스택만들기.

class GStack<T>{//GStack선언,제네릭 타입T
	int tos;//stck에 저장된 item길이를 세기위한 tos
	Object[]stck;//입력받은 item을 저장하기위한 Object[] stck
	public GStack() {
		tos=0;
		stck=new Object[10];
	}
	public void GStacklast(int last) {
		this.stck=new Object[last];
	}
	
	public void push(T item) {
		if(tos==stck.length)//stck가 꽉차서 더 이상 요소를 삽입할 수 없음.
			return;
		stck[tos]=item;
		tos++;
	}
	public T pop() {
		if(tos==0)//stck가 비어서 더이상 꺼낼 요소가 없음
			return null;
		tos--;
		return(T)stck[tos];//타입 매개변수 타입으로 다운캐스팅
	}
	//제네릭 클래스 안에서 제네릭 메소드 선언 불가?
}

public class Ex7_09 {
	
	public static <T> GStack<T> revers(GStack<T> a){
		GStack<T> s=new GStack<T>();//입력받은 GStack<T> a를 반대로 저장할 목적
		
		while(true) {
			T tmp;
			tmp=a.pop();//입력받은 GStack에서 요소 하나 꺼내고  tmp에 저장 비었으면 a.pop()은 null;
			if(tmp==null)//스택이 비었음
				break;//while종료
			else
				s.push(tmp);//꺼내온 요소를 담은 tmp를 s로 push
		}
		return s;//새 스택을 리턴
	}
	
	public static void main(String[] args) {
		GStack<String> stringstck=new GStack<String>();//String타입의 GStack생성.
		
		stringstck.push("seoul");
		stringstck.push("bush");
		stringstck.push("LA");
		stringstck.push("paris");
		
		int c=stringstck.tos;
		for(int n=0;n<c;n++)
			System.out.println(stringstck.pop());
		
		GStack<Integer> intstck=new GStack<Integer>();//Integer타입의 GStack생성
		
		intstck.push(1);
		intstck.push(2);
		intstck.push(5);
		intstck.push(9);
		
		int i=intstck.tos;
		for(int n=0;n<i;n++)
			System.out.println(intstck.pop());
		
		GStack<Double> dgs=new GStack<Double>();
		dgs.GStacklast(20);
		
		for(int k=0; k<5;k++) {
			dgs.push(new Double(k));
		}
		
		for(int k=0;k<5;k++) {
			System.out.println(dgs.pop());
		}
		
		for(int k=0; k<5;k++) {
			dgs.push(new Double(k));
		}
		
		dgs=revers(dgs);
		
		for(int k=0;k<5;k++) {
			System.out.println(dgs.pop());
		}
		
	}
	
}
