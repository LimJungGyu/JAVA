package step701;

public class MenuChoiceException extends Exception {
	int wrongChoice;
	
	public MenuChoiceException(int choice){
		super("잘못된 선택입니다.");
		wrongChoice = choice;
	}
	
	public void showWrongChoice() {
		System.out.println(wrongChoice + "에 해당하는 메뉴는 존재하지 않습니다.");
	}
}
