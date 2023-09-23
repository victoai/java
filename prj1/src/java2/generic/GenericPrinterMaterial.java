package java2.generic;

public class GenericPrinterMaterial<T extends Material> {
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
		 GenericPrinterMaterial<Powder> printer = new GenericPrinterMaterial<>();
		printer.setMaterial(new Powder());
		printer.print();
		  
		
		 GenericPrinterMaterial<Plastic> printer2 = new GenericPrinterMaterial<>();
		printer2.setMaterial(new Plastic());
		printer2.print();
		 
		//error 발생
	 	// GenericPrinter2<Water> printer3 = new GenericPrinter2<>();
    	//printer3.setMaterial(new Water());
	   //	printer3.print();
		
		
		// Bound mismatch: The type Water is not a valid substitute for the bounded parameter <T extends Material> of the type GenericPrinter2<T>
		 
		
	}
	
	
}
