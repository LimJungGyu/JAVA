package chap08;

public class TvTest {

	public static void main(String[] args) {
		short s= 10;
		long l = 100;
		int i = (int)l;
		
		Tv t= new Tv();
		CaptioTv c = new CaptioTv();
		
		//����ȯ�ϰ� ����ִ� 
		Tv t2 = new CaptioTv();
		
		c.color="red";
		t2.color="green";
		
		c.text="hellow";
		//t2.text="hellow"
		
		

	}

}
