package chap7;

import javax.swing.JOptionPane;

public class ThreadEx7 {

	public static void main(String[] args)throws Exception {
		ThreadEx7_1 th1 = new ThreadEx7_1();
		
		System.out.println("Demon?: "+th1.isDaemon());
		if(!th1.isDaemon()) th1.setDaemon(true);//���󾲷��� �߰� 
		th1.start();
		
		String input = JOptionPane.showInputDialog("�ƹ����̳� �Է��ϼ���");
		System.out.println("�Է��ϽŰ���"+input+"�Դϴ�.");
	}

}
