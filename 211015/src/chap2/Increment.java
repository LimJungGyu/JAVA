package chap2;

public class Increment {
		int num=0;
		public  void increment() {
			synchronized(this){  //임계영역에 락을 걸어서 동시사용x
				num++;			//하나씩 작업하기때문에 시간은 길어지지만 다른작업에 영향을 주지않게 순서대로 작업
				}
			}	
		public int getNum() {return num;}

}
