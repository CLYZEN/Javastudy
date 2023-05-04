package java_modeling.ch01.asso3;

import java.util.ArrayList;

public class Student {
	private String name;
	private ArrayList<Transcript> transcripts;
	
	public Student(String name) {
		this.name = name;
		transcripts = new ArrayList<>();
	}

	// 수강신청 추가
	public void  addTranscript(Transcript transcript) {
		transcripts.add(transcript);
	}
}
