package chap8;

import javax.swing.JOptionPane;

public class ThreadEx13 {

	public static void main(String[] args)throws Exception {
		ThreadEx13_1 th1 = new ThreadEx13_1();
		th1.start();
		String input = JOptionPane.showInputDialog("�ƹ����̳� �Է��ϼ���");
		System.out.println("�Է��ϽŰ��� "+input+"�Դϴ�. ");
		th1.interrupt();   //���ͷ�Ƽ�带 ȣ���ϸ� ���ͷ�Ƽ�� ���°� Ʈ�簡�ȴ�
		System.out.println("isInterrupted(): "+th1.isInterrupted());
		
	}//���� �Է��ϸ� ���ͷ�Ʈ ȣ���ؼ� ī��Ʈ�ٿ� ��ҽ�Ŵ

}
