package chap01;

public class TvTest2 {

	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		
		t1.color = "red";
		t2.color = "white";
		
		System.out.println(t1.color);
		System.out.println(t2.color);
		
		t1.channel = 7;
		
		System.out.println(t1.channel);
		System.out.println(t2.channel);
		
		System.out.println(t1);
		System.out.println(t2);
		
		t2 = t1;  //객체는 하나인데 참조변수는 2개인 상황이 된다
 				  //기존에 있던 객체는 가비지 상태가 됐다가 메모리에서 떠돌다 삭제
		t1.channel =100;   
		System.out.println(t1.channel);
		System.out.println(t2.channel);
	}
	

}
