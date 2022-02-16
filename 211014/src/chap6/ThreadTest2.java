package chap6;

public class ThreadTest2 {

	public static void main(String[] args) {
		AdderThread a1 = new AdderThread(1,50);
		AdderThread a2 = new AdderThread(51,100);
		
		
		
		Thread t1 = new Thread(a1);
		Thread t2 = new Thread(a2);
		
		t1.start();
		t2.start();
		
		try {
			//Thread.sleep(200); �����縻�� 0.2�� ��ٸ��°�
			t1.join();//t1
			t2.join();//t2 �� �ϳ����� ���� ��ٸ��°�
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println(a1.getNum());
		System.out.println(a2.getNum());
		

	}

}
