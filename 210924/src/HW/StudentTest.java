package HW;

public class StudentTest {

	public static void main(String[] args) {
		
			Student s1= new Student();
			Student s2= new Student("�ſ���",20218,50,30,36);
			Student s3= new Student("�־��",21135,97,88,94);
		
			s1.setName("�赵��");
			s1.setNumber(20151);
			s1.setKorean(90);
			s1.setMath(80);
			s1.setEnglish(84);
			
			System.out.println(s1.studentInfo());
			System.out.println(s2.studentInfo());
			System.out.println(s3.studentInfo());
			
	}

}
