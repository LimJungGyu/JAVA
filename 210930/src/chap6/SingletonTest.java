package chap6;

public class SingletonTest {

	public static void main(String[] args) {
		//Singleton s = new Singleton(); private�����ڴ� �ܺο��� ����(new)�� ���ؼ� �����ü�����
				
		Singleton s = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s);
		System.out.println(s2);
				

	}

}
