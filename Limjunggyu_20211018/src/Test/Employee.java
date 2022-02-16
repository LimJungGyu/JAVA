package Test;

public class Employee extends Person {
	String department;
	String entryDate;
	
	Employee(){}
	Employee(String name,String address, String phone,String department,String entryDate){
		super(name, address, phone);
		this.department = department;
		this.entryDate = entryDate;
	}
	Employee(String name, String phone,String department,String entryDate){
		super(name,phone);
		this.department= department;
		this.entryDate=entryDate;
	}
	
	@Override  
	void ShowPerson() {
	super.ShowPerson();
	System.out.println("department: " + department);
	System.out.println("entryDate : "+ entryDate );
	}
}
