package chap01;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex01 {

	public static void main(String[] args) {
		Date today = new Date();  //date�� ��Ʈ�� ����Ʈ�� utildate ����
		Calendar cal = Calendar.getInstance();  
		
		System.out.println(today);
		
		System.out.println(cal);  //�迭�ȿ� ������ ����ִ� ������¥�ð��� �޼ҵ带 ���� ���� �̾Ƴ�
	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");//mm�빮�ڷν�ߵ�
		String d1 = sdf.format(today);//ȭ�鿡 �Ѹ����� ��Ʈ������ �ѷ��ߵ�
		System.out.println(d1);


	}
}
