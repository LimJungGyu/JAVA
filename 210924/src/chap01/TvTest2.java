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
		
		t2 = t1;  //��ü�� �ϳ��ε� ���������� 2���� ��Ȳ�� �ȴ�
 				  //������ �ִ� ��ü�� ������ ���°� �ƴٰ� �޸𸮿��� ������ ����
		t1.channel =100;   
		System.out.println(t1.channel);
		System.out.println(t2.channel);
	}
	

}
