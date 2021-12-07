
public class Exercise6_24 {

	public static int abs(int value) { //반환타입:int, 함수명 abs, 매개변수 : int value
		if(value >=0) {		//입력받은 value의 값이 0보다 크거나 같다면
			return value;	//value값 반환
		} 
		else {
			return -value; // value가 음수인 경우, 부호를 변경한다.
		}
	}
	
	public static void main(String[] args){
		int value = 5;
		System.out.println(value+"의 절대값:"+abs(value));
		value = -10;
		System.out.println(value+"의 절대값:"+abs(value));
	}
}

