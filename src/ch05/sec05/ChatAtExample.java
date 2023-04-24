package ch05.sec05;

public class ChatAtExample {
	public static void main(String[] args) {
		String ssn = "950624 1230123";
		char sex = ssn.charAt(7);
		int length = ssn.length();
		String newStr = ssn.replace(" ", "-");
		System.out.println(newStr);
		if(length == 14) {
			System.out.println("주민등록번호 자릿수가 맞습니다.");
		} else {
			System.out.println("주민등록번호 자릿수가 맞지 않습니다.");
		}
		
		switch (sex) {
		case '1':
		case '3':
			System.out.println("성별 : 남");
			break;
		case '2':
		case '4':
			System.out.println("성별 : 여");
			break;
		default :
			System.out.println("정상적인주민번호아님");
			break;
		}
	}
}
