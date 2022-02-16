package Test;

public class PersonMenu {

	public static void main(String[] args) {
		Manager manager = Manager.getInstance();
		int choice=0;
		
		while(true) {
			ScannerMenu.showMenu();  
			try {  
			choice = Integer.parseInt(ScannerMenu.scan.nextLine());
			if(choice< MenuInterface.INPUT || choice>MenuInterface.EXIT) {
				throw new ExceptionHandling(choice);
				}
			
			switch(choice) {
				case MenuInterface.INPUT:
					manager.selectPerson();
					break;
					
				case MenuInterface.SEARCH:
					manager.searchData();
					break;
					
				case MenuInterface.DELETE:
					manager.deleteData();
					break;
					
				case MenuInterface.UPDATE:
					manager.updateData();
					break;
					
				case MenuInterface.DISPLAY_LIST:
					manager.displayList();
					break;
					
				case MenuInterface.EXIT:
					manager.storeToFile();
					System.out.println("프로그램 종료");
					return;
			}
		}catch(NumberFormatException e){
			System.out.println("숫자만 입력해주세요");
		}catch(ExceptionHandling e) {
			e.showWrongChoice();
			System.out.println("메뉴선택을 처음부터 다시 진행합니다.");
			}
		}	
	}
}


