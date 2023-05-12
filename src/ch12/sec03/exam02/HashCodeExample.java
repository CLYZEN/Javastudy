package ch12.sec03.exam02;

public class HashCodeExample {

	public static void main(String[] args) {
		// 동등객체 = 객체도 같아야하고(객체의 주소로 확인) 값도 같아야함.
		
		Student student1 = new Student(1, "홍길동");
		Student student2 = new Student(1, "홍길동");
		
		if(student1.hashCode() == student2.hashCode()) {
			System.out.println("student1 과 student2의 해시코드는 동일함.");
		} else {			
			System.out.println("student1 과 student2의 해시코드는 동일하지 않음.");
		}
		
	}

}
