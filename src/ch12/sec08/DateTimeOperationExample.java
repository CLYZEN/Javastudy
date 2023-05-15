package ch12.sec08;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class DateTimeOperationExample {
	public static void main(String[] args) {
		// Date, Calendar : 날짜를 보여줄때
		// LocalDateTime : 날짜 연산이 가능하다.
		LocalDateTime now = LocalDateTime.now(); // 현재 날짜 구해줌.
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd aHH:mm:ss");
		
		System.out.println("현재 시간 : " + now.format(dtf));
		
		LocalDateTime result1 = now.plusYears(1); // 1년 후
		System.out.println(result1.format(dtf));
		
		LocalDateTime result2 = now.plusHours(15); // 15 시간 후
		System.out.println(result2.format(dtf));
		
		LocalDateTime result3 = now.minusMonths(2); // 2달 전
		System.out.println(result3.format(dtf));
		
		LocalDateTime result4 = now.plusDays(7); // 7 일 후
		System.out.println(result4.format(dtf));
	}
}
