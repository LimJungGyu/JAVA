package chap02;

public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time();
		
		////TimeŬ�������� �� ������ ���⼭�� �ɸ��� private�̱⶧����
		t.setHour(11);
		t.setMinute(35);
		t.setSecond(48);
		
		System.out.println(t.getHour());
		System.out.println(t.getMinute());
		System.out.println(t.getSecond());
		
		String str = t.showTime();
		System.out.println(t.showTime());

	}

}
