package singletone.print;

public class Printer {
	private static Printer printer = null;

	private Printer() {
	}
	
	public static Printer getPrinter() {
		if (printer == null) {			
			printer = new Printer(); // printer 생성
		} 
		return printer; // 원래 쓰던 프린터 객체 리턴
	}
	
	public void print(String str) {
		System.out.println(str);
	}
}
