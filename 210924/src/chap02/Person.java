package chap02;

public class Person {
	private String Name;   ///��� ����
	private String School;
	private int Grade;
	
	
	/////////�����ε� overloadeing
	Person(){}///////////3���� �� 1
	
	Person(String name, String school, int grade){///////2
		this.Name = name;
		this.School = school;
		this.Grade = grade;
	}
	Person(String school,int grade){//////////////3
		this.School=school;
		this.Grade=grade;
	}
	
	
	//����޼ҵ�
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getSchool() {
		return School;
	}
	public void setSchool(String school) {
		this.School = school;
	}
	public int getGrade() {
		return Grade;
	}
	public void setGrade(int grade) {
		if(grade>0||grade<4)
		this.Grade = grade;
	}
	public String showPersonInfo() {
		return ("�̸�:"+Name+"\n"+"�б�:"+School+"\n"+"�г�:"+Grade);}
		

}
