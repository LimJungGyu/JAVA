package HW;

public class BookATest {

	public static void main(String[] args) {
		BookA b1 = new BookA();
		BookA b2 = new BookA("�λ��� �����̴�","�ſ���,�־��",20210908);
		
		b1.setTitle("�ڹ��� ����");
		b1.setName("������");
		b1.setYear(2021);
		System.out.println(b1.showBookAInfo());
		System.out.println(b2.showBookAInfo());

	}

}
