package student.project;

import java.util.ArrayList;

public class Main {
	private static ArrayList <Subject> subjectList = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 과목 등록
		addSubject("국어",1);
		addSubject("수학",2);
		
		for(Subject subject : subjectList) {
			System.out.println(subject.subjectName + subject.subjectid);
		}
		
//		// 학생 등록 (학번,이름,필수과목)
//		Student studnet1 = new Student(181213, "박지은", subject1);
//		Student studnet2 = new Student(181518, "차슬기", subject2);
//		Student studnet3 = new Student(171230, "이현욱", subject1);
//
//		
//		// 수강 신청 subject1 = 국어 / subject2 = 수학
//		subject1.register(studnet1);
//		subject1.register(studnet2);
//		subject2.register(studnet1);
//		
//		// 점수 등록 / 20170628학번의 국어 점수는 50점
//		// 점수 등록 / 20170629학번의 수학 점수는 70점
//		Score socre1 = new Score(20170628, subject1, 50);
//		Score socre2 = new Score(20170629, subject2, 70);
//		
//		studnet1.addSubjectScore(socre1);
//		studnet1.addSubjectScore(socre2);
//		
		//printScore();
	} // main
	
	static void addSubject(String subjectName, int subjectid) {
		Subject subject = new Subject(subjectName,subjectid);
		subjectList.add(subject);
	}
	
	static void mustSubject() {
		for(Student student : Subject.studentList) {
			
		}
		
	}
	
	static void printScore() {
		for(Score score : Student.scoreList ) {
			System.out.println(score.point);
			System.out.println(score.studentid);
		}
	}

}
