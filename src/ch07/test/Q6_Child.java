package ch07.test;

public class Q6_Child extends Q6_Parent {

	public int studentNo;
	Q6_Parent parent = new Q6_Parent(name);

	public Q6_Child(String name, int studentNo) {
		this.name = name;
		this.studentNo = studentNo;
	}
}
