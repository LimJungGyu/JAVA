package chap3;

public class Tv extends Product {
	Tv(){
		//����ũ������ ������ Product(int price)�� ȣ���Ѵ�
		super(100); //tv�� ������ 100�������� �Ѵ�.
	}
	//objectŬ������ toString()�� �������̵��Ѵ�
	public String toString() {
		return "tv"; 
	}

}
