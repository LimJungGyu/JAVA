package chap05;

public class CardToString {

	public static void main(String[] args) {
		Card c1 = new Card("HEART",10);
		Card c2 = new Card();
		Card c3 = null;
		try {
		c3 = (Card)c1.clone();
		}catch(CloneNotSupportedException e) {
		}
		 ////card���� �������̵� ���ϸ� ��Ű�ڵ尪�� ��������
		/// �������̵� �ؼ� ���� ������ �Ҽ��ִ�
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c2.toString());
		System.out.println(c2.toString());
		System.out.println(c3);

	

}
}