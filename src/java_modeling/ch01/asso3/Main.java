package java_modeling.ch01.asso3;

public class Main {
	public static void main(String[] args) {
		// 학생 두명 생성
		Student s1 = new Student("111");
		Student s2 = new Student("222");
		
		// 과목 2개 생성
		Course java = new Course("java");
		Course dp = new Course("Design pattern");
		
		// 성적객체 => 수강신청도 동시에 발생
		Transcript t1 = new Transcript(s1,java); // 111은 자바 수강신청
		Transcript t2 = new Transcript(s1,dp); // 111은 dp 수강신청
		Transcript t3 = new Transcript(s2,dp); // 222은 dp 수강신청
		
		t1.setDate("2023-05-04");
		t1.setGrade("B");
		
		t2.setDate("2023-05-04");
		t2.setGrade("D+");
		
		t3.setDate("2023-05-04");
		t3.setGrade("C+");
				
	}
}
