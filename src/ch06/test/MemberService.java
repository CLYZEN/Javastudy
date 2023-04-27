package ch06.test;

public class MemberService {
	
	boolean result;
	
	public boolean login(String id, String password) {
		if (id == "hong" && password =="12345") {
			result = true;
		} else {
			result = false;
		}
		return result;
	}
	
	public void logout(String id) {
		System.out.println(id + "님이 로그아웃 되었습니다.");
	}
}
