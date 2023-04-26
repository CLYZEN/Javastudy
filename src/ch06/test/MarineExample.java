package ch06.test;

public class MarineExample {
	public static void main(String[] args) {
		// 객체는 각각 다르지만 정적필드로 지정한 필드는 모든 객체에서 공유한다.
		Marine marine1 = new Marine();
		Marine marine2 = new Marine();
		Marine marine3 = new Marine();
		
		Marine.armor = 2; // 3명 모두 방어력 2
		Marine.weapon = 10; // 3명 모두 공격력 10
	}
}
