package chap06;

public class ParamEx02 {

	public static void main(String[] args) {
		Data d = new Data();
		d.x =10;
		System.out.println(d.x);
		
		change(d);   ////////참조변수이기때문에 타입 동일하게하기위해
		System.out.println("After change(d.x)");
		System.out.println("main() : x="+d.x);
	}
	static void change(Data a) { //////참조형 매개변수로 함 (값이 아닌 주소값을 전달받게됨) 
		a.x =1000;
		System.out.println("change()x="+a.x);
	}
}
