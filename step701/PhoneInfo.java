package step701;

import java.io.Serializable;

public class PhoneInfo implements Serializable{
	//�̸�, ����, ���� :���ڿ�
	String name;
	String phoneNumber;
	String birth;
	
	//������3���� , �̸��ϰ� ����
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
	
	//�������
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
