package ch04.sec02;

public class IfExample {
	public static void main(String[] args) {
		
		int score = 93;
		
		if(score >= 90) 		
			System.out.println("학점 A");
		 else if  (score >= 80) 
			 System.out.println("학점 B");
		 else if  (score >= 70) 
			 System.out.println("학점 C");
		 else
			 System.out.println("학점 D");
		
	}
}
