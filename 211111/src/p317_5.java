class Point{	//6번문제.
	private int x,y=0;	//초기값설정.
	
	Point(){}//main에서 Point를 상속받은 ColorPoint의 기본생성자를 원하므로 Point클래스에도 기본 생성자 작성. 
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x,int y) {this.x=x;this.y=y;}
}

class ColorPoint extends Point{	
	String color="BLACK";	//초기값 설정
	
	ColorPoint(){}
	ColorPoint(int x,int y){
		super(x,y);
	}
	ColorPoint(int x,int y,String color){
		super(x,y);
		this.color=color;
	}
	
	String toString1() {	//각 요소들을 get하는 함수로 문자열을 return 받는 함수 toString1().
		return getColor()+"색의 ("+getX()+","+getY()+")";	
		}
	void setXY(int x,int y) {
		move(x,y);
	}

	void setColor(String color) {
		this.color=color;
	}
	String getColor() {
		return color;
	}
}

class Point3D extends Point{
	int z;
	Point3D(int x,int y,int z){
		super(x,y);
		this.z=z;
	}
	int getZ() {
		return z;
	}
	
	void move(int x, int y, int z) { //슈퍼클래스 move()함수 오버로딩.Line11
		super.move(x,y);
		this.z=z;
	}
	
	void moveUp() {
		this.z+=1;
	}
	void moveDown() {
		this.z-=1;
	}
	
	String toString1() {	//같은 클래스내의 ColorPoint클래스의 toString1()함수 오버로딩 Line26
		return "("+getX()+","+getY()+","+getZ()+")의 점";
	}
}
class PositivePoint extends Point{
	
	PositivePoint(){}
	PositivePoint(int x,int y){
		if(x<0&&y<0) {
			x=0;y=0;
		}else {
			super.move(x, y);
		}
	}
	
	protected void move(int x,int y) { //슈퍼클래스의 move함수 오버라이딩.Line11
		if(x>0&&y>0) {
			super.move(x,y);
		}
	}
	
	String toString1() {	//같은 클래스내의 ColorPoint클래스의 toString1()함수 오버로딩 Line26
		return "("+getX()+","+getY()+")의 점";
	}
}

public class p317_5 {

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5,5,"YELLOW");	//5번문제
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str=cp.toString1();
		System.out.println(str+"의 점 입니다.");
		
		ColorPoint zeroPoint=new ColorPoint();		//6번문제
		System.out.println(zeroPoint.toString1()+"입니다.");
		
		ColorPoint cp2=new ColorPoint(10,10);		//6번문제
		cp2.setXY(5,5);
		cp2.setColor("RED");
		System.out.println(cp2.toString1()+"입니다.");
		
		Point3D p =new Point3D(1,2,3);			//7번문제
		System.out.println(p.toString1()+"입니다.");
		
		p.moveUp();
		System.out.println(p.toString1()+"입니다.");
		
		p.moveDown();
		p.move(10, 10);
		System.out.println(p.toString1()+"입니다.");
		
		p.move(100, 100, 300);
		System.out.println(p.toString1()+"입니다.");
		
		PositivePoint p2 =new PositivePoint();
		
		p2.move(10, 10);
		System.out.println(p2.toString1()+"입니다.");
		
		p2.move(-5, 5);
		System.out.println(p2.toString1()+"입니다.");
		
		PositivePoint p3 =new PositivePoint(-10,-10);
		System.out.println(p3.toString1()+"입니다.");
		
	}

}
