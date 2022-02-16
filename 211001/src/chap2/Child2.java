package chap2;

public class Child2 extends Parent{
	int x= 200;
			
	@Override
	void method() {
		System.out.println("x="+x);
		System.out.println("super.x="+this.x);
		System.out.println("this.x="+this.x);
	}

}
