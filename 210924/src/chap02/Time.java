package chap02;

public class Time {
	//시,분,초 멤버변수  ///private: time클래스 내부에서만 쓴다(공용X)
	//캡슐레이션이라고 한다
	private int hour;
	private int minute;
	private double second;
	//멤버 메소드 시간 세팅하는거
	//마우스 우클릭 source getter/setter
	//퍼블릭이기 때문에 다른곳에서도 쓸수있다 컨트롤 마우스 대면 코드로 이동한다
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
