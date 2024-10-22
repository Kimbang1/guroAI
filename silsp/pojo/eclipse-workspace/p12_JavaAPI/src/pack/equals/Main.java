package pack.equals;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		int[] num = {7,2,-4,11,0,5};
		System.out.println(num);
		String obj = Arrays.toString(num);
		System.out.println(obj);
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
	/*
	 * LocalDate localDate = LocalDate.now(); LocalDateTime localDateTime =
	 * LocalDateTime.now(); String pattern = "yyyy/MM/dd a hh:mm:ss";
	 * DateTimeFormatter obj = DateTimeFormatter.ofPattern(pattern);
	 * 
	 * System.out.println(obj.format(localDateTime));
	 */

}

}
