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
		//Ŭ���� ���� �������̵��ϸ� ���� �������� �׷��� ����Ҷ� ����ó����������� 
		//Ŭ��ó�� ���� throw �Ǵ°͵��� �����
		Object obj = null;
		obj = super.clone();
			return obj;
			
		
	}

}
