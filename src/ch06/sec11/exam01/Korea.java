package ch06.sec11.exam01;

public class Korea {
	// 인스턴스 final 필드
	// final : 값 변경 불가능
	final String nation = "대한민국";
	final String ssn;
	
	// 인스턴스 필드
	String name;
	
	// 생성자로 final 초기값 주기
	public Korea(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
