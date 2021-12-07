import java.util.Scanner;

class Dictionary{
	private static String[] kor= {"사랑","아기","돈","미래","희망"};
	private static String[] eng= {"love","baby","money","future","hope"};
	
	public static String kor2Eng(String word) {	//문자열을 매개변수로하는 kor2Eng함수 선언
		for(int i=0; i < kor.length;i++) {		//kor의 길이만큼 i 반복 <<<kor은 해당 클래스의 static 배열이므로 this불필요
			if(word.equals(kor[i])) {			//매개변수 word가 kor배열의 i번째와 같다면
				return eng[i];					//eng배열의 i번째를 돌려줌 <<<eng도 해당클래스의 static 배열이므로 this불필요
			}
		}return null;
	}
}
public class DicApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("5개짜리 단어 검색 사전입니다.");
		while(true) {	
			System.out.print("한글?>>");		//사용자로부터 문자열 입력받음
				String word=scan.next();	//word에 저장
				Dictionary.kor2Eng(word);	//해당 word로 kor2eng함수 호출 <<< static은 class의 이름으로 호출가능
				if(word.equals("그만"))		//입력받은 word가 그만이라면
					break;					//탈출
				if(Dictionary.kor2Eng(word)==null)	//위 kor2eng함수가 null을 return하면 
					System.out.println("내 사전에 없지롱");	//없지롱 출력
				else								//외의경우 <<null이 아니라면  eng[i]를 돌려받은상태가됨
					System.out.println(word+"는"+Dictionary.kor2Eng(word)+"입니다");//word는 함수(word)입니다 출력.
					
		}
		scan.close();
	}

}
