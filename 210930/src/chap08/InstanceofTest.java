package chap08;

public class InstanceofTest {

	public static void main(String[] args) {
		FireEngine fe= new FireEngine();
		 if (fe instanceof FireEngine) {
			 System.out.println("this is a FireEngine instance.");
		 }
		 if(fe instanceof Car) {
			 System.out.println("this is a Car instance");
		 }
		 if(fe instanceof Object) {
			 System.out.println("this is a object instance");
			 System.out.println(fe.getClass().getName());//Ŭ������ �̸��� ���
		 }
		 //////////instanceof true�� ������ �˻��� Ÿ������ ����ȯ �����ϴٴ°�
	}

}
