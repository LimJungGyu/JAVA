package chap06;

public class ParamEx01 {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		
		System.out.println(d.x);
		change(d.x);
		System.out.println("after change(d.x)");
		System.out.println("main()의 x="+d.x);
	
	}
	static void change(int x) { //////기본자료형을 매개변수로(값만 전달받게됨)
		x=1000;
		System.out.println("change()의 x="+x);
	}

}
