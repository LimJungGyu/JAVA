package step701;

import step7.PhoneBookManager;

public class PhoneBookVer07 {

	public static void main(String[] args) {
		//PhoneBookManager manager = new PhoneBookManager();
		PhoneBookManager manager = PhoneBookManager.getInstance();

		int choice=0;
		
		while(true) {
			MenuViewer.showMenu();  //static 메소드라서 가능
			try {
				choice = Integer.parseInt(MenuViewer.keyboard.nextLine());
				
				if(choice <InitMenu.INPUT || choice > InitMenu.EXIT) {
					throw new MenuChoiceException(choice);
				}
				
				switch(choice) {
					case InitMenu.INPUT:
						manager.inputData();
						break;
					case InitMenu.SEARCT:
						manager.searchData();
						break;
					case InitMenu.DELETE:
						manager.deleteData();
						break;
					case InitMenu.UPDATE:
						manager.updateData();
						break;
					case InitMenu.DISPLY_ALL:
						manager.displayAll();
						break;
					case InitMenu.EXIT:
						//파일에 저장하기
						manager.storeToFile();
						System.out.println("프로그램 종료");
						return;
				}
			} catch(NumberFormatException e) {
				System.out.println("숫자만 입력하세요");
			} catch(MenuChoiceException e) {
				e.showWrongChoice();
				System.out.println("메뉴 선택을 처음부터 다시 진행합니다.");
			}
		}
		
	}

}
