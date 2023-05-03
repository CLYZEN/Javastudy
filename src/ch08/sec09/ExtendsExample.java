package ch08.sec09;

public class ExtendsExample {
	public static void main(String[] args) {
		// InterfaceC가 InterfaceA, InterfaceB를
		// 상속하고 있으므로 아래와 같이 사용가능
		InterfaceA ia = new InterfaceImpl();
		ia.methodA();
		
		System.out.println("============");
		
		InterfaceB ib = new InterfaceImpl();
		ib.methodB();
		
		System.out.println("============");
		
		// InterfaceC가 InterfaceA, InterfaceB를
		// 상속하고 있으므로 아래와 같이 사용가능
		InterfaceC ic = new InterfaceImpl();
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
		
	}
}
