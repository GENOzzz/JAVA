
public class Circle {
	int radius;
	Circle (int radius){
		this.radius=radius;
	}
	static void increas(Circle m) {
		m.radius++;
	}
	static void decreas(Circle m) {
		m.radius--;
	}
	public static void main(String[] args) {
		Circle pizza=new Circle(10);
		Circle dounut=new Circle(5);
		
		System.out.println(pizza.radius);
		increas(pizza);
		System.out.println(pizza.radius);
		decreas(pizza);
		System.out.println(pizza.radius);
		
		System.out.println(dounut.radius);
		increas(dounut);
		System.out.println(dounut.radius);
		decreas(dounut);
		System.out.println(dounut.radius);
	}

}
