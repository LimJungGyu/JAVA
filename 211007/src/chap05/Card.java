package chap05;

public class Card implements Cloneable{
	String kind;
	int number;
	Card(){
	this("SPADE",1);
	}
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	@Override
	public String toString() {
		return "Kind: " + kind +", Number: " + number;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//클론은 원래 오버라이드하면 에러 던저진다 그래서 사용할때 예외처리시켜줘야함 
		//클론처럼 예외 throw 되는것들이 몇개있음
		Object obj = null;
		obj = super.clone();
			return obj;
			
		
	}

}
