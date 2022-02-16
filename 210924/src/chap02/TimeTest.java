package chap02;

public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time();
		
		////Time클래스에서 건 조건이 여기서도 걸린다 private이기때문에
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
