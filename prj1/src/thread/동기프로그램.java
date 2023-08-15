package thread;

import javax.swing.JOptionPane;

public class 동기프로그램 {
	public static void main(String[] args) throws Exception {
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은 " + input + "입니다.");
		run();

	}

	public static void run() {
		for (int i = 10; i < 20; i++) {
			System.out.println(i);
		}

		System.out.println("카운트가 종료되었습니다.");
		// main
	}

}