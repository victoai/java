package java2.generic.병진님;

public class Good {
	String  name;
	int price;
	int count;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "Good [name=" + name + ", price=" + price + ", count=" + count + "]";
	}
	public Good(String name, int price, int count) {
		super();
		this.name = name;
		this.price = price;
		this.count = count;
	} 
		
	public Good() {
		// TODO Auto-generated constructor stub
	}
}
