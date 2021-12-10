package collection_generic;//���׸� ���ø����.

class GStack<T>{//GStack����,���׸� Ÿ��T
	int tos;//stck�� ����� item���̸� �������� tos
	Object[]stck;//�Է¹��� item�� �����ϱ����� Object[] stck
	public GStack() {
		tos=0;
		stck=new Object[10];
	}
	public void GStacklast(int last) {
		this.stck=new Object[last];
	}
	
	public void push(T item) {
		if(tos==stck.length)//stck�� ������ �� �̻� ��Ҹ� ������ �� ����.
			return;
		stck[tos]=item;
		tos++;
	}
	public T pop() {
		if(tos==0)//stck�� �� ���̻� ���� ��Ұ� ����
			return null;
		tos--;
		return(T)stck[tos];//Ÿ�� �Ű����� Ÿ������ �ٿ�ĳ����
	}
	//���׸� Ŭ���� �ȿ��� ���׸� �޼ҵ� ���� �Ұ�?
}

public class Ex7_09 {
	
	public static <T> GStack<T> revers(GStack<T> a){
		GStack<T> s=new GStack<T>();//�Է¹��� GStack<T> a�� �ݴ�� ������ ����
		
		while(true) {
			T tmp;
			tmp=a.pop();//�Է¹��� GStack���� ��� �ϳ� ������  tmp�� ���� ������� a.pop()�� null;
			if(tmp==null)//������ �����
				break;//while����
			else
				s.push(tmp);//������ ��Ҹ� ���� tmp�� s�� push
		}
		return s;//�� ������ ����
	}
	
	public static void main(String[] args) {
		GStack<String> stringstck=new GStack<String>();//StringŸ���� GStack����.
		
		stringstck.push("seoul");
		stringstck.push("bush");
		stringstck.push("LA");
		stringstck.push("paris");
		
		int c=stringstck.tos;
		for(int n=0;n<c;n++)
			System.out.println(stringstck.pop());
		
		GStack<Integer> intstck=new GStack<Integer>();//IntegerŸ���� GStack����
		
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
