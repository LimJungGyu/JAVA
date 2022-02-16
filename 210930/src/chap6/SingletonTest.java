package chap6;

public class SingletonTest {

	public static void main(String[] args) {
		//Singleton s = new Singleton(); private생성자는 외부에서 선언(new)을 통해서 가져올수없다
				
		Singleton s = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s);
		System.out.println(s2);
				

	}

}
