package chap06;

public class ParamEx01 {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		
		System.out.println(d.x);
		change(d.x);
		System.out.println("after change(d.x)");
		System.out.println("main()�� x="+d.x);
	
	}
	static void change(int x) { //////�⺻�ڷ����� �Ű�������(���� ���޹ްԵ�)
		x=1000;
		System.out.println("change()�� x="+x);
	}

}
