package chap03;

public class Exception13 {
	public static void main(String[] args) {//throws Exception 여기서 또 던저봐야 오류남{
	try {	
		method1();
	}catch(Exception e) {
		System.out.println("main에서 예외처리함");
		e.printStackTrace();
		}
	}
	static void method1() throws Exception {
		method2();
	}
	static void method2() throws Exception {
		throw new Exception();
	}

}
