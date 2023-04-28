package ch07.sec07.exam02;

public class ChildExample {
	public static void main(String[] args) {
		// 자동 타입 변환1
		/*
		 * Child child = new Child(); Parent parent1 = child;
		 */

		// 자동 타입 변환2
		Parent parent = new Child();

		// 2. 자동 타입 변환 시 자식클래스에서 override 시 override 된 메소드 호출
		parent.method1();
		parent.method2(); // Child 에서 override되었음으로 override된 메소드 호출

		parent.parentField = 10;

		// 1. 자동 타입 변환 시 부모클래스에 선언된 필드와 메소드만 접근 가능.
		// parent.method3(); // 자식인 Child 클래스의 고유한 메소드라 호출 불가능
		// parent.childField = 10;

		// 강제 타입변환
		Child child = (Child) parent;
		child.method3();
		child.childField = 10;
		child.method2();
		child.parentField = 10;
	}
}
