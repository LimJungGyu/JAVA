
	public void updateData() throws ExceptionHandling {
		System.out.print("수정할 정보의 이름을 입력하세요");
		String name = ScannerMenu.scan.nextLine();
		
		Iterator itr = infoStorage.iterator();
		while(itr.hasNext()) {
			Person curInfo = (Person)itr.next();
			if(name.equals(curInfo.name)) {
				itr.remove();
				System.out.println("선택하세요");
				System.out.println("1.일반, 2.고객, 3.직원");
				
				int choice = Integer.parseInt(ScannerMenu.scan.nextLine());
				Person info = null;
				
				System.out.println(choice+"번 을 선택하셧습니다");
				
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
					System.out.println("입력완료");
				}else {
					System.out.println("저장실패");
				}
				
			}
			
				

