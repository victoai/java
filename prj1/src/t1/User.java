package t1;



public class User {
	
	String name;
	boolean flag;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setFlag(  boolean flag){
		this.flag=flag;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", flag=" + flag + "]";
	}
	
	public boolean getFlag(  ){
		return flag;
	}
	
	

}
