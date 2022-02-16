package HW;

public class Student {
	String Name;
	int Number ;
	double Korean;
	double Math;
	double English;
	double sum;
	double avg;
	
	Student(){}
	Student(String name,int number,double korean,double math,double english){
	this.Name = name;
	this.Number = number;
	this.Korean = korean;
	this.Math = math;
	this.English = english;
	sum =Korean+Math+English;
	avg = sum/3;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getNumber() {
		return Number;
	}
	public void setNumber(int number) {
		Number = number;
	}
	public double getKorean() {
		return Korean;
	}
	public void setKorean(double korean) {
		Korean = korean;
	}
	public double getMath() {
		return Math;
	}
	public void setMath(double math) {
		Math = math;
	}
	public double getEnglish() {
		return English;
	}
	public void setEnglish(double english) {
		English = english;
	}

	public String studentInfo() {
		return ("이름:"+Name+"\n"+"학번:"+Number+"\n"
	+"국어:"+Korean+"\n"+"수학:"+Math+"\n"+"영어:"+English+"\n"+
	"총점:"+sum+"\n"+"평균:"+avg+"\n");
		
		
		}
	}	

