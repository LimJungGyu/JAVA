package chap08;

public class Tv {
	String color ;  //인스턴스변수 (전역변수:Grobal)
	boolean power;
	int channel;
	int size;   //클래스변수, 스태틱변수, 공유, 고정변수
	
	
	// 리턴타입 메소드이름(String name, int age) {처리할 코드}
	void power() {
		power = !power;  //toggle
	}
	void channelUp() {
		int cnt = 0; //지역변수
		
		channel++;
	}
	void channelDown() {
	    int cnt = 10;   //지역변수 (Local)
		channel--;
	}
}
