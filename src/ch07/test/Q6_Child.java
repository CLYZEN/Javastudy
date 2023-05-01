package ch07.test;

public class Q6_Child extends Q6_Parent {
//	Q6_Parent parent = new Q6_Child();
//	Q6_Child child = (Q6_Child)parent;
	public int studentNo;
	Q6_Parent parent = new Q6_Parent(name);
	// Q6_Child 생성자에서 부모의 필드에 접근하지만 자동타입변환 하지 않았기 떄문.
	public Q6_Child(String name, int studentNo) {
		this.name = name;
		this.studentNo = studentNo;
	}
}
