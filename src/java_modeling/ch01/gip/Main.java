package java_modeling.ch01.gip;

public class Main {
	public static void main(String[] args) {
		// 1.합성 관계
		// 컴퓨터 객체만 생성해도 부품들이 전부 생성됨.
		Computer c = new Computer();
		// 컴퓨터 객체가 사라졌는데 부품들도 전부 사라짐.
		c = null;
		
		// 2.집약 관계
		// 	2-1 부품들 따로 생성
		MainBoard mb = new MainBoard();
		Cpu cpu = new Cpu();
		Memory m = new Memory();
		PowerSupply ps = new PowerSupply();
		// 	2-2 매개변수에 부품들 넣어서 컴퓨터 객체 생성
		Computer2 c2 = new Computer2(mb,cpu,m,ps);
		// 	2-3 컴퓨터 객체가 사라졌지만 부품들은 남아있음
		c2 = null;
	}
}
