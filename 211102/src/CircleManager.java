
import java.util.Scanner;
class Circle {
	private double x,y;
	private int radius;
	
	public Circle(double x, double y, int radius) {
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	
	public void show() {
		System.out.println("("+this.x+this.y+")"+this.radius);
	}
	public int area() {
		return this.radius;
	}
		
}
class CircleManager{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Circle c[]=new Circle[3];
		for(int i=0; i<3 ;i++) {
			System.out.print("x,y,radius>>");
			double x = scan.nextDouble();
			double y = scan.nextDouble();
			int radius = scan.nextInt();	
			c[i]=new Circle(x,y,radius);
		}
		
		int max=c[0].area();
		int j = 0;
		for(int i=0; i<c.length;i++) {
			if(max<c[i].area()) {
				max=c[i].area();
				j=i;
			}
		}
		System.out.print("가장 큰 원의 면적은 ");
		c[j].show();
		scan.close();
	}

}