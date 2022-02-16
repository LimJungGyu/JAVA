package chap02;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 =new Person();
		Person p2 =new Person();
		Person p3 =new Person("park","korea",1);
		Person p4 =new Person("seoul",3);
		
		p1.setName("신정희");
		p1.setSchool("한국");
		p1.setGrade(4);
		p2.setName("임중규");
		p2.setSchool("한국");
		p2.setGrade(1);
		
		System.out.println(p1.showPersonInfo());
		System.out.println(p2.showPersonInfo());
		System.out.println(p3.showPersonInfo());
		System.out.println(p4.showPersonInfo());
		
		
		

	}

}
