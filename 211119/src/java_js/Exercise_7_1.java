package java_js;
class SutdaDeck{
	final int CARD_NUM=20;
	SutdaCard[] cards=new SutdaCard[CARD_NUM];
	
	SutdaDeck(){
		for(int i=0;i<2;i++) { //SutdaDeck ������.
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
	void shuffle() { //SutdaDeck�� SutdaCard cards[]�� ���� �Լ�.
		SutdaCard card;
		for(int i=0;i<20;i++) {
			int s=(int)(Math.random()*20); //s�� 0~19���� ������ ���� ����
			card=cards[i];	//cards[i]��°�� card�� ����
			cards[i]=cards[s];//cards[i]��°�� cards[s]��°�� ����
			cards[s]=card;//cards[s]��°�� card�� ������ִ� cards[i]��°�� ���� �ѱ�.
		}
	}
	
	SutdaCard pick(int index) {//cards[index]�� ã�� �����ִ� �Լ�.
		SutdaCard card = null;
		card=cards[index];
		return card;
	}
	
	SutdaCard pick() {//������ġ ī�� ��ȯ
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
	//info()��� ObjectŬ������ toString()�� �������̵� �ߴ�.
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
