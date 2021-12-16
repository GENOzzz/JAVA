package test7_06;

import java.util.Scanner;

public class check {
	
		private int cnum;
		
		public int intcheck(String num) {//문자열을 매개변수로
			Scanner scan=new Scanner(System.in);
			char tmp;
			boolean check=false;//와일문 반복을 위한 check
			while(!check) {
				for(int i=0;i<num.length();i++) {//입력받은 문자열 num의 길이만큼반복
					tmp=num.charAt(i);			//각 자리를 tmp에 대입
					if(!(-'9'<=tmp&&tmp<='9')) {///만약 하나라도 -9~9를 벗어 난다면 첫자리가 -로 입력될 경우 선별가능.
						num=null;		//num을 비우고
						System.out.print("정수만 입력해 주시기 바랍니다.>>>");
						num=scan.next();//재입력받아 저장
						i=-1;			//후에 입력받은값을 i=0부터 시작하기위해 -1입력.>>i++로 넘어감.
					}
				}
			num=num.trim();//공백제거
			cnum=Integer.parseInt(num); //int형은 2147483647 까지 밖에 받지 못하므로 num에서 그 숫자가 넘어가는경우
			check=true;					//에러발생.
			}
			return cnum;
		}
}
