class Exercise6_23{
	public static int max(int[] arr) {
		if(arr==null || arr.length==0)	//arr이 null이거나 길이가 0이라면 
			return -999999;				//-999999반환
		int max = arr[0]; // 배열의 첫 번째 값으로 최대값을 초기화 한다.
		for(int i=1; i< arr.length;i++) { // 배열의 두 번째 값부터 비교한다.
			if(arr[i] > max)	//arr[i]번째의 값이 max(현재 저장된arr[0]부터 시작)보다 크다면
				max = arr[i];	//max는 arr[i]번째값으로 대입
		}
		return max;  //for문 반복후 max반환.<<<가장 큰값이 됨.
	}
	public static void main(String[] args)
	{
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:"+max(data));
		System.out.println("최대값:"+max(null));
		System.out.println("최대값:"+max(new int[]{})); // 크기가 0인 배열
	}
}
