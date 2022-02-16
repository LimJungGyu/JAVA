package Test;

import java.io.Serializable;

public class Person implements Serializable{
	String name;
	String address;
	String phone;
	
	Person(){}
	
	Person(String name,String address, String phone){
		this.name=name;
		this.address=address;
		this.phone=phone;
	}
	Person(String name,String phone){
		this.name=name;
		this.phone =phone;
	}
	

	void ShowPerson() {
		System.out.println("===============");
		System.out.println("name:"+name);
		System.out.println("phone:"+phone);
		if(address != null && address.length()>0)
			System.out.println("adress:"+address);
		
		System.out.println("");
	}
	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Person tmp = (Person)obj;
		if(name.equals(tmp.name)) {
			return true;
		}else {
			return false;
		}

		}
}
