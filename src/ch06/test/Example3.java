package ch06.test;

public class Example3 {
	// isNumber 메소드 작성
	static boolean result;
	static char check;

	static public boolean isNumber(String str) {
		
		for(int i = 0; i<str.length(); i++){
			check = str.charAt(i);
			if( check < 48 || check > 58)
			{
				//해당 char값이 숫자가 아닐 경우
				result =  false;
			} else {
				result = true;
			}
		}	
		if (str.equals("") || str.equals(null)) {
			result = false;
		} 
		return result;
	}

	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		str = "123o";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));

	}
}
