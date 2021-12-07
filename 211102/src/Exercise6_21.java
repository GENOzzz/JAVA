class MyTV {
	boolean isPowerOn;
	int channel;
	int volume;
	final int MAX_VOLUME = 100;		
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;		//���� �տ� final ���� ����� ����ϰڴٴ� ��;(�Ŀ� ���� ����Ұ�)
	void turnOnOff() {
		isPowerOn = !isPowerOn;		//powerOn�� true��� false�� false��� true�ιٲ۴�.
	}
	void volumeUp() {
		if(volume < MAX_VOLUME)		//���� volume�� ���� MAX_VOLUME���� �۴ٸ�
			volume++;				//volume++�Ѵ�.
	}
	void volumeDown() {
		if(volume > MIN_VOLUME)		//���� volume�� ���� MIN_VOLUME���� ũ�ٸ�
			volume--;				//volume--�Ѵ�.
	}
	void channelUp() {
		channel++;					//channel++�ϰ�
		if(channel>MAX_CHANNEL) {	//channel�� ���� MAX_CHANNEL���� ũ�ٸ�
			channel=MIN_CHANNEL;	//channel�� MIN_CHANNEL������ ����
		}
	}
	void channelDown() {
		channel--;					//channel--�ϰ�
		if(channel<MIN_CHANNEL) {	//channel�� ���� MIN_CHANNEL���� �۴ٸ�
			channel=MAX_CHANNEL;	//channel�� MAX_CHANNEL������ ����
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
