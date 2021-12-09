package TEST_6;
class MyPoint{
	private int x,y;
	MyPoint(int x, int y){
		this.x=x;
		this.y=y;
	}
	public String toString() {
		return "Point ("+this.x+", "+this.y+")";
	}
	public boolean equals(Object obj) {
		MyPoint p=(MyPoint)obj;
		if(x==p.x&&y==p.y) return true;
		else return false;
	}
}
public class test6_1 {

	public static void main(String[] args) {
		MyPoint p=  new MyPoint(3,50);
		MyPoint q=  new MyPoint(3,50);
		System.out.println(p);
		System.out.println(q);
		if(p.equals(q))
			System.out.println("같은점");
		else
			System.out.println("다른점");
	}

}
