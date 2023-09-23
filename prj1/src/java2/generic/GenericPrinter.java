package java2.generic;

public class GenericPrinter<T> {
	private T  material;
	
	public void setMaterial( T  material) {
		this.material =  material;
	}
	
	public T getMaterial() {
		return material;
	}
	
	public void print() {
		System.out.println (  "3D print:" + material);
	}
	
	public static void main(String[] args) {
		/*GenericPrinter<Powder> printer = new GenericPrinter<>();
		printer.setMaterial(new Powder());
		printer.print();
		 */
		
		GenericPrinter<Plastic> printer = new GenericPrinter<>();
		printer.setMaterial(new Plastic());
		printer.print();
		
		
	}
	
	
}
