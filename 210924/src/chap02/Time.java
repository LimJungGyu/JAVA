package chap02;

public class Time {
	//��,��,�� �������  ///private: timeŬ���� ���ο����� ����(����X)
	//ĸ�����̼��̶�� �Ѵ�
	private int hour;
	private int minute;
	private double second;
	//��� �޼ҵ� �ð� �����ϴ°�
	//���콺 ��Ŭ�� source getter/setter
	//�ۺ��̱� ������ �ٸ��������� �����ִ� ��Ʈ�� ���콺 ��� �ڵ�� �̵��Ѵ�
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if(hour<0 || hour>23)
			return;
		this.hour = hour;
	}
	public int getMinute() {
		
		return minute;
	}
	public void setMinute(int minute) {
		if(hour<0 || hour>59)
			return;
		this.minute = minute;
	}
	public double getSecond() {
		return second;
	}
	public void setSecond(double second) {
		if(second<0 || second>=60)
			return;
		this.second = second;
	}
	public String showTime() {
		return (hour+":"+":"+minute+":"+second);
	}
	
	
	
}
