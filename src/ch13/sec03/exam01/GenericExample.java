package ch13.sec03.exam01;

public class GenericExample {

	public static void main(String[] args) {
		
		Box<Integer> box1 = boxing(100);
		System.out.println(box1.getT());
		
		Box<String> box2 = boxing("홍길동");
		System.out.println(box2.getT());
		
	}
	
	// Generic Method
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<>();
		box.setT(t);
		return box;
	}
	
}
