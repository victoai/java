package t2;



public class User {
	
	String name;
	int totalPrice  ;

	public String getName() {
		return name;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void updateTotalPrice(int totalPrice) {
		this.totalPrice += totalPrice;
	}
	
	// 매출금액이 증가 될 수 있도록
	public void setName(String name) {
		this.name +=name;
	}
	
	 

	@Override
	public String toString() {
		return "User [name=" + name + ", totalPrice=" + totalPrice + "]";
	}
	
	 
	

}
