
public class Exercise6_8 {

	
	class PlayingCard {
		int kind;	//kind = 인스턴스변수
		int num;	//num = 인스턴스
		//static int width; //width = 클래스변수
		//static int height;//height = 클래스변수
		PlayingCard(int k, int n) {
			kind = k;	//k=지역변수
			num = n;	//n=지역변수
		}
		//public static void main(String args[]) {//args= 지역변수
			PlayingCard card = new PlayingCard(1,1);
		}				//card=지역변수
	}
//}
