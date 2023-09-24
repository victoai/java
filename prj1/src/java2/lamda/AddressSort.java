package java2.lamda;

import java.util.Comparator;

public class AddressSort  implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return   o1.address.compareTo(o2.address) ; 
	}

}
