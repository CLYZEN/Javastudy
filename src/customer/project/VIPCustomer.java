package customer.project;

public class VIPCustomer extends Customer {
	private double saleRatio; // 할인율
	private int agentID; // 상담원 ID
	
	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		return super.calcPrice(price);
	}
	@Override
	public String showCustomerInfo() {
		// TODO Auto-generated method stub
		return super.showCustomerInfo();
	}
	
}
