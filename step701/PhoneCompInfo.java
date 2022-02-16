package step701;

public class PhoneCompInfo extends PhoneInfo{
	String company;
	
	PhoneCompInfo(){}
	
	PhoneCompInfo(String name, String phone, String birth, String company){
		super(name, phone, birth);
		this.company = company;
	}
	
	PhoneCompInfo(String name, String phone, String company){
		super(name, phone);
		this.company = company;
	}
	
	@Override
	void showPhoneInfo() {
		super.showPhoneInfo();
		System.out.println("È¸»ç : "+company);
	}
}
