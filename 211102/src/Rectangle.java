
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
		System.out.println("("+this.x+","+this.y+")"+"���� ũ�Ⱑ"+this.width+"x"+this.heigth+"�� �簢��");
	}
	
	boolean contains(Rectangle r) { //Rectangle��ü�� �Ű�����(Rectangle��ü)�� ���Ͽ� ���� ������ �Ǻ��ϴ� �Լ�.
		if (((this.x<r.x&&this.y<r.y)&&(((this.x+this.width)>(r.x+r.width))&&((this.y+this.heigth)>(r.y+r.heigth))))) 
			///this.������ ������ �Ǵ� ��ü�� ������ ���ϰ� 				 r.������ �Ű������� ���� ��ü�� ������ ����.
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
		System.out.println("s�� ������"+s.square());
		if(t.contains(r)) System.out.println("t�� r�� �����մϴ�.");
		if(t.contains(s)) System.out.println("t�� s�� �����մϴ�.");
		if(t.contains(p)) System.out.println("t�� p�� �����մϴ�.");

	}

}
