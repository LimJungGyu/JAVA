package chap06;

public class ParamEx02 {

	public static void main(String[] args) {
		Data d = new Data();
		d.x =10;
		System.out.println(d.x);
		
		change(d);   ////////���������̱⶧���� Ÿ�� �����ϰ��ϱ�����
		System.out.println("After change(d.x)");
		System.out.println("main() : x="+d.x);
	}
	static void change(Data a) { //////������ �Ű������� �� (���� �ƴ� �ּҰ��� ���޹ްԵ�) 
		a.x =1000;
		System.out.println("change()x="+a.x);
	}
}
