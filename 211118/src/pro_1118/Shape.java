package pro_1118;

public abstract class Shape {
	private Shape next;
	private Shape pre;
	public Shape() {next=null;}
	public void setNext(Shape obj) {next=obj;};//��ũ����
	public Shape getNext() {return next;}
	public abstract void draw();//�߻� �޼ҵ�
	public Shape getPre() {return pre;}
}
