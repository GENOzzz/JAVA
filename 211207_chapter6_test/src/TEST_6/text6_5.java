package TEST_6;

import java.util.Calendar;

public class text6_5 {
	public static void nowclock(Calendar cal) {
		int ampm=cal.get(Calendar.AM_PM);
		int h = cal.get(Calendar.HOUR);
		int m = cal.get(Calendar.MINUTE);
		System.out.print("현재시간은 : ");
		if(ampm==Calendar.AM)
			System.out.print("오전 ");
		else
			System.out.print("오후 ");
		System.out.println(h+"시"+m+"분 입니다.");
	}
	public static void sayhello(Calendar cal) {
		int h=cal.get(Calendar.HOUR_OF_DAY);
		if(h>4&&h<12) System.out.println("Good Morning");
		else if(h<18) System.out.println("Good Afternoon");
		else if(h<22) System.out.println("Good Evening");
		else System.out.println("Good Night");
	}
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		nowclock(now);
		sayhello(now);
	}
}
