package java_js;

class MyTv2{
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prechannel;//현재채널을 저장할 prechannel추가
	
	final int MAX_VOLUME=100;
	final int MIN_VOLUME=0;
	final int MAX_CHANNEL=100;
	final int MIN_CHANNEL=1;
	
	//setPower()가 호출되면 isPowerOn의 값이 바뀜(true<->false)
	public void setPower() {this.isPowerOn=!(isPowerOn);}
		public boolean getPower() {return isPowerOn;}
	public void setChannel(int chan) {
		if(chan>=MIN_CHANNEL && chan<=MAX_CHANNEL) {
			prechannel=channel;//현재channel을 prechannel에 저장
			this.channel=chan;
		}
	}
	public int getChannel() {return channel;}
	public void setVolume(int vol) {
		if(volume>=MIN_VOLUME&&volume<=MAX_VOLUME) {
			this.volume=vol;
		}
	}
	public int getVolume() {return volume;}
	public int gotoPrevChannel() {
		int pre;	//현재 채널의 값을 저장하고 리턴 시켜주기위한 변수 pre
		pre=channel;//현재 채널을 pre에 담고
		channel=prechannel;//channel에 prechannel을 담은후
		prechannel=pre; //prechannel에 pre에 담아두었던 channel의 값을 저장
		return channel; //channel 반환 =>이전채널이 channel로 넘어옴.
		}
}

public class Exercise_7_10 {

	public static void main(String[] args) {
		MyTv2 t= new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH: "+t.getChannel());
		t.setVolume(20);
		System.out.println("VOL: "+t.getVolume());
		
		
		t.setChannel(10);
		System.out.println("CH: "+t.getChannel());
		t.setChannel(20);
		System.out.println("CH: "+t.getChannel());
		t.gotoPrevChannel();//ch=10이됨.
		System.out.println("CH: "+t.getChannel());
		t.gotoPrevChannel();//ch=20이됨.
		System.out.println("CH: "+t.getChannel());

	}

}
