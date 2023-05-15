package Question;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Sec11Q16_SimpleDateFormat {

	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월dd일 E요일 HH시 mm분");
		
		System.out.println(sdf.format(now));
	}

}
