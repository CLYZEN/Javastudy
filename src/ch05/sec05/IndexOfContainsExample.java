package ch05.sec05;

public class IndexOfContainsExample {
	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		// 1. 원하는 문자를 찾아서 가져오기
		System.out.println("1. 원하는 문자를 찾아서 가져오기");
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		String substring = subject.substring(location);
		System.out.println(substring);
		
		System.out.println("2. 해당 문자열이 있는지 찾아오기");
		// 2. 해당 문자열이 있는지 찾아오기
		String str = "자바";
		location = subject.indexOf(str); // 찾는 문자가 없을 시 -1 return
		if (location == -1) {
			System.out.println("해당 문자열이 없습니다.");
		} else {
			System.out.println("해당 문자열이 있습니다.");
			
			String substring2 = subject.substring(location, str.length());
			System.out.println(substring2);
		}
		
		System.out.println("3. contains");
		boolean result = subject.contains("자2바");
		if(result) {
			System.out.println("해당 문자열이 있습니다.");
		} else {
			System.out.println("해당 문자열이 없습니다.");			
		}
		
	}
}
