package test7_10;

abstract class Shape{
	private Shape next;
	public Shape() {next=null;}
	public void setNext(Shape obj) {next=obj;};//링크연결
	public Shape getNext() {return next;}
	public abstract void draw();//추상 메소드
}

class Line extends Shape{ //Shape를 상속받은 Line 클래스 생성
	public void draw() {
		System.out.println("─");
	}
}

class Rect extends Shape{ //Shape를 상속받은 Rect 클래스 생성
	public void draw() {
		System.out.println("□");
	}
}

class Circle extends Shape{ //Shape를 상속받은 Circle 클래스 생성
	public void draw() {
		System.out.println("○");
	}
}