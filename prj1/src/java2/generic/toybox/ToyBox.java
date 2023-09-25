package java2.generic.toybox;

public class ToyBox<T> {
	private Object[] obj;
	private int index;

	ToyBox() {
		obj = new Object[10];
		index = 0;
	}

	public void add(T toy) {
		obj[index] = toy;
		index++;
	}

	public  int size() {
		return index;
	}

	public T get(int index) {
		return (T) obj[index];
	}
	
	
	public static void main(String[] args) {
		ToyBox<String> list = new ToyBox<>();
		list.add("장난감");
		list.add("인형");
		
		for( int i=0; i< list.size() ; i++){
			System.out.println( list.get(i));
		}
	}
}