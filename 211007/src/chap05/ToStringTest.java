package chap05;

import java.util.Date;   //����ð� �˷��ִ�~

public class ToStringTest {

	public static void main(String[] args) {
		String str = new String("KOREA");
		Date today = new Date();  //����Ʈ�� ��Ʈ�� ����Ʈ �� �ؼ� util data����
		
		//��Ʈ���� ����Ʈ Ÿ���� �̹� �������̵� �Ǿ��ֱ⶧���� �ؽ��ڵ尡 �ƴ� ���ڱ״�� ����
		System.out.println(str.toString());
		System.out.println(today.toString());
	}

}
