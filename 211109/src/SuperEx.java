class Appp{//슈퍼클래스 Appp
	private int x,y;
	public Appp() {
		this.x=this.y=0;
	}
	public Appp(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public void showPoint() { //슈퍼클래스의 메소드
		System.out.println("("+x+","+y+")");
	}
}
class Cppp extends Appp{//Appp을 상속받은 Cppp
	private String color;
	public Cppp(int x,int y,String color) {
		super(x,y);//super() => 슈퍼클래스의 해당 생성자를  찾아감.
		this.color=color;
	}
	public void showColorPoint() {//서브클래스의 메소드
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
