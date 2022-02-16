package chap6;

public class ShowThread extends Thread {
	String threadName;
	
	ShowThread(String name){
		threadName =name;
	}

	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("안녕하세요."+threadName+"입니다.");
			try {
			sleep(200);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}//쓰레드 작업보기위해 느리게 작업하는 sleep 코드
		}
	}
}
