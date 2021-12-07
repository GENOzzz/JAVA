package java_js;
class SutdaDeck{
	final int CARD_NUM=20;
	SutdaCard[] cards=new SutdaCard[CARD_NUM];
	
	SutdaDeck(){
		for(int i=0;i<2;i++) { //SutdaDeck 생성자.
			for(int k=0;k<10;k++) {
				if(i==0) {
					if(k==0||k==2|k==7)
						cards[k]=new SutdaCard(k+1,true);
					else
						cards[k]=new SutdaCard(k+1,false);
				}
				else
					cards[k+10]=new SutdaCard(k+1,false);
			}
			
		}
	}
	void shuffle() { //SutdaDeck의 SutdaCard cards[]를 섞는 함수.
		SutdaCard card;
		for(int i=0;i<20;i++) {
			int s=(int)(Math.random()*20); //s에 0~19까지 랜덤한 수를 저장
			card=cards[i];	//cards[i]번째를 card에 저장
			cards[i]=cards[s];//cards[i]번째에 cards[s]번째를 저장
			cards[s]=card;//cards[s]번째에 card에 저장되있던 cards[i]번째의 값을 넘김.
		}
	}
	
	SutdaCard pick(int index) {//cards[index]를 찾아 돌려주는 함수.
		SutdaCard card = null;
		card=cards[index];
		return card;
	}
	
	SutdaCard pick() {//랜덤뒤치 카드 반환
		SutdaCard card=null;
		int r=(int)(Math.random()*20);
		card=cards[r];
		return card;
	}
	
}

class SutdaCard{
	private int num;
	private boolean isKwang;
	
	SutdaCard() {
		this.num=1;
		boolean isKwang=true;
	}
	
	SutdaCard(int num,boolean isKwang){
		this.num=num;
		this.isKwang=isKwang;
	}
	//info()대신 Object클래스의 toString()을 오버라이딩 했다.
	public String toString() {
		return num+(isKwang?"k":"");
	}
}

public class Exercise_7_1 {

	public static void main(String[] args) {
		SutdaDeck deck=new SutdaDeck();
		for(int i=0;i<deck.cards.length;i++)
			System.out.print(deck.cards[i]+", ");
		System.out.println("");
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for(int i = 0;i<deck.cards.length;i++)
			System.out.print(deck.cards[i]+", ");
		System.out.println("");
		System.out.println(deck.pick(0));
	}
}
