package ch02.sec06;

import java.io.Console;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "홍길동";
		String job = "개발자";
		
		System.out.println(name);
		System.out.println(job);
		
		String str = "나는 \"자바\" 를 배웁니다";
		System.out.println(str);
		
		str = "번호\t이름\t직업";
		System.out.println(str);

		str = "나는 \n자바를 \n배웁니다.";
		System.out.println(str);
		
		String result = name + str;
		System.out.println(result);

	}

}
