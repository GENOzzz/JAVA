package TEST_6;

import java.util.Calendar;

public class text6_5 {
	public static void nowclock(Calendar cal) {
		int ampm=cal.get(Calendar.AM_PM);
		int h = cal.get(Calendar.HOUR);
		int m = cal.get(Calendar.MINUTE);
		System.out.print("����ð��� : ");
		if(ampm==Calendar.AM)
			System.out.print("���� ");
		else
			System.out.print("���� ");
		System.out.println(h+"��"+m+"�� �Դϴ�.");
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
