package chap3;

public class Buyer {   //��,������ ��»��
	int money = 1000; //�����ݾ�
	int bonusPoint = 0; //���ʽ�����
	Product[] item = new Product[10];
	int i=0;
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ ��� �����ϴ�");
			return;
		}
		
		money -=p.price; //���� ������ ������ ��ǰ�� ������ ����.
		bonusPoint += p.bonusPoint;  //��ǰ�� ���ʽ� ������ �߰��Ѵ�
		item[i++]=p;    //i++�̶� i�����ϰ� ++�ϴ�
		System.out.println(p+"��/�� �����ϼ˽��ϴ�");
	}
	void summary() {
		int sum = 0 ;
		String itemList="";
		for(int i = 0; i<item. length; i++) {
			if(item[i]==null) break;
			sum+=item[i].price;
			itemList +=item[i]+",";
		}
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ���"+sum+"�����Դϴ�");
		System.out.println("���� ���ʽ�������"+"�Դϴ�");
		System.out.println("�����Ͻ� ��ǰ��"+itemList+"�Դϴ�");
	}

}
