package HW;

public class phoneCompInfo extends PhoneInfo{
	String company="";
	
	public void PhoneCompInfo(String name, String phoneNumber, String birth, String company){
		this.name = name;
		this.phoneNumber = phoneNumber;		
		this.birth = birth;
		this.company =company;}
	void showPhoneUnivInfo() {showPhoneInfo();	
	System.out.println("company:"+company);
	System.out.println("==================");	
}
		

}
