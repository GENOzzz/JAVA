class Point {//슈퍼클래스 Point
	private int x,y;
	public void set(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}
	
class ColorPoint extends Point{//Point를 상속받은 ColorPoint
	private String color;
	public void setColor(String color) {
		this.color=color;
	}
	public void showColorPoint() {
		System.out.print(color);
		showPoint();	
	}

}

public class ColorPointExx{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point P = new Point();
		P.set(1,2);
		P.showPoint();
		
		Point cp = new ColorPoint();
		cp.set(3,4);
		ColorPoint sb=(ColorPoint)cp;//다운캐스팅
		sb.setColor("red");//업캐스팅된 상태로는 setColor,showColorPoint함수 모두 사용불가.
		sb.showColorPoint();
	}
}