package HW;

public class PhoneInfo {
	//�̸�, ����, ���� :���ڿ���
	String name;
	String phoneNumber;
	String birth;
	
	//������3 , �̸��ϰ� ���� 
	PhoneInfo(){}
	public PhoneInfo(String name,String phoneNumber,String birth){
		//this.name = name;
		//this.phoneNumber = phoneNumber;
		this(name,phoneNumber);  //�̷��� ���ϼ� �ֵ�
		this.birth = birth;
	}
	public PhoneInfo(String name,String phoneNumber){
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	//�������
	void showPhoneInfo() {
		System.out.println("name:"+name);
		System.out.println("phonenumber:"+phoneNumber);
		if(birth!=null && birth.isEmpty()!=true)
			System.out.println("birth:"+birth);		
		System.out.println("==================");		
	}
	
	
	
}
