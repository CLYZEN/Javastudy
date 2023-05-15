package Question;

public class Sec11Q10_StringBuilderExample {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder();
		for(int i=1; i<=100; i++) {
			str.append(i);
		}
		System.out.println(str);
	}
}
