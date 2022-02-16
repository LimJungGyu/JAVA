package Test;

import java.io.*;
import java.util.*;

public class Manager {
	private File personFile = new File("Person.dat");
	Set<Person> infoStorage = new HashSet<Person>();
	
	static Manager inst=null;
	
	private Manager() {
		readFromFile();
	}
	
	public static Manager getInstance() {
		if(inst==null) {
			inst = new Manager();
		}
		return inst;
	}
	private Person inputData() {
		System.out.print("name: ");
		String name=ScannerMenu.scan.nextLine();
		System.out.print("phone_number: ");
		String phone=ScannerMenu.scan.nextLine();
		System.out.print("address: ");
		String address=ScannerMenu.scan.nextLine();
		
		return new Person(name, phone, address);	
	}	
	private Person inputDataCustomer() {
		System.out.print("name: ");
		String name=ScannerMenu.scan.nextLine();
		System.out.print("phone: ");
		String phone=ScannerMenu.scan.nextLine();
		System.out.print("address: ");
		String address=ScannerMenu.scan.nextLine();
		System.out.print("customerID: ");
		String customerID=ScannerMenu.scan.nextLine();
		System.out.print("point: ");
		int point=Integer.parseInt(ScannerMenu.scan.nextLine());
		
		return new Customer(name, phone,address,customerID, point);
	}
	private Person InputDataEmployee() {
		System.out.print("name: ");
		String name=ScannerMenu.scan.nextLine();
		System.out.print("phone: ");
		String phone=ScannerMenu.scan.nextLine();
		System.out.print("department: ");
		String department=ScannerMenu.scan.nextLine();
		System.out.print("entryDate: ");
		String entryDate=ScannerMenu.scan.nextLine();
		
		return new Employee(name, phone,department,entryDate);
	}
	public void selectPerson() throws ExceptionHandling
	{
		
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

	public void searchData() {
		System.out.print("검색할 정보의 이름을 입력하세요");
		String name = ScannerMenu.scan.nextLine();
		
		Person info = search(name);
		if(info == null) {
			System.out.println("데이터가 존재하지 않습니다.");
		}else {
			info.ShowPerson();
		}
	}
	
	private Person search(String name) {
		Iterator itr = infoStorage.iterator();
		while(itr.hasNext()) {
			Person curInfo = (Person)itr.next();
			if(name.equals(curInfo.name)) {
				return curInfo;
			}
		}
		return null;
	}
	public void deleteData() {
		System.out.print("삭제할 정보의 이름을 입력하세요");
		String name = ScannerMenu.scan.nextLine();
		
		Iterator itr = infoStorage.iterator();
		while(itr.hasNext()) {
			Person curInfo = (Person)itr.next();
			if(name.equals(curInfo.name)) {
				itr.remove();
				System.out.println("삭제가 완료되었습니다.");
				return;
			}
		}
		
		System.out.println("데이터가 존재하지 않습니다.");	
	}
	public void updateData() throws ExceptionHandling {
		System.out.print("수정할 정보의 이름을 입력하세요");
		String name = ScannerMenu.scan.nextLine();
		
		Iterator itr = infoStorage.iterator();
		while(itr.hasNext()) {
			Person curInfo = (Person)itr.next();
			if(name.equals(curInfo.name)) {
				itr.remove();
				selectPerson();
				System.out.println("수정되었습니다");
				}
			}

	}
	
	public void displayList() {
		
		Iterator itr= infoStorage.iterator();
		while(itr.hasNext()) {
			Person curInfo =(Person)itr.next();
			curInfo.ShowPerson();
		}
	}

	public void storeToFile() {
		try {
			FileOutputStream fos = new FileOutputStream(personFile);
			ObjectOutputStream out = new ObjectOutputStream(fos);
			Iterator<Person> itr = infoStorage.iterator();
			while(itr.hasNext()) {
				out.writeObject(itr.next());
			}out.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	public void readFromFile() {
		if(personFile.exists()==false) {
			return;
		}
		
		try {
			FileInputStream fis = new FileInputStream(personFile);
			ObjectInputStream in = new ObjectInputStream(fis);
			
			while(true) {
				Person info = (Person)in.readObject();
				if(info == null)
					break;
				infoStorage.add(info);
			}in.close();
			}catch(EOFException e) {
			e.printStackTrace();
			}catch(IOException e) {
			e.printStackTrace();
			}catch(ClassNotFoundException e) {
			e.printStackTrace();
			}
			
		}

	
}
