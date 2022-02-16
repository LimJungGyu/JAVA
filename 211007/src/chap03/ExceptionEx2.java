package chap03;

public class ExceptionEx2 {

	public static void main(String[] args) {
		
		Object o = new Object();  //java.lang패키지0(기본패키지)의 오브잭트클래스들어가보기
									//궁금하면 컨트롤키 클릭으로 확인
		try {        
		method(); //예외처리 필요
	}catch(ArithmeticException e) {
		System.out.println("예외메세지 : "+e.getMessage());
	}catch(Exception e) {
		System.out.println("Exception");
	}
	}
	static void method() throws ArithmeticException,Exception{
		int number=100;  ///throws를 통해서 예외처리를 다른곳(method())를 사용하는곳으로 던짐
		int result = 0;
		
		for(int i=0; i<10;i++) {
			result = number/(int)(Math.random()*10);
			System.out.println(result); 
			
		}
		
	
	
	}
}
