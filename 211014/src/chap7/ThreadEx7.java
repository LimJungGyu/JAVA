package chap7;

import javax.swing.JOptionPane;

public class ThreadEx7 {

	public static void main(String[] args)throws Exception {
		ThreadEx7_1 th1 = new ThreadEx7_1();
		
		System.out.println("Demon?: "+th1.isDaemon());
		if(!th1.isDaemon()) th1.setDaemon(true);//데몬쓰레드 추가 
		th1.start();
		
		String input = JOptionPane.showInputDialog("아무값이나 입력하세요");
		System.out.println("입력하신값은"+input+"입니다.");
	}

}
