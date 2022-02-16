package chap6;

public class Singleton {
	private static Singleton s;
	
	int a;
	
	private Singleton(){ ////private를 붙여서 이 클래스에서만 쓰기
		a = 100;
	}
	public static Singleton getInstance() {
		if(s==null)
			s= new Singleton();
		return s;
	}

}
