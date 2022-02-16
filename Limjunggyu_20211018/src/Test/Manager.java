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

	public void searchData() {
		System.out.print("�˻��� ������ �̸��� �Է��ϼ���");
		String name = ScannerMenu.scan.nextLine();
		
		Person info = search(name);
		if(info == null) {
			System.out.println("�����Ͱ� �������� �ʽ��ϴ�.");
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
		System.out.print("������ ������ �̸��� �Է��ϼ���");
		String name = ScannerMenu.scan.nextLine();
		
		Iterator itr = infoStorage.iterator();
		while(itr.hasNext()) {
			Person curInfo = (Person)itr.next();
			if(name.equals(curInfo.name)) {
				itr.remove();
				System.out.println("������ �Ϸ�Ǿ����ϴ�.");
				return;
			}
		}
		
		System.out.println("�����Ͱ� �������� �ʽ��ϴ�.");	
	}
	public void updateData() throws ExceptionHandling {
		System.out.print("������ ������ �̸��� �Է��ϼ���");
		String name = ScannerMenu.scan.nextLine();
		
		Iterator itr = infoStorage.iterator();
		while(itr.hasNext()) {
			Person curInfo = (Person)itr.next();
			if(name.equals(curInfo.name)) {
				itr.remove();
				selectPerson();
				System.out.println("�����Ǿ����ϴ�");
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
