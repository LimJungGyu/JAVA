package chap6;

public class ThreadTest {

	public static void main(String[] args) {
		ShowThread st1 = new ShowThread("멋진쓰레드");
		ShowThread st2 = new ShowThread("예쁜쓰레드");
		
		st1.start();//원래 st1다하고
		st2.start(); //st2를 시작해야하지만 걍 동시에 시작한다
		
		//st1.run();  //
		//st2.run();	
	}

}
