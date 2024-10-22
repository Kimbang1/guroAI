package pack;

import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		
		Week today = null;
		String txt = null;
		
		Calendar calendar = Calendar.getInstance(); //시간은 전세계적으로 하나이기에
		
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("dayOfWeek : " + dayOfWeek); 	//수업 당일 화요일이어서
		
		switch(dayOfWeek) {
		case 1:
			today = Week.MONDAY;
			break;
		case 2:
			today = Week.TUSEDAY;
			break;
		case 3:
			today = Week.SATURDAY;
			break;
		case 4:
			today = Week.THURSDAY;
			break;
		case 5:
			today = Week.FRIDAY;
			break;
		case 6:
			today = Week.SATURDAY;
			break;
		case 7:
			today = Week.SUNDAY;
			break;
		}
	
	System.out.println("dayOfWeek : " + dayOfWeek);
	}

}






















