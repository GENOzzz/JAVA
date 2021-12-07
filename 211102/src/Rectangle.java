
public class Rectangle {//p242_3
	int x,y,width,heigth;
	Rectangle(int x, int y, int width, int heigth){
		this.x=x;
		this.y=y;
		this.width=width;
		this.heigth=heigth;
	}
	int square() {
		return this.width*this.heigth;
	}
	void show() {
		System.out.println("("+this.x+","+this.y+")"+"에서 크기가"+this.width+"x"+this.heigth+"인 사각형");
	}
	
	boolean contains(Rectangle r) { //Rectangle객체와 매개변수(Rectangle객체)를 비교하여 참과 거짓을 판별하는 함수.
		if (((this.x<r.x&&this.y<r.y)&&(((this.x+this.width)>(r.x+r.width))&&((this.y+this.heigth)>(r.y+r.heigth))))) 
			///this.변수는 기준이 되는 객체의 변수를 말하고 				 r.변수는 매개변수로 받은 객체의 변수를 말함.
				return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);
		Rectangle p = new Rectangle(5,5,1,1);
		r.show();
		System.out.println("s의 면적은"+s.square());
		if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
		if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
		if(t.contains(p)) System.out.println("t는 p를 포함합니다.");

	}

}
