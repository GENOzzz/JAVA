package me_1118;

public abstract class Shape {
	private Shape next;
	private Shape prev;
	public Shape() {next=null; prev=null;}
	public void setNext(Shape obj) {next=obj;};//��ũ����
	public void setPre(Shape obj) {prev=obj;}	
	public Shape getNext() {return next;}
	public Shape getPre() {return prev;}
	public abstract void draw();//�߻� �޼ҵ�
}

