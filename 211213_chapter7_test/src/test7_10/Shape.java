package test7_10;

abstract class Shape{
	private Shape next;
	public Shape() {next=null;}
	public void setNext(Shape obj) {next=obj;};//��ũ����
	public Shape getNext() {return next;}
	public abstract void draw();//�߻� �޼ҵ�
}

class Line extends Shape{ //Shape�� ��ӹ��� Line Ŭ���� ����
	public void draw() {
		System.out.println("��");
	}
}

class Rect extends Shape{ //Shape�� ��ӹ��� Rect Ŭ���� ����
	public void draw() {
		System.out.println("��");
	}
}

class Circle extends Shape{ //Shape�� ��ӹ��� Circle Ŭ���� ����
	public void draw() {
		System.out.println("��");
	}
}