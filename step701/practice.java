
	public void updateData() throws ExceptionHandling {
		System.out.print("������ ������ �̸��� �Է��ϼ���");
		String name = ScannerMenu.scan.nextLine();
		
		Iterator itr = infoStorage.iterator();
		while(itr.hasNext()) {
			Person curInfo = (Person)itr.next();
			if(name.equals(curInfo.name)) {
				itr.remove();
				System.out.println("�����ϼ���");
				System.out.println("1.�Ϲ�, 2.��, 3.����");
				
				int choice = Integer.parseInt(ScannerMenu.scan.nextLine());
				Person info = null;
				
				System.out.println(choice+"�� �� �����ϼ˽��ϴ�");
				
				if(choice< 1|| choice >3) {
					throw new ExceptionHandling(choice);
				}
				switch(choice) {
				 	case 1:
				 		info = inputData();
						break;
				 	case 2:
				 		info = inputDataCustomer();
				 		break;
				 	case 3:
				 		info = InputDataEmployee();
				}
				boolean check = infoStorage.add(info);
				
				if(check) {
					System.out.println("�Է¿Ϸ�");
				}else {
					System.out.println("�������");
				}
				
			}
			
				

