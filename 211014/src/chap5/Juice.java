package chap5;

public class Juice {
	String name;
	Juice(String name){
		this.name = name+"juice";
	}
	@Override
	public String toString() {
		return name;
	}
	
}
