package step701;

import java.io.Serializable;

public class PhoneInfo implements Serializable{
	//이름, 전번, 생일 :문자열
	String name;
	String phoneNumber;
	String birth;
	
	//생성자3가지 , 이름하고 전번
	PhoneInfo(){}

	PhoneInfo(String name, String phoneNumber, String birth) {
		//this.name = name;
		//this.phoneNumber = phoneNumber;
		this(name,phoneNumber);
		this.birth = birth;
	}

	PhoneInfo(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	//정보출력
	void showPhoneInfo() {
		System.out.println("name:"+name);
		System.out.println("phone:"+phoneNumber);
		if(birth != null && birth.length()>0)
			System.out.println("birth:"+birth);
		
		System.out.println("==============");
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		PhoneInfo tmp = (PhoneInfo)obj;
		if(name.equals(tmp.name)) {
			return true;
		}else {
			return false;
		}
	}
	
}
