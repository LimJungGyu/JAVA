package chap08;

public class StringEx01a {

	public static void main(String[] args) {
		String name1 = "abc";              //�ҹ���
		String name2= new String("abc"); ///
		String name3 = "ABC";        ////�빮�� ��
		System.out.println(name1==name2);
		System.out.println(name1==name3);
		
		System.out.println(name1.equalsIgnoreCase(name3)); 
		//������ �̱׳�� ���̽��� ���� ��ҹ��� ���� ���� �ʱ�
		

	}

}
