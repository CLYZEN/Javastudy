package ch18.sec04.exam02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class ReaderExample {
	public static void main(String[] args) {
		Reader reader = null;

		try {
			// 1문자로 읽기
			reader = new FileReader("C:/Temp/test.txt");
			while (true) {
				int data = reader.read(); // 1문자씩 읽기
				if (data == -1)
					break;
				System.out.println((char) data);

			}

			reader.close();
			System.out.println();

			// 배열로 읽기
			reader = new FileReader("C:/Temp/test.txt");
			char[] data = new char[100];

			while (true) {
				int num = reader.read(data); // 1문자씩 읽기
				if (num == -1)
					break;

				for (int i = 0; i < num; i++) {

					System.out.print((char) data[i]);
				}
			}
			reader.close();
			System.out.println();
			
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
