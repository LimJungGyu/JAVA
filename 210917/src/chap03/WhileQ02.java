package chap03;

public class WhileQ02 {

	public static void main(String[] args) {
		int i =1;
		int a=0;		
		do {
		a=a+i;
		i=i+2;
	}while (i<100);
	System.out.println(a);
}
}