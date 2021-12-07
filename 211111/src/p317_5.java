class Point{	//6������.
	private int x,y=0;	//�ʱⰪ����.
	
	Point(){}//main���� Point�� ��ӹ��� ColorPoint�� �⺻�����ڸ� ���ϹǷ� PointŬ�������� �⺻ ������ �ۼ�. 
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x,int y) {this.x=x;this.y=y;}
}

class ColorPoint extends Point{	
	String color="BLACK";	//�ʱⰪ ����
	
	ColorPoint(){}
	ColorPoint(int x,int y){
		super(x,y);
	}
	ColorPoint(int x,int y,String color){
		super(x,y);
		this.color=color;
	}
	
	String toString1() {	//�� ��ҵ��� get�ϴ� �Լ��� ���ڿ��� return �޴� �Լ� toString1().
		return getColor()+"���� ("+getX()+","+getY()+")";	
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
	
	void move(int x, int y, int z) { //����Ŭ���� move()�Լ� �����ε�.Line11
		super.move(x,y);
		this.z=z;
	}
	
	void moveUp() {
		this.z+=1;
	}
	void moveDown() {
		this.z-=1;
	}
	
	String toString1() {	//���� Ŭ�������� ColorPointŬ������ toString1()�Լ� �����ε� Line26
		return "("+getX()+","+getY()+","+getZ()+")�� ��";
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
	
	protected void move(int x,int y) { //����Ŭ������ move�Լ� �������̵�.Line11
		if(x>0&&y>0) {
			super.move(x,y);
		}
	}
	
	String toString1() {	//���� Ŭ�������� ColorPointŬ������ toString1()�Լ� �����ε� Line26
		return "("+getX()+","+getY()+")�� ��";
	}
}

public class p317_5 {

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5,5,"YELLOW");	//5������
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str=cp.toString1();
		System.out.println(str+"�� �� �Դϴ�.");
		
		ColorPoint zeroPoint=new ColorPoint();		//6������
		System.out.println(zeroPoint.toString1()+"�Դϴ�.");
		
		ColorPoint cp2=new ColorPoint(10,10);		//6������
		cp2.setXY(5,5);
		cp2.setColor("RED");
		System.out.println(cp2.toString1()+"�Դϴ�.");
		
		Point3D p =new Point3D(1,2,3);			//7������
		System.out.println(p.toString1()+"�Դϴ�.");
		
		p.moveUp();
		System.out.println(p.toString1()+"�Դϴ�.");
		
		p.moveDown();
		p.move(10, 10);
		System.out.println(p.toString1()+"�Դϴ�.");
		
		p.move(100, 100, 300);
		System.out.println(p.toString1()+"�Դϴ�.");
		
		PositivePoint p2 =new PositivePoint();
		
		p2.move(10, 10);
		System.out.println(p2.toString1()+"�Դϴ�.");
		
		p2.move(-5, 5);
		System.out.println(p2.toString1()+"�Դϴ�.");
		
		PositivePoint p3 =new PositivePoint(-10,-10);
		System.out.println(p3.toString1()+"�Դϴ�.");
		
	}

}
