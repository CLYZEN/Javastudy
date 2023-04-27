package ch06.sec11.exam02;

public class Earth {
	// 상수 필드
	// 상수명 대문자
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	// 인스턴스 필드
	int personCount;
	
	// 정적 블록으로 상수 초기화
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
}
