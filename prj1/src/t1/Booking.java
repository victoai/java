package t1;



public class Booking {
	
	String name;
	String area;
	String hotel;
	String date;
	public Booking(String name, String area, String hotel, String date) {
		super();
		this.name = name;
		this.area = area;
		this.hotel = hotel;
		this.date = date;
	}
	
	
	public Booking() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Booking [name=" + name + ", area=" + area + ", hote=" + hotel + ", date=" + date + "]";
	}
	

}
