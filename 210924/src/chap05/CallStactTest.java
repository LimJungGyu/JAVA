package chap05;

public class CallStactTest {

	public static void main(String[] args) {
		/////////메소드의 호출순서
		
		System.out.println("start");
		firstMethod();
		System.out.println("main()");
	}
	static void firstMethod() {
		secondMethod();
		System.out.println("firstMethod()");
	}
	static void secondMethod() {
		System.out.println("socondMethod()");
	}

}
