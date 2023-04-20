package ch02.sec09;

public class OperationExample {
	public static void main(String[] args) {
//		byte short char 끼리 연산 시 int로 -> int 에 결과 담아야함.
		 byte v1 = 10;
		 byte v2 = 20;
		 int result1 = v1 + v2;
		 System.out.println(result1);
//		 타입이 다양할 경우 허용범위 큰타입으로 -> 큰타입에 결과 담아야함.
		 byte v3 = 10;
		 int v4 = 100;
		 long v5 = 1000L;
		 long result2 = v3 + v4 + v5;
		 System.out.println(result2);
		 
		 char v6 = 'A';
		 char v7 = 1;
		 int result3 = v6 + v7;
		 System.out.println(result3);
		 System.out.println((char)result3);
		 
		 int v8 = 10;
		 double result4 = v8 / 4;
		 System.out.println(result4);
		 
		 // 정수로 실수 결과 얻기
		 int v9 = 10;
		 double result5 = v9 / 4.0;
		 System.out.println(result5);
		 
		 int v10 = 1;
		 int v11 = 2;
		 double result6 = (double) v10 / v11;
		 System.out.println(result6);
		 
	}
}
