package chap3;

public class Product {
	int price;         //��ǰ�� �� ��
	int bonusPoint;    //��ǰ���Ž� �����ϴ� ���ʽ�����
	
	Product(int price){
		this.price = price;
		bonusPoint =(int)(price/10.0);//���ʽ� ������ ��ǰ������ 10%
				
		
	}
	Product(){}
	
}
