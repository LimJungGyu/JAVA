package HW;

public class PhoneUnivInfo extends PhoneInfo{
	
	String major,grade="";
	
	PhoneUnivInfo(){}
	
	public PhoneUnivInfo(String name,String phoneNumber,String birth,String major, String grade){
		this.name = name;
		this.phoneNumber = phoneNumber;		
		this.birth = birth;
		this.major =major;
		this.grade =grade;
		}
	void showPhoneUnivInfo() {showPhoneInfo();	
		System.out.println("major:"+major);
		System.out.println("grade:"+grade);
		System.out.println("==================");	
	}

	
	}
