package HW;

public class BookA {
	String title;
	String name;
	int year;
	
	BookA(){}
	public BookA(String title, String name, int year) {
		
		this.title = title;
		this.name = name;
		this.year = year;///���콺 ��Ŭ��-�ҽ�-cons~fieldŬ�� �ؼ� ������
	
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if(year <=0) return;
		this.year = year;
	}
	String showBookAInfo() {
		return "å����: "+title +"\n����:"+name+"\n���ǳ⵵"+year;
	}
}
