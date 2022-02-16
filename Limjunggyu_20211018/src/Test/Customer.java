package Test;

public class Customer extends Person {
	String customerID;
	int point;
	
	Customer(){}
	Customer(String name,String address, String phone,String customerID,int point ){
		super(name, address, phone);
		this.customerID =customerID;
		this.point = point;
	}
	Customer(String name, String phone,String customerID,int point){
		super(name, phone);
		this.customerID =customerID;
		this.point = point;
	}
	

	@Override  
	void ShowPerson() {
	super.ShowPerson();
	System.out.println("ID: " + customerID);
	System.out.println("POINT : "+point);
}



}