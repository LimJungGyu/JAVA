package Test;

public class ExceptionHandling extends Exception{
	int error;
	
	public ExceptionHandling(int choice){
		super("잘못입력하셧습니다");
		error = choice;
		}
	public void showWrongChoice() {
		System.out.println(error+"에 해당하는 메뉴는 존재하지않습니다");
		
		
	}
}

