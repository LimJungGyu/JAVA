package chap03;

public class Exception13 {
	public static void main(String[] args) {//throws Exception ���⼭ �� �������� ������{
	try {	
		method1();
	}catch(Exception e) {
		System.out.println("main���� ����ó����");
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
