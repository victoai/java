package prj1;

import java.util.Arrays;
import java.util.Scanner;

public class 보물찾기문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int problem=-1; 
		String problem_temp;
		int i;
		int sum;
		int input;
		String[] map = new String[100]; //2차원같은 1차원 배열 맵
		int x=0; //플레이어 좌표 x
		int y=0; //플레이어 좌표 x
		System.out.println("\n[10] w,s,a,d키를 이용해서 보물을 발견하세요.");
		//배열초기화  [   ]
		/*for( i=0;i<10;i++) {    //10
			for(int j=0;j<10;j++) {   //10
				map[i*10+j]="[  ]";     
			}
		}*/

		 
		for( i=0; i< 100; i++) {
			map[i]= "[  ]";
		}
		
		
		 //Arrays.fill( map, "[ ]");
			 
		
		map[0]="[me]";
		map[77]="[보물]";
		input=0;
		String input2;
		
		loop2 :
		while(input!=5) {
			for(i=0;i<10;i++) {
				for(int j=0;j<10;j++) {
					System.out.print(map[i*10+j]);
				}
				System.out.println();
			}
			System.out.println("상하좌우는 각각 w,s,a,d / 종료는 x를 입력");
			input2=sc.next();
			switch(input2) { 
			case "w": 
				if(y>0) {
					map[y*10+x]="[  ]"; //이전의 위치를 빈공간으로 만듬
					y-=1;
					
				}else {
					System.out.println("그곳은 막혀있습니다.");
				}
				break;
			case "s":
				if(y<9) {
					map[y*10+x]="[  ]";
					y+=1;
				}else {
					System.out.println("그곳은 막혀있습니다.");
				}
				break;
			case "a":
				if(x>0) {
					map[y*10+x]="[  ]";
					x-=1;
				}else {
					System.out.println("그곳은 막혀있습니다.");
				}
				break;
			case "d":
				if(x<9) {
					map[y*10+x]="[  ]";
					x+=1;
				}else {
					System.out.println("그곳은 막혀있습니다.");
				}
				break;
			case "x":
				System.out.println("게임 종료(game over)");
				break loop2;
			default:
				System.out.println("알 수 없는 입력입니다.");
			}
			//------switch문 밖--------------------------
			if(map[y*10+x]=="[보물]") {
				System.out.println("게임 클리어!");
				break;
			}else {
				map[y*10+x]="[me]"; //현재의 위치를 [me]로 변경
			}
		}}

}
