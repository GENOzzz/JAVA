package pack211116;
interface Shape{
	final double PI=3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.print("---�ٽ� �׸��ϴ�.");
		draw();
	}
}

class Circle1 implements Shape{
	int radius;
	Circle1(int radius){
		this.radius=radius;
	}
	public void draw() {
		System.out.println("��������"+this.radius+"�� ���Դϴ�.");
	}
	public double getArea() {
		return PI*radius*radius;
	}
}

class Oval1 implements Shape{
	int width;
	int heith;
	Oval1(int width,int heith){
		this.width=width;
		this.heith=heith;
	}
	public void draw() {
		System.out.println(this.width+"x"+this.heith+"�� �����ϴ� Ÿ���Դϴ�.");
	}
	public double getArea() {
		return PI*this.width*this.heith;
	}
}

class Rect1 implements Shape{
	int width;
	int heith;
	Rect1(int width,int heith){
		this.width=width;
		this.heith=heith;
	}
	public void draw() {
		System.out.println(this.width+"x"+this.heith+"ũ���� �簢�� �Դϴ�.");
	}
	public double getArea() {
		return this.width*this.heith;
	}
	
}


public class Test5_13 {

	public static void main(String[] args) {
		Shape donut = new Circle1(10);
		donut.redraw();
		System.out.println("������ "+donut.getArea());
		
		Shape [] list=new Shape[3];
		list[0]=new Circle1(10);
		list[1]=new Oval1(20,30);
		list[2]=new Rect1(10,40);
		
		for(int i=0;i<list.length;i++) list[i].redraw();
		for(int i=0;i<list.length;i++) System.out.println("������ "+list[i].getArea());
	}

}
