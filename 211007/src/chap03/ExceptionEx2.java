package chap03;

public class ExceptionEx2 {

	public static void main(String[] args) {
		
		Object o = new Object();  //java.lang��Ű��0(�⺻��Ű��)�� ������ƮŬ����������
									//�ñ��ϸ� ��Ʈ��Ű Ŭ������ Ȯ��
		try {        
		method(); //����ó�� �ʿ�
	}catch(ArithmeticException e) {
		System.out.println("���ܸ޼��� : "+e.getMessage());
	}catch(Exception e) {
		System.out.println("Exception");
	}
	}
	static void method() throws ArithmeticException,Exception{
		int number=100;  ///throws�� ���ؼ� ����ó���� �ٸ���(method())�� ����ϴ°����� ����
		int result = 0;
		
		for(int i=0; i<10;i++) {
			result = number/(int)(Math.random()*10);
			System.out.println(result); 
			
		}
		
	
	
	}
}
