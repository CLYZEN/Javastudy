package ch05.sec11;

public class MainStringArrayArgumentExample {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("프로그램 입력값이 부족합니다.");
			System.exit(0); // 프로그램 종료
		}

		for (String arg : args) {
			System.out.println(arg);
		}

		String strNum1 = args[0];
		String strNum2 = args[1];

		// 문자열 -> 숫자 변환
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);

		int result = num1 + num2;

		System.out.println(num1 + "+" + num2 + "=" + result);

	}
}
