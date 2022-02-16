package HW;


public class BookTest {

	public static void main(String[] args) {
		Book b1 =new Book("럭키","김도윤",20210825);
		Book b2 =new Book("인생은 실전이다","신영준,주언규",20210908);
		Book b3 =new Book("소크라테스 익스프레스","에릭 와이너",20210428);
		
		
		
		System.out.println(b1.showBookInfo());
		System.out.println(b2.showBookInfo());
		System.out.println(b3.showBookInfo());
		
		

	}

}
