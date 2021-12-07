class IPTV extends ColorTV1{
	private String ip;
	IPTV(String ip,int size, int color) {
		super(size, color);
		this.ip=ip;
	}
	String getip() {
		return ip;
	}
	void printProperty() {
		System.out.println("나의 IPTV는 "+getip()+" 주소의 "+getSize()+"인치 "+getColor()+"컬러");
	}
}
public class p315_2 {

	public static void main(String[] args) {
		IPTV iptv=new IPTV("192.1.1.2",32,2048);
		
		iptv.printProperty();
		
	}

}
