package ch04.test;

public class Test10 {
	public static void main(String[] args) {
		int answer = (int) (Math.random() * 100) + 1;
		int input = 0;
		int count = 0;
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		do {
			count++;
			System.out.println("1부터 100 사이의 값을 입력하세요 : ");
			input = s.nextInt();
			if(answer == input) {
				System.out.println(" 내가 입력한 값 : " + input +  " 맞췄어요");
				System.out.println(count + "번만에 맞췄어요");
				break;
			} else {
				System.out.println(" 내가 입력한 값 : " + input + "컴퓨터가 생각한 값 : " + answer + "틀렸어요");
			}
		} while(true);
	}
}
