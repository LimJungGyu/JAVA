package chap08;

public class CastingTest1 {

	public static void main(String[] args) {
		Car car =null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;   //car = (Car)fe;���� ����ȯ�� ������ ���´�
		//car.water(); ---------------������ ���� car(�θ�)Ÿ���� ���������δ� 
									               //water()(�ڽİ������)�� ���� ȣ���Ҽ�����
		
		fe2 = (FireEngine)car;//�ٿ�ĳ���� fe2�ڼ�Ÿ��() <--car����Ÿ��() ���о�ֱ⶧���� ����ȯ �ʿ�
		fe2.water();
	}

}
