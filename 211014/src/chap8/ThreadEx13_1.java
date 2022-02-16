package chap8;

public class ThreadEx13_1 extends Thread {
	@Override
	public void run() {
		int i= 10;
		while(i!=0&&!isInterrupted()) {
			System.out.println(i--);
			for(long x=0; x<250000000000000000L;x++);//시간지연
			
		}
		System.out.println("카운트가 종료되었습니다");
		//이건 메인이 아니기때문에 마지막에 종료메세지 출력가능한것
	}

}
