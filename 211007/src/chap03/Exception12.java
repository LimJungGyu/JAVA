package chap03;

public class Exception12 {
	public static void main(String[] args) {//throws Exception ���⼭ �� �������� ������{
		method1();
	}
	static void method1() {
		try {
		method2();
		}catch (Exception e) {
			System.out.println("method1���� ����ó����");
			e.printStackTrace();
		}
	}
	static void method2() throws Exception {
		throw new Exception();
	}

}
