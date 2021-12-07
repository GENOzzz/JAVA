package java_js;

class Exercise_7_18 { //아래 상속받은 객체를 모두 부를수있는 함수 작성
	public static void  action(Robot ai){
		if(ai instanceof danceRobot ) {
			((danceRobot)ai).dance();
		}
		else if(ai instanceof singRobot ) {
			((singRobot)ai).sing();
		}
		if(ai instanceof drawRobot ) {
			((drawRobot)ai).draw();
		}
	}

	public static void main(String[] args) {
		Robot[]arr= {new danceRobot(),new singRobot(), new drawRobot()};
		for(int i=0;i<arr.length;i++)
			action(arr[i]);
	}

}

class Robot{}

class danceRobot extends Robot{
	void dance() {
		System.out.println("춤을춥니다.");
	}
}

class singRobot extends Robot{
	void sing() {
		System.out.println("노래를 부릅니다.");
	}
}

class drawRobot extends Robot{
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}
