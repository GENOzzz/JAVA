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
	Product[]cart=new Product[3];//구입한 제품을 저장하기 위한 배열
	int i=0;
	
	void buy(Product p) {	//Product타입 객체p를 매개변수로 받는 함수 buy
		if(money<p.price) {	//보유한돈(money)이 객체p의 price보다 적다면.
			System.out.println("잔액이 부족하여"+p.toString()+"을/를 살수가 없어요.");
		}
		else if(money>=p.price){//그게 아니고 크거나 같다면
			money-=p.price;//money에 p.price를 누적하여 뺌
			add(p);//add(p)호출(카트에 물건을 담는.)
		}
	}
	
	void add(Product p) { //Product타입 객체p를 매개변수로 받는 함수 add
		Product[]old;//Product타입을 저장할수있는 배열 레퍼런스 old선언.
		if(i>=cart.length) {//i가 카트의 길이보다 같거나 길면(i는 0부터 출발 카트길이는 1부터 시작
			old=cart;//old에 카트를 저장
			cart=new Product[cart.length*2];//카트의 길이를 기존길이의 2배로 키움
			for(int j=0;j<old.length;j++) {//for돌면서
				cart[j]=old[j];//카트에 다시 old카트에 담겨있던 물건을 담아옴
			}
		}
		cart[i]=p;//후에 카트의 i번째에 물건 추가.
		i++;
	}
	
	void summary() {//구입한 물건의 총합과 남은 금액을 구하는 함수 summary()
		int sum=0;
		System.out.print("구입한 물건 : ");
		for(int j=0;j<cart.length;j++) {
			if(cart[j]==null)break;
			System.out.print(cart[j].toString()+", ");
			sum+=cart[j].price;
		}
		System.out.println();
		System.out.println("사용한 금액 : "+sum);
		System.out.println("남은 금액 : "+money);
	}
}

class Product{
	int price; //제품의 가격
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





