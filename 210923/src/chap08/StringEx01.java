package chap08;

public class StringEx01 {

	public static void main(String[] args) {
		String name1 = "ȫ�浿";              /////2���� ���
		String name2= new String("ȫ�浿"); ///�̰� ���� new�� ���� �ּҸ� ����ϱ⶧���� ����ġ
		String name3 = "ȫ�浿";        ////new�� �Ⱦ��� �̛̹��� �ܾ�� �ּҸ� ��ġ���ѱ���Ѵ�
		System.out.println(name1==name2);
		System.out.println(name1==name3);
		System.out.println(name1.equals(name3)); ////��Ʈ���� ���ؼ��� �̷��� ��
		

	}

}
