class Exercise6_6 {
	// 두 점 (x,y)와 (x1,y1)간의 거리를 구한다.
	static double getDistance(int x, int y, int x1, int y1) {
		return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));	//두점사이의 거리를 구하는 공식.
	}														//Math.sqrt()는 제곱근을 구하는 명령어다.
	public static void main(String args[]) {
		System.out.println(getDistance(1,1,2,2));
	}
}