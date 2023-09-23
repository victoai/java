package java2.generic;

public class TreeDPrinterPowder {
	private Powder  material;
	
	public void setMaterial( Powder  material) {
		this.material =  material;
	}
	
	public Powder getMaterial() {
		return material;
	}
	
	
	public void pirnt() {
		     System.out.println( "3D print use :" + material);
	}
	
	
	public static void main(String[] args) {
		TreeDPrinterPowder printer = new TreeDPrinterPowder();
		printer.setMaterial(new Powder());
		printer.pirnt();
	}

}
