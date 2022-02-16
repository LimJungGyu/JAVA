package HW;

public class BookATest {

	public static void main(String[] args) {
		BookA b1 = new BookA();
		BookA b2 = new BookA("인생은 실전이다","신영준,주언규",20210908);
		
		b1.setTitle("자바의 정석");
		b1.setName("남국성");
		b1.setYear(2021);
		System.out.println(b1.showBookAInfo());
		System.out.println(b2.showBookAInfo());

	}

}
