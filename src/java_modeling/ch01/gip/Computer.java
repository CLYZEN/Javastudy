package java_modeling.ch01.gip;

// 합성 관계 : 전체가 사라지면 부분도 사라진다.
public class Computer {
	private MainBoard mb;
	private Cpu c;
	private Memory m;
	private PowerSupply ps;
	
	public Computer() {
		// 생성자에서 필드로 객체를 생성한다.
		this.mb = new MainBoard();
		this.c = new Cpu();
		this.m = new Memory();
		this.ps = new PowerSupply();
	}
}
