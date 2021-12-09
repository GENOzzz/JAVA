package chapter6_1207;

import java.util.Calendar;

public class Ex6_11 {
	public static void printCalendar(String msg,Calendar cal) {
		int year = cal.get(Calendar.YEAR);
		int month=cal.get(Calendar.MONTH)+1;//get()은 0~30까지의 정수 리턴
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek=cal.get(Calendar.DAY_OF_WEEK);
		int hour = cal.get(Calendar.HOUR);
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
		int ampm = cal.get(Calendar.AM_PM);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int millisecond=cal.get(Calendar.MILLISECOND);
		System.out.print(msg+year+"/"+month+"/"+day+"/");
		
		switch(dayOfWeek) {
		case Calendar.SUNDAY : System.out.print("일요일");break;
		case Calendar.MONDAY : System.out.print("월요일");break;
		case Calendar.TUESDAY : System.out.print("화요일");break;
		case Calendar.WEDNESDAY : System.out.print("수요일");break;
		case Calendar.THURSDAY : System.out.print("목요일");break;
		case Calendar.FRIDAY : System.out.print("금요일");break;
		case Calendar.SATURDAY : System.out.print("토요일");break;
		}
		
		System.out.print("("+hourOfDay+"시)");
		if(ampm==Calendar.AM)
			System.out.print("오전");
		else
			System.out.print("오후");
		
		System.out.println(hour+"시 "+minute+"분 "+second+"초 "+millisecond+"밀리초");
	}
	public static void main(String[] args) {
		Calendar now=Calendar.getInstance();
		printCalendar("현재",now);
		
		Calendar firstDate = Calendar.getInstance();
		firstDate.clear();//현재 날짜와 시간정보를 모두 지운다.
		firstDate.set(1994,6,19);//1994년 7월 25일, 7월을 표현하기위해 month 6으로 설정.
		
		firstDate.set(Calendar.HOUR_OF_DAY,20);//저녁 8시
		firstDate.set(Calendar.MINUTE,30);//30분
		printCalendar("내가 태어난 날은",firstDate);
	}

}
