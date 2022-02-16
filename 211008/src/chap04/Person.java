package chap04;

public class Person {
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age=age;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person tmp = (Person)obj;
			return name.equals(tmp.name)&& age==tmp.age;
		}
		return false;
	}
	

	@Override
	public int hashCode() {  ///�ؽ��ڵ尪�� ã�Ƽ� ���� �̸� �ߺ�����
		return (name+age).hashCode();
	}

	@Override
	public String toString() {
		return name+":"+age;
	}

}
