package chap01;

public class TvTest {

	public static void main(String[] args) {
		Tv.size=19;//����ƽ ������ ���������ʾƵ� ���ð����ϴ�
		
		Tv t = new Tv(); //�ν��Ͻ�ȭ-���� ������ �����ϰ� ��üȭ(new�����ؼ�)
							//���� tvŬ������ t��
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
		
		t.power(); ///�޼ҵ��� ȣ��
		System.out.println(t.power);
		t.channelUp();
		System.out.println(t.channel);
		
		
	
	
	}						 
	

}
