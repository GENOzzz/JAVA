class Exercise6_22 {
	public static boolean isNumber(String str) { //반환타입:boolean, 함수명 : isNumber, 매개변수:String str. 
		if(str==null||str.contentEquals(""))	//입력받은 str이 nuull이거나 아무것도 없다면
				return false;					//false 반환
		for(int i=0; i< str.length();i++) {		//i=0부터 i<str의 길이 만큼 반복
			char ch = str.charAt(i);			//str(i)번째의 문자를 ch에 저장
			if(ch < '0' || ch > '9') {			//ch 의 값이 '0'보다 작거나 '9'보다 크다면 <<<아스키 코드상으로 숫자가 아니라면(그림으로 비교)
				return false;					//false 반환
			}
		}return true;							//외의 조건은 true 반환 <<< 입력받은 str의 모든 문자가 숫자라면.
	}	
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
		str = "1234o";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
	}
}