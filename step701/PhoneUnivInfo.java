package step701;

public class PhoneUnivInfo extends PhoneInfo {
	//전공 학년
	String major;
	int grade;
	
	PhoneUnivInfo(){}
	
	PhoneUnivInfo(String name, String phone, String birth, String major, int grade){
		super(name, phone, birth);
		this.major = major;
		this.grade = grade;
	}
	
	PhoneUnivInfo(String name, String phone, String major, int grade){
		super(name, phone);
		this.major = major;
		this.grade = grade;
	}
	
	@Override   //컴파일러가 필요한 정보제공
	void showPhoneInfo() {
		super.showPhoneInfo();
		System.out.println("전공 : " + major);
		System.out.println("학년 : " + grade);
	}
	
	
	
}
