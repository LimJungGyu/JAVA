package step701;

import step7.PhoneBookManager;

public class PhoneBookVer07 {

	public static void main(String[] args) {
		//PhoneBookManager manager = new PhoneBookManager();
		PhoneBookManager manager = PhoneBookManager.getInstance();

		int choice=0;
		
		while(true) {
			MenuViewer.showMenu();  //static �޼ҵ�� ����
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
						//���Ͽ� �����ϱ�
						manager.storeToFile();
						System.out.println("���α׷� ����");
						return;
				}
			} catch(NumberFormatException e) {
				System.out.println("���ڸ� �Է��ϼ���");
			} catch(MenuChoiceException e) {
				e.showWrongChoice();
				System.out.println("�޴� ������ ó������ �ٽ� �����մϴ�.");
			}
		}
		
	}

}
