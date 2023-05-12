package ch11.sec05;

public class ThrowsExample1 {

	// main 에서 throw 시 jvm에서 Exception 처리 해줌
	public static void main(String[] args) throws ClassNotFoundException {
			findCalss();
	}
	
	public static void findCalss() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
	}

}
