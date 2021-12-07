class Exercise6_20
{
	public static int[] shuffle(int[] arr) {		//반환값 : int[],함수명 shuffle,매개변수 : int[] arr(정수형배열),
		if(arr==null || arr.length==0)				//만약 arr(배열)이 null이거나 크기가 0이라면 
			return arr;								//arr배열 반환
		for(int i=0; i< arr.length;i++) {			//i=0에서 i<arr의 길이 동안 반복
			int j = (int)(Math.random()*arr.length);//int j 는 arr의 길이만큼 즉 arr배열의 크기까지의 값까지 (0~크기)중 랜덤으로 한 수를 받음
			// arr[i]와 arr[j]의 값을 서로 바꾼다.
			int tmp = arr[i];						//arr[i]자리의 수를 tmp에 저장
			arr[i] = arr[j];						//arr[j]자리의 수를 arr[i]에 저장
			arr[j] = tmp;							//tmp에 받았던 arr[i]자리의 수를 arr[j]에 저장
		}
		return arr;									//arr배열 반환
	}
	
	public static void main(String[] args)
	{
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));	//original 배열 출력
		int[] result = shuffle(original);							//result 배열은 shuffle에 original을 입력한 배열
		System.out.println(java.util.Arrays.toString(result));		//result 출력
	}
}