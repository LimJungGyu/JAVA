package chap7;

public class ThreadEx1_1 extends Thread {
	
	@Override
	public void run() {
		for(int i=0; i<1000;i++) {
			System.out.println(getName());//조상인 thread의 getName()을 호출
		}
	}

}
