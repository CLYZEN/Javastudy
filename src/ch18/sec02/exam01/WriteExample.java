package ch18.sec02.exam01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("C:/Temp/test1.db");
			
			byte a = 10;
			byte b = 20;
			byte c = 30;
			
			// 출력
			os.write(a);
			os.write(b);
			os.write(c);
			
			// 버퍼에 잔류하는 데이터를 비워줌.
			os.flush();
			
			// 리소스 닫기
			os.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
