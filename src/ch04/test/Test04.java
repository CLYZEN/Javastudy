package ch04.test;

public class Test04 {
	public static void main(String[] args) {
		while(true) {
			int a = (int) (Math.random() * 6) + 1;
			int b = (int) (Math.random() * 6) + 1;
			if(a+b==5) {
				System.out.println(a+","+b);
				break;
			}
		}
//		while(a+b ==5) {
//			System.out.println(a);
//			System.out.println(b);
//			System.out.println("눈의 합이 5가 되는 경우는" + a + "," + b + "입니다.");
//			break;				
//		}
	}
}
