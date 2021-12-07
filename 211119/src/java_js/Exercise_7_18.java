package java_js;

class Exercise_7_18 { //�Ʒ� ��ӹ��� ��ü�� ��� �θ����ִ� �Լ� �ۼ�
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
		System.out.println("������ϴ�.");
	}
}

class singRobot extends Robot{
	void sing() {
		System.out.println("�뷡�� �θ��ϴ�.");
	}
}

class drawRobot extends Robot{
	void draw() {
		System.out.println("�׸��� �׸��ϴ�.");
	}
}
