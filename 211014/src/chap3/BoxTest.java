package chap3;

public class BoxTest {
	
	public static void main(String[] args) {
	Box b1 = new Box();
	Box2<String> b2 = new Box2<String>();  //�����Ҷ� Ÿ���������
	
	b1.setItem(new Object());
	//b2.setItem(new Object()); ��Ʈ�� Ÿ������ �̹� �������� �ٸ�Ÿ���� ������
	
	b1.setItem("ABC");
	b2.setItem("ABC");
	String item = (String)b1.getItem();
	String item2 = b2.getItem();  //�̹� ��Ʈ��Ÿ�Ը� ���⶧���� ����ȯ ���ʿ�
}
}