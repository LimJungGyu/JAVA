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
			//Thread.sleep(200); 끝나든말든 0.2초 기다리는것
			t1.join();//t1
			t2.join();//t2 가 일끝날때 까지 기다리는거
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println(a1.getNum());
		System.out.println(a2.getNum());
		

	}

}
