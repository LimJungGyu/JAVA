package chap02;

public class ExceptionEx2 {

	public static void main(String[] args) {
		int number=100;
		int result = 0;
		
		for(int i=0; i<10;i++) {
			try {
				result = number/(int)(Math.random()*10);
				System.out.println(result);  //오류 예상코드와 그코드와 연관되어있는 코드까지 전부 try문에 넣는다
			}catch(ArithmeticException e) {
				//e.printStackTrace(); 개발자의 오류 확인용
				System.out.println("예외메세지 : "+e.getMessage());
			}catch(Exception e) {
				System.out.println("Exception");
			}finally {
				System.out.println("----"); ///무조건 실행하는거 위에 return이 있더라도 파이널리는 실행
			}
		}
		
	}

}
