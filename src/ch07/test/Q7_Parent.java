package ch07.test;

public class Q7_Parent {
	public String nation;
	
	public Q7_Parent() {
		this("대한민국");
		System.out.println("Q7_Parent() Call");
	}
	
	public Q7_Parent(String nation) {
		this.nation = nation;
		System.out.println("Q7_Parent(String nation) Call");
	}
}
