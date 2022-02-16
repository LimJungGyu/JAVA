package HW;

public class PhoneInfo {
	//이름, 전번, 생일 :문자열로
	String name;
	String phoneNumber;
	String birth;
	
	//생성자3 , 이름하고 전번 
	PhoneInfo(){}
	public PhoneInfo(String name,String phoneNumber,String birth){
		//this.name = name;
		//this.phoneNumber = phoneNumber;
		this(name,phoneNumber);  //이렇게 줄일수 있따
		this.birth = birth;
	}
	public PhoneInfo(String name,String phoneNumber){
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	//정보출력
	void showPhoneInfo() {
		System.out.println("name:"+name);
		System.out.println("phonenumber:"+phoneNumber);
		if(birth!=null && birth.isEmpty()!=true)
			System.out.println("birth:"+birth);		
		System.out.println("==================");		
	}
	
	
	
}
