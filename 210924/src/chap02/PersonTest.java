package chap02;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 =new Person();
		Person p2 =new Person();
		Person p3 =new Person("park","korea",1);
		Person p4 =new Person("seoul",3);
		
		p1.setName("������");
		p1.setSchool("�ѱ�");
		p1.setGrade(4);
		p2.setName("���߱�");
		p2.setSchool("�ѱ�");
		p2.setGrade(1);
		
		System.out.println(p1.showPersonInfo());
		System.out.println(p2.showPersonInfo());
		System.out.println(p3.showPersonInfo());
		System.out.println(p4.showPersonInfo());
		
		
		

	}

}
