package chap03;

public class WhileEx01 {

	public static void main(String[] args) {
		
		int i=0;
		int j=0;
		
		while(i>5) {
			i++;
			System.out.println("hello");
		}
		
		do {
			j++;
			System.out.println("jello");
		}while(j>5);
		////////////do while은 조건이 맞지않아도 한번은 수행한다
	}

}
