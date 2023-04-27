package ch06.test;

public class Member {
	String name;
	String id;
	String password;
	int age;
	
	Member (String name, String id){
		this.name = name;
		this.id = id;
	}
	Member () {
		
	}
	
	public static void main(String[] args) {
		MemberService memberService = new MemberService();

		boolean result = memberService.login("hong", "12345");

		if(result) {
		     System.out.println("로그인 되었습니다.");
		     memberService.logout("hong");
		} else {
		     System.out.println("id 또는 password가 올바르지 않습니다.");
		}

	}

}
