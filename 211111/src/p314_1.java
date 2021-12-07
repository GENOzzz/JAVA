class TV{ //슈퍼 클래스  TV
	private int size;	//접근제어 private으로 size는 직접터치불가
	public TV(int size) {this.size=size;} //TV생성자
	protected int getSize() {return size;}	//private에 접근할 getSize()함수
}

class ColorTV1 extends TV {//TV를 상속받은 서브클래스 ColorTV1
	private int color;	
	ColorTV1(int size,int color){	//ColorTV1 생성자
		super(size);
		this.color=color;
	}
	
	protected int getColor() {	//private color에 접근할 getColor()함수
		return color;
	}
	
	void printProperty() {
		System.out.println(getSize()+"인치 "+getColor()+"컬러");
	}
}

public class p314_1 {

	public static void main(String[] args) {
		ColorTV1 myTV=new ColorTV1(32,1024);
		myTV.printProperty();

	}

}
