package java_js;

public class Exercise7_19 {
	public static void main(String[] args) {
		Buyer b=new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
		b.summary();
	}
}
class Buyer{
	int money=1000;
	Product[]cart=new Product[3];//������ ��ǰ�� �����ϱ� ���� �迭
	int i=0;
	
	void buy(Product p) {	//ProductŸ�� ��üp�� �Ű������� �޴� �Լ� buy
		if(money<p.price) {	//�����ѵ�(money)�� ��üp�� price���� ���ٸ�.
			System.out.println("�ܾ��� �����Ͽ�"+p.toString()+"��/�� ����� �����.");
		}
		else if(money>=p.price){//�װ� �ƴϰ� ũ�ų� ���ٸ�
			money-=p.price;//money�� p.price�� �����Ͽ� ��
			add(p);//add(p)ȣ��(īƮ�� ������ ���.)
		}
	}
	
	void add(Product p) { //ProductŸ�� ��üp�� �Ű������� �޴� �Լ� add
		Product[]old;//ProductŸ���� �����Ҽ��ִ� �迭 ���۷��� old����.
		if(i>=cart.length) {//i�� īƮ�� ���̺��� ���ų� ���(i�� 0���� ��� īƮ���̴� 1���� ����
			old=cart;//old�� īƮ�� ����
			cart=new Product[cart.length*2];//īƮ�� ���̸� ���������� 2��� Ű��
			for(int j=0;j<old.length;j++) {//for���鼭
				cart[j]=old[j];//īƮ�� �ٽ� oldīƮ�� ����ִ� ������ ��ƿ�
			}
		}
		cart[i]=p;//�Ŀ� īƮ�� i��°�� ���� �߰�.
		i++;
	}
	
	void summary() {//������ ������ ���հ� ���� �ݾ��� ���ϴ� �Լ� summary()
		int sum=0;
		System.out.print("������ ���� : ");
		for(int j=0;j<cart.length;j++) {
			if(cart[j]==null)break;
			System.out.print(cart[j].toString()+", ");
			sum+=cart[j].price;
		}
		System.out.println();
		System.out.println("����� �ݾ� : "+sum);
		System.out.println("���� �ݾ� : "+money);
	}
}

class Product{
	int price; //��ǰ�� ����
	Product(int price) {
		this.price=price;
	}
}

class Tv extends Product{
	Tv(){super(100);}
	public String toString() {return "Tv";}
}

class Computer extends Product{
	Computer(){super(200);}
	public String toString() {return "Computer";}
}

class Audio extends Product{
	Audio(){super(50);}
	public String toString() {return "Audio";}
}





