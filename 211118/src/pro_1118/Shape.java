package pro_1118;

public abstract class Shape {
	private Shape next;
	private Shape pre;
	public Shape() {next=null;}
	public void setNext(Shape obj) {next=obj;};//링크연결
	public Shape getNext() {return next;}
	public abstract void draw();//추상 메소드
	public Shape getPre() {return pre;}
}
