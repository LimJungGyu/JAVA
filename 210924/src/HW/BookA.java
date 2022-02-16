package HW;

public class BookA {
	String title;
	String name;
	int year;
	
	BookA(){}
	public BookA(String title, String name, int year) {
		
		this.title = title;
		this.name = name;
		this.year = year;///마우스 우클릭-소스-cons~field클릭 해서 생성함
	
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
		return "책제목: "+title +"\n저자:"+name+"\n출판년도"+year;
	}
}
