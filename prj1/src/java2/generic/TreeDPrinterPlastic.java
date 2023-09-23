package java2.generic;

public class TreeDPrinterPlastic {
	private Plastic  material;
	
	public void setMaterial( Plastic  material) {
		this.material =  material;
	}
	
	public Plastic getMaterial() {
		return material;
	}
	
	public void pirnt() {
	     System.out.println( "3D print use :" + material);
}


public static void main(String[] args) {
	TreeDPrinterPlastic printer = new TreeDPrinterPlastic();
	printer.setMaterial(new Plastic());
	printer.pirnt();
}

}
