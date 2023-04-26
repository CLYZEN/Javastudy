package ch06.sec08.exam04;

public class Carculator {
	// 필드 생성자 없음
	
	// 메소드
	// 메소드 오버로딩 : 
	// 같은 이름을 가진 메소드 여러개
	// 기능은 같지만 메소드 안의 코드가 달라야 할 때 사용
	// 1. 메소드 이름은 무조건 같아야 한다.
	// 2. 타입, 갯수, 순서 중 하나는 달라야 한다.
	
	double areaRectangle (double width) {
		return width * width; // 정사각형의 넓이
	}
	double areaRectangle (double width, double height) {
		return width * height; // 직사각형의 넓이
	}
}
