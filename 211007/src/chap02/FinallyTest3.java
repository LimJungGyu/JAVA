package chap02;

public class FinallyTest3 {

	public static void main(String[] args) {
		FinallyTest3.method1();
		//method1�� static�޼����̹Ƿ� �ν��Ͻ� �������� ���� ȣ���� �����ϴ�
		System.out.println("method1()�� ������ ��ġ�� main1�� ���ƿԽ��ϴ�");
		}

static void method1() {
	try {
		System.out.println("method1()�� ȣ��Ǿ����ϴ�");
		return;
	}catch (Exception e) {
		e.printStackTrace();
	}finally {
		System.out.println("method1()�� finally���� ����Ǿ����ϴ�");
	}
}
}