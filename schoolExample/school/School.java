package school;

import java.util.ArrayList;

public class School {
	// 내부에서 school 객체 하나를 생성
	private static School instance = null;
	private static String SCHOOL_NAME = "Good School"; // 학교 이름
	private ArrayList<Student> studentList = new ArrayList<>(); // 학교에 등록한 학생
	private ArrayList<Subject> subjectList = new ArrayList<>(); // 학교에서 개설한 과목

	// 싱글톤은 생성자 private
	// 외부에서 객체 여러개 생성 방지
	private School() {

	}

	// 싱글톤 메소드 구현
	public static School getInstance() {
		if (instance == null) { // school 객체를 맨처음 생성할 때
			instance = new School();
		}

		return instance; // school 객체를 두번째 이후로 생성할 때
	}
	
	// 학생 입학
	public void addStudent(Student student) {
		studentList.add(student);
	}
	
	// 과목 개설
	public void addSubject(Subject subject) {
		subjectList.add(subject);
	}

	// 학교에 등록한 학생 List
	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	// 학교에 개설된 과목 List
	public ArrayList<Subject> getSubjectList() {
		return subjectList;
	}

	public static String getSCHOOL_NAME() {
		return SCHOOL_NAME;
	}
	
	
	
}
