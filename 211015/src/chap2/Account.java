package chap2;

public class Account {
	private int balance =1000;
	public int getBalance() {
		return balance;
	}
	public synchronized void withdraw(int money) {//����ȭ���������� 0�ε� ����� �Ǿ������
		if(balance>=money) {
			try {Thread.sleep(1000);
			}catch(InterruptedException e) {}
			balance-=money;
		}
	}

}
