class Appp{//����Ŭ���� Appp
	private int x,y;
	public Appp() {
		this.x=this.y=0;
	}
	public Appp(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public void showPoint() { //����Ŭ������ �޼ҵ�
		System.out.println("("+x+","+y+")");
	}
}
class Cppp extends Appp{//Appp�� ��ӹ��� Cppp
	private String color;
	public Cppp(int x,int y,String color) {
		super(x,y);//super() => ����Ŭ������ �ش� �����ڸ�  ã�ư�.
		this.color=color;
	}
	public void showColorPoint() {//����Ŭ������ �޼ҵ�
		System.out.println(color);
		showPoint();
	}
}

public class SuperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cppp cp = new Cppp(5,6,"blue");
		cp.showColorPoint();	
	}
}
