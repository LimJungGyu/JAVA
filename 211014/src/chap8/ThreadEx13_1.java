package chap8;

public class ThreadEx13_1 extends Thread {
	@Override
	public void run() {
		int i= 10;
		while(i!=0&&!isInterrupted()) {
			System.out.println(i--);
			for(long x=0; x<250000000000000000L;x++);//�ð�����
			
		}
		System.out.println("ī��Ʈ�� ����Ǿ����ϴ�");
		//�̰� ������ �ƴϱ⶧���� �������� ����޼��� ��°����Ѱ�
	}

}
