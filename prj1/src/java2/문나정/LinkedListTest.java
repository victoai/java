package java2.문나정;

import java.util.Scanner;

 

public class LinkedListTest {
	Shape start = null, last=null, obj;	

	public  void run( ) {
		Scanner sc = new Scanner(System.in); 
		 
		for(int i=0; i<4; i++) {
			
			System.out.println("1. line, 2.Circle, 3.Rect");
			int index = sc.nextInt();
			
			switch(index) {
			case 1:   // Line객체생성	
				
			     Line line = new Line();
			     addNode(  line);
				break;
				
			case 2:
			     Circle circle = new Circle();
			     addNode(   circle);
				break;
			case 3:

			     Rect rect = new Rect();
				 addNode(   rect);
				break;
			}
		}
		
		Shape p = start;
		while(p != null) {
			p.draw();
			p = p.next;
		}


		
	}
	
	private   void addNode( Shape obj) {
		 

		if( start== null) {		 
			start =obj;
			last = start;
			
		}else {			 
			last.next = obj;
			last = obj;
		}
	}
	
	
	public static void main(String[] args) {
		
		   new Test2().run();
		
	}
	
 
}
