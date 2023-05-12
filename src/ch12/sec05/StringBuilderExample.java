package ch12.sec05;

public class StringBuilderExample {

	public static void main(String[] args) {
		// StringBuilder : 문자열을 추가, 삭제 할때 주로 쓴다.
		
		String data = new StringBuilder()
				.append("DEF") // 문자열의 맨끝에추가
				.insert(0, "ABC")
				.delete(3, 4)
				.toString(); // StringBuilder -> String 타입 변경
		System.out.println(data);
		

	}

}
