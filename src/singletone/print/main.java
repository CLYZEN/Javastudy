package singletone.print;

public class main {
	private static final int USER_NUM = 10; // 사람수
	
	public static void main(String[] args) {
		//user 객체를 가지는 배열
		User[] user = new User[USER_NUM];
		
		for (int i=0; i<USER_NUM; i++) {
			// 배열에 user객체를 생성해서 저장
			user[i] = new User(i+1 + "번째");
			user[i].print();
		}

	}

}
