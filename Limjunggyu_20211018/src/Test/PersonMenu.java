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
					System.out.println("���α׷� ����");
					return;
			}
		}catch(NumberFormatException e){
			System.out.println("���ڸ� �Է����ּ���");
		}catch(ExceptionHandling e) {
			e.showWrongChoice();
			System.out.println("�޴������� ó������ �ٽ� �����մϴ�.");
			}
		}	
	}
}


