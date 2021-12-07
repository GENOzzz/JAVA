package pack211109;

import java.util.Scanner;

abstract class GameObject{ //추상클래스
	protected int distance;//한 번 이동 거리
	protected int x,y; //현재위치 (화면 맵상의 위치)
	public GameObject(int startX, int startY, int distance) {//초기위치와 이동거리설정
		this.x=startX;
		this.y=startY;
		this.distance=distance;
	}
	public int getX() {return x;}
	public int getY() {return y;}
	public boolean collide(GameObject p) { //객체가 p와 충돌하면 true
		if(this.x==p.getX() && this.y == p.getY())
			return true;
		else
			return false;
	}
	protected abstract void move();//이동후의 새로운위치로 x y 변경
	protected abstract char getShape();//객체의 모양을 나타내는 문자리턴
}

class Bear extends GameObject{ //GameObject를 상속받은 Bear클래스 생성
	Scanner scan=new Scanner(System.in);
	
	Bear(int startX,int startY, int distance){
		super(startX,startY,distance);
	}
	
	public void move() { //Bear객체를 움직이는 move
		System.out.print("왼쪽(a),아래(s),오른쪽(d),위(w) 후 엔터>>");
		
		String m=scan.next();
		
		switch(m) {
		case"a":
			if(y==0) {
				System.out.println("그쪽으론 못가지롱");
				return;
			}
			this.y--;
			break;
		case"s":
			if(x==9) {
				System.out.println("그쪽으론 못가지롱");
				return;
			}
			this.x++;
			break;
		case"d":
			if(y==19) {
				System.out.println("그쪽으로 못가지롱");
				return;
			}
			this.y++;
			break;
		case"w":
			if(x==0) {
				System.out.println("그쪽으로 못가지롱");
				return;
			}
			this.x--;
			break;
		default:
			System.out.println("------------wasd중에 입력해 주십시오------------");
		}
	}
	
	public char getShape() { //Bear객체의 형태를 정해 불러오는 함수
		return 'B';
	}
}

class Fish extends GameObject{ //Fish 클래스 선언
	Scanner scan=new Scanner(System.in);
	
	Fish(int startX,int startY, int distance){
		super(startX,startY,distance);
	}
	
	public void move() { //Fish를 움직이는 함수
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

class maingame{//200칸짜리 2차원 배열을 생성하기 위한 메인게임 클래스
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
				System.out.println("곰이 물고기를 잡아따!!");
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
				System.out.println("물고기가 곰을 잡아따!!");
				break;
			}
		}
	}
	public static void main(String[] args) {
		maingame game=new maingame();
		game.game();
	}

}
