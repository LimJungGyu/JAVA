package chap6;

public class Singleton {
	private static Singleton s;
	
	int a;
	
	private Singleton(){ ////private�� �ٿ��� �� Ŭ���������� ����
		a = 100;
	}
	public static Singleton getInstance() {
		if(s==null)
			s= new Singleton();
		return s;
	}

}
