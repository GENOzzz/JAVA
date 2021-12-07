class TV{ //���� Ŭ����  TV
	private int size;	//�������� private���� size�� ������ġ�Ұ�
	public TV(int size) {this.size=size;} //TV������
	protected int getSize() {return size;}	//private�� ������ getSize()�Լ�
}

class ColorTV1 extends TV {//TV�� ��ӹ��� ����Ŭ���� ColorTV1
	private int color;	
	ColorTV1(int size,int color){	//ColorTV1 ������
		super(size);
		this.color=color;
	}
	
	protected int getColor() {	//private color�� ������ getColor()�Լ�
		return color;
	}
	
	void printProperty() {
		System.out.println(getSize()+"��ġ "+getColor()+"�÷�");
	}
}

public class p314_1 {

	public static void main(String[] args) {
		ColorTV1 myTV=new ColorTV1(32,1024);
		myTV.printProperty();

	}

}
