package customer.project;

// silver등급 고객에 대한 class
public class Customer {
	// 필드
	private int customorID; // 고객 ID
	private String customorName; // 고객 이름
	private String customorGrade; // 고객 등급
	int bonusPoint; // 보너스 포인트(적립포인트)
	double bonusRatio; // 보너스 적립 비율

	// 생성자
	public Customer() {
		initCustomer();
	}

	public Customer(int customorID, String customorName) {
		this.customorID = customorID;
		this.customorName = customorName;
		initCustomer();
	}

	// 메소드
	// 고객 등급 초기화
	private void initCustomer() {
		customorGrade = "SILVER";
		bonusRatio = 0.01;
	}

	// 보너스 포인트 계산, 가격 리턴
	public int  calcPrice(int price) {
		// 1. 보너스 포인트 쌓이게 만듬.
		bonusPoint += (price * bonusRatio);
		
		// 2. 사용자가 지불할 가격을 리턴.
		return price; // SILVER 고객은 할인율 0으로 물견가격 그대로 리턴
	}
	
	// 고객정보 출력
	public String showCustomerInfo() {
		return customorName + "님의 등급 : " + customorGrade + ", 보너스 포인트 :" + bonusPoint + "점"; 
	}
	
	// getter setter

	public int getCustomorID() {
		return customorID;
	}

	public void setCustomorID(int customorID) {
		this.customorID = customorID;
	}

	public String getCustomorName() {
		return customorName;
	}

	public void setCustomorName(String customorName) {
		this.customorName = customorName;
	}

	public String getCustomorGrade() {
		return customorGrade;
	}

	public void setCustomorGrade(String customorGrade) {
		this.customorGrade = customorGrade;
	}

}
