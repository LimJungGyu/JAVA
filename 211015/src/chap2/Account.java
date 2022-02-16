package chap2;

public class Account {
	private int balance =1000;
	public int getBalance() {
		return balance;
	}
	public synchronized void withdraw(int money) {//동기화하지않으면 0인데 출금이 되어버린다
		if(balance>=money) {
			try {Thread.sleep(1000);
			}catch(InterruptedException e) {}
			balance-=money;
		}
	}

}
