package ch07.sec10.exam01;

public class SmartPhone extends Phone {
	// 생성자
	SmartPhone(String owner) {
		// 추상클래스가 부모이면 반드시 부모클래스의 생성자 호출 해야 함.
		super(owner);
	}
	
	// 메소드
	void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
	
}
