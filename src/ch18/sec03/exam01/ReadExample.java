package ch18.sec03.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadExample {
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("C:/Temp/test1.db");

			while (true) {
				int data = is.read(); // 1byte씩 데이터를 읽어옴

				if (data == -1) // 데이터 없을 시 -1 리턴
					break;

				System.out.println(data); // 출력
			}
			is.close();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
