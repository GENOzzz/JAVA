class MyTV {
	boolean isPowerOn;
	int channel;
	int volume;
	final int MAX_VOLUME = 100;		
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;		//변수 앞에 final 사용시 상수로 사용하겠다는 뜻;(후에 사용시 변경불가)
	void turnOnOff() {
		isPowerOn = !isPowerOn;		//powerOn이 true라면 false로 false라면 true로바꾼다.
	}
	void volumeUp() {
		if(volume < MAX_VOLUME)		//만약 volume의 값이 MAX_VOLUME보다 작다면
			volume++;				//volume++한다.
	}
	void volumeDown() {
		if(volume > MIN_VOLUME)		//만약 volume의 값이 MIN_VOLUME보다 크다면
			volume--;				//volume--한다.
	}
	void channelUp() {
		channel++;					//channel++하고
		if(channel>MAX_CHANNEL) {	//channel의 값이 MAX_CHANNEL보다 크다면
			channel=MIN_CHANNEL;	//channel에 MIN_CHANNEL값으로 대입
		}
	}
	void channelDown() {
		channel--;					//channel--하고
		if(channel<MIN_CHANNEL) {	//channel의 값이 MIN_CHANNEL보다 작다면
			channel=MAX_CHANNEL;	//channel에 MAX_CHANNEL값으로 대입
		}
	}
}// class MyTV
	class Exercise6_21 {
		public static void main(String args[]) {
			MyTV t = new MyTV();
			t.channel = 100;
			t.volume = 0;
			System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
			t.channelDown();
			t.volumeDown();
			System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
			t.volume = 100;
			t.channelUp();
			t.volumeUp();
			System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
		}
	}
