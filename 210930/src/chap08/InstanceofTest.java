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
			 System.out.println(fe.getClass().getName());//클래스의 이름을 출력
		 }
		 //////////instanceof true가 나오면 검사한 타입으로 형변환 가능하다는것
	}

}
