package ch15.sec02.exam01;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		// <Board> => 제네릭. 배열에 저장할 타입을 명시한다. 뒤에 오는건 생략해도 상관 없음.
		ArrayList<Board> list = new ArrayList<>();
			
		list.add(new Board("제목1", "내용1", "작성자1")); // 배열에 Board 객체를 추가
		list.add(new Board("제목2", "내용2", "작성자2")); // 배열에 Board 객체를 추가
		list.add(new Board("제목3", "내용3", "작성자3")); // 배열에 Board 객체를 추가
		list.add(new Board("제목4", "내용4", "작성자4")); // 배열에 Board 객체를 추가
		list.add(new Board("제목5", "내용5", "작성자5")); // 배열에 Board 객체를 추가
		
		// 저장된 총 객체 수 얻기
		int size = list.size();
		System.out.println("배열안 객체의 총 갯수 : "+size);
		
		System.out.println("=======================");
		
		// 특정 인덱스 번호의 객체 가져오기
		Board board1 = list.get(2); // Board 객체를 리턴해주기 때문에 Board 타입으로 받음.
		System.out.println(board1.getSubject() + "\t" + board1.getContent() + "\t" + board1.getWriter());
		
		System.out.println("=======================");
		
		// 모든 객체를 하나씩 가져오기
		for(int i=0; i<list.size(); i++) {
			Board board2 = list.get(i); 
			System.out.println(board2.getSubject() + "\t" + board2.getContent() + "\t" + board2.getWriter());
		}
		
		System.out.println("=======================");
		
		// 객체 삭제(인덱스 번호 지정)
		list.remove(1);
		
		for(Board board3 : list) {
			System.out.println(board3.getSubject() + "\t" + board3.getContent() + "\t" + board3.getWriter());			
		}
		
	}
}
