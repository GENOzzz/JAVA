class Point {//����Ŭ���� Point
	private int x,y;
	public void set(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}
	
class ColorPoint extends Point{//Point�� ��ӹ��� ColorPoint
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
		ColorPoint sb=(ColorPoint)cp;//�ٿ�ĳ����
		sb.setColor("red");//��ĳ���õ� ���·δ� setColor,showColorPoint�Լ� ��� ���Ұ�.
		sb.showColorPoint();
	}
}