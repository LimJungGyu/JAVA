package chap04;

public class CaptionTvA extends Tv {//���� ���鶧 super~�� browser������ tvġ�� ���� ġ�� �ʾƵ� ��
	boolean caption;
	
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}

}
