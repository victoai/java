package java2.generic.toy;

import java.util.ArrayList;

public class AnimalBox< T extends Animal> {
	
	  ArrayList<T> list = new ArrayList<>();
	  
	  
	  
	  public static void main(String[] args) {	  
		  
		  AnimalBox<Animal>  box  = new AnimalBox<>();
		  box.list.add(new Cat());	
		  box.list.add( new Dog());
		  
		  
	  }

}
