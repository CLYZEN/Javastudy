package ch08.sec07;

public interface Service {
	
	default void defaultMethod1() {
		System.out.println("defaultMethod1 종속");
		defaultCommon();
	}
	
	default void defaultMethod2() {
		System.out.println("defaultMethod2 종속");
		defaultCommon();
	}
	
	// private method => 사용 시 구현객체 필요
	private void defaultCommon() {
		System.out.println("defaultComon 중복A");
		System.out.println("defaultComon 중복B");
	}
	
	static void staticMethod1() {
		System.out.println("staticMethod1 메소드 종속코드");
		staticCommon();
	}
	
	static void staticMethod2() {
		System.out.println("staticMethod2 메소드 종속코드");
		staticCommon();
	}
	
	private static void staticCommon() {
		System.out.println("staticstaticCommon 메소드 중복코드C");
		System.out.println("staticstaticCommon 메소드 중복코드D");
	}
}
