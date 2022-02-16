package chap02;

public class ExceptionEx2 {

	public static void main(String[] args) {
		int number=100;
		int result = 0;
		
		for(int i=0; i<10;i++) {
			try {
				result = number/(int)(Math.random()*10);
				System.out.println(result);  //���� �����ڵ�� ���ڵ�� �����Ǿ��ִ� �ڵ���� ���� try���� �ִ´�
			}catch(ArithmeticException e) {
				//e.printStackTrace(); �������� ���� Ȯ�ο�
				System.out.println("���ܸ޼��� : "+e.getMessage());
			}catch(Exception e) {
				System.out.println("Exception");
			}finally {
				System.out.println("----"); ///������ �����ϴ°� ���� return�� �ִ��� ���̳θ��� ����
			}
		}
		
	}

}
