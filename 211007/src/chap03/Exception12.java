package chap03;

public class Exception12 {
	public static void main(String[] args) {//throws Exception 여기서 또 던저봐야 오류남{
		method1();
	}
	static void method1() {
		try {
		method2();
		}catch (Exception e) {
			System.out.println("method1에서 예외처리함");
			e.printStackTrace();
		}
	}
	static void method2() throws Exception {
		throw new Exception();
	}

}
