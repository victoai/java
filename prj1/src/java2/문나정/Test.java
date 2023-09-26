package java2.문나정;

import java.util.Scanner;

class Shape{
	public Shape next;
	public Shape() {next=null;}
	
	public void draw() {
		System.out.println("SHape");
	}
	
}

class Line extends Shape{
	public void draw() {
		System.out.println("Line");
	}
}
class Rect extends Shape{
	public void draw() {
		System.out.println("Rect");
	}
}
class Circle extends Shape{
	public void draw() {
		System.out.println("circle");
	}
}


public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape start = null, last=null, obj;
		
		
		//start  = new Line();
		//last =start;
		for(int i=0; i<4; i++) {
			
			System.out.println("1. line, 2.Circle, 3.Rect");
			int index = sc.nextInt();
			
			switch(index) {
			case 1:   // Line객체생성	
				
				if( start== null) {
					start = new Line();
					last = start;
					
				}else {
					obj = new Line();
					last.next = obj;
					last = obj;
				}
				break;
				
			case 2:

				if( start== null) {
					start = new Circle();
					last = start;
					
				}else {
					obj = new Circle();
					last.next = obj;
					last = obj;
				}
				break;
			case 3:

				if( start== null) {
					start = new Rect();
					last = start;
					
				}else {
					obj = new Rect();
					last.next = obj;
					last = obj;
				}
				break;
			}
		}
		
		Shape p = start;
		while(p != null) {
			p.draw();
			p = p.next;
		}


		
	}
	
 
}
