package java_js;

class MyTv2{
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prechannel;//����ä���� ������ prechannel�߰�
	
	final int MAX_VOLUME=100;
	final int MIN_VOLUME=0;
	final int MAX_CHANNEL=100;
	final int MIN_CHANNEL=1;
	
	//setPower()�� ȣ��Ǹ� isPowerOn�� ���� �ٲ�(true<->false)
	public void setPower() {this.isPowerOn=!(isPowerOn);}
		public boolean getPower() {return isPowerOn;}
	public void setChannel(int chan) {
		if(chan>=MIN_CHANNEL && chan<=MAX_CHANNEL) {
			prechannel=channel;//����channel�� prechannel�� ����
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
		int pre;	//���� ä���� ���� �����ϰ� ���� �����ֱ����� ���� pre
		pre=channel;//���� ä���� pre�� ���
		channel=prechannel;//channel�� prechannel�� ������
		prechannel=pre; //prechannel�� pre�� ��Ƶξ��� channel�� ���� ����
		return channel; //channel ��ȯ =>����ä���� channel�� �Ѿ��.
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
		t.gotoPrevChannel();//ch=10�̵�.
		System.out.println("CH: "+t.getChannel());
		t.gotoPrevChannel();//ch=20�̵�.
		System.out.println("CH: "+t.getChannel());

	}

}
