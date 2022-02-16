package chap01;

public class TvTest {

	public static void main(String[] args) {
		Tv.size=19;//스태틱 변수라서 선언하지않아도 세팅가능하다
		
		Tv t = new Tv(); //인스턴스화-참조 변수로 선언하고 객체화(new를통해서)
							//위의 tv클래스를 t에
		System.out.println(t.color);
		System.out.println(t.power);
		System.out.println(t.channel);
		System.out.println();
		
		t.color ="red";
		t.power= true;
		t.channel=10;
		
	
		System.out.println(t.color);
		System.out.println(t.power);
		System.out.println(t.channel);
		System.out.println();
		
		t.power(); ///메소드의 호출
		System.out.println(t.power);
		t.channelUp();
		System.out.println(t.channel);
		
		
	
	
	}						 
	

}
