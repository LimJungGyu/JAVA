package chap6;

public class ShowThread extends Thread {
	String threadName;
	
	ShowThread(String name){
		threadName =name;
	}

	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("�ȳ��ϼ���."+threadName+"�Դϴ�.");
			try {
			sleep(200);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}//������ �۾��������� ������ �۾��ϴ� sleep �ڵ�
		}
	}
}
