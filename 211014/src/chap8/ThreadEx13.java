package chap8;

import javax.swing.JOptionPane;

public class ThreadEx13 {

	public static void main(String[] args)throws Exception {
		ThreadEx13_1 th1 = new ThreadEx13_1();
		th1.start();
		String input = JOptionPane.showInputDialog("아무값이나 입력하세요");
		System.out.println("입력하신값은 "+input+"입니다. ");
		th1.interrupt();   //인터럽티드를 호출하면 입터럽티드 상태가 트루가된다
		System.out.println("isInterrupted(): "+th1.isInterrupted());
		
	}//값을 입력하면 인터럽트 호출해서 카운트다운 취소시킴

}
