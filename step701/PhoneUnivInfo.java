package step701;

public class PhoneUnivInfo extends PhoneInfo {
	//���� �г�
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
	
	@Override   //�����Ϸ��� �ʿ��� ��������
	void showPhoneInfo() {
		super.showPhoneInfo();
		System.out.println("���� : " + major);
		System.out.println("�г� : " + grade);
	}
	
	
	
}
