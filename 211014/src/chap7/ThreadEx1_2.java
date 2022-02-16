package chap7;

public class ThreadEx1_2 implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<1000; i++) {
			//Thread.currentThread()현재 실행중인 thread를 반환한다
			
			System.out.println(Thread.currentThread().getName());
		}
		
	}

}
