package Question;

public class Sec11Q6_Member {
	private String id;
	private String name;
	
	public Sec11Q6_Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {

		return id + ": " +name;
	}
}
