package chap01;

public class Tv {
	String color; //=null      //////////인스턴스변수 (전역변수:Grobal)
	boolean power; //=false
	int channel; //=0
	static int size;       ////////클래스변수,스태틱변수,고정변수,공유변수 (전역이기도함)
	
	//리턴타입 메소드이름(String name, int age)(매개변수) {처리할 코드}
	void power() {
		power=!power; //toggle 상태(반대상태)
	}
	void channelUp() {
		int cnt = 0; /////////지역변수 (Local)
		channel++;
	}
	void channelDown() {
		int cnt = 0; ///////////위의 지역변수와 중복아니다
		channel--;
	}
	
}
