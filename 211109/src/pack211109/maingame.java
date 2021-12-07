package pack211109;

import java.util.Scanner;

abstract class GameObject{ //�߻�Ŭ����
	protected int distance;//�� �� �̵� �Ÿ�
	protected int x,y; //������ġ (ȭ�� �ʻ��� ��ġ)
	public GameObject(int startX, int startY, int distance) {//�ʱ���ġ�� �̵��Ÿ�����
		this.x=startX;
		this.y=startY;
		this.distance=distance;
	}
	public int getX() {return x;}
	public int getY() {return y;}
	public boolean collide(GameObject p) { //��ü�� p�� �浹�ϸ� true
		if(this.x==p.getX() && this.y == p.getY())
			return true;
		else
			return false;
	}
	protected abstract void move();//�̵����� ���ο���ġ�� x y ����
	protected abstract char getShape();//��ü�� ����� ��Ÿ���� ���ڸ���
}

class Bear extends GameObject{ //GameObject�� ��ӹ��� BearŬ���� ����
	Scanner scan=new Scanner(System.in);
	
	Bear(int startX,int startY, int distance){
		super(startX,startY,distance);
	}
	
	public void move() { //Bear��ü�� �����̴� move
		System.out.print("����(a),�Ʒ�(s),������(d),��(w) �� ����>>");
		
		String m=scan.next();
		
		switch(m) {
		case"a":
			if(y==0) {
				System.out.println("�������� ��������");
				return;
			}
			this.y--;
			break;
		case"s":
			if(x==9) {
				System.out.println("�������� ��������");
				return;
			}
			this.x++;
			break;
		case"d":
			if(y==19) {
				System.out.println("�������� ��������");
				return;
			}
			this.y++;
			break;
		case"w":
			if(x==0) {
				System.out.println("�������� ��������");
				return;
			}
			this.x--;
			break;
		default:
			System.out.println("------------wasd�߿� �Է��� �ֽʽÿ�------------");
		}
	}
	
	public char getShape() { //Bear��ü�� ���¸� ���� �ҷ����� �Լ�
		return 'B';
	}
}

class Fish extends GameObject{ //Fish Ŭ���� ����
	Scanner scan=new Scanner(System.in);
	
	Fish(int startX,int startY, int distance){
		super(startX,startY,distance);
	}
	
	public void move() { //Fish�� �����̴� �Լ�
		int m = (int)(Math.random()*4);
		switch(m) {
		case 0:
			this.y--;
			if(y==-1) {
				y+=2;
			}
			break;
		case 1:
			this.x++;
			if(x==10) {
				x-=2;
			}
			break;
		case 2:
			this.y++;
			if(y==20) {
				y-=2;
			}
			break;
		case 3:
			this.x--;
			if(x==-1) {
				x+=2;
			}
			break;
		}
	}
	
	public char getShape() {
		return (char)'@';
	}
}

class maingame{//200ĭ¥�� 2���� �迭�� �����ϱ� ���� ���ΰ��� Ŭ����
	static GameObject [][] space1 = new GameObject[10][20];
	static int i;
	static int j;
	Bear B= new Bear(0,0,0);
	Fish F = new Fish((int) (Math.random()*9+1),(int)(Math.random()*19+1),0);
	maingame() {}
	
	public void spaceset() {
		for(i=0;i<10;i++)
			for(j=0;j<20;j++) {
				space1[i][j]=null;
			}
		space1[B.getX()][B.getY()]=B;
		space1[F.getX()][F.getY()]=F;
	}
	
	public void show() {
		for(int k=0;k<10;k++)
			for(int l=0;l<20;l++) {
				if(space1[k][l]==null) {
					System.out.print(" - ");
					if(l%20==19)
						System.out.println();
				}
				else {
					System.out.print(" "+space1[k][l].getShape()+" ");
					if(l%20==19)
						System.out.println();
				}
			}
	}

	public void game() {
		spaceset();
		int z=0;
		while(true) {
			show();
			space1[B.getX()][B.getY()]=null;
			B.move();
			space1[B.x][B.y]=B;
			z++;
			if(B.collide(F)) {
				show();
				System.out.println("���� ����⸦ ��Ƶ�!!");
				break;
			}
			if (z>3&&z<6) {
				space1[F.getX()][F.getY()]=null;
				F.move();
				space1[F.x][F.y]=F;
			}
			else if(z==6) {
				z=0;
			}
			if(B.collide(F)) {
				show();
				System.out.println("����Ⱑ ���� ��Ƶ�!!");
				break;
			}
		}
	}
	public static void main(String[] args) {
		maingame game=new maingame();
		game.game();
	}

}
