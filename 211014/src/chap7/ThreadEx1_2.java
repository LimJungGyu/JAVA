package chap7;

public class ThreadEx1_2 implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<1000; i++) {
			//Thread.currentThread()���� �������� thread�� ��ȯ�Ѵ�
			
			System.out.println(Thread.currentThread().getName());
		}
		
	}

}
