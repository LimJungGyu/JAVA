package step701;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PhoneBookManager {
	
	private File dataFile = new File("PhoneBook.dat");
	Set<PhoneInfo> infoStorage = new HashSet<PhoneInfo>();
	
	static PhoneBookManager inst=null;
	
	private PhoneBookManager() {
		readFromFile();
	}
	
	public static PhoneBookManager getInstance() {
		if(inst==null) {
			inst = new PhoneBookManager();
		}
		return inst;
	}
	
	//��ȸ
	public void searchData() {
		System.out.print("�˻��� �̸� �Է�>>>>");
		String name = MenuViewer.keyboard.nextLine();
		
		PhoneInfo info = search(name);
		if(info == null) {
			System.out.println("�����Ͱ� �������� �ʽ��ϴ�.");
		}else {
			info.showPhoneInfo();
		}
	}
	
	private PhoneInfo search(String name) {
		Iterator itr = infoStorage.iterator();
		while(itr.hasNext()) {
			PhoneInfo curInfo = (PhoneInfo)itr.next();
			if(name.equals(curInfo.name)) {
				return curInfo;
			}
		}
		return null;
	}
	
	//����
	public void deleteData() {
		System.out.print("������ �̸� �Է�>>>>");
		String name = MenuViewer.keyboard.nextLine();
		
		Iterator itr = infoStorage.iterator();
		
		while(itr.hasNext()) {
			PhoneInfo curInfo = (PhoneInfo)itr.next();
			if(name.equals(curInfo.name)) {
				itr.remove();
				System.out.println("������ �Ϸ�Ǿ����ϴ�.");
				return;
			}
		}
		
		System.out.println("�����Ͱ� �������� �ʽ��ϴ�.");
		/*
		//������ ������ ��ġ�� ã��
		int idx = -1;
		
		for(int i=0; i<curCnt; i++) {
			if(name.equals(infoStorage[i].name)) {
				idx = i;
				//ã�������ش�迭���� �����ϱ�
				//1. ������ ��ġ���� ū�迭�� �ű��.
				//2.curCnt ����;
				for(int j=idx; j<curCnt-1; j++) {
					infoStorage[j] = infoStorage[j+1];
				}
				System.out.println("������ �Ϸ�Ǿ����ϴ�.");
				curCnt--; //�������� ������� ?
			}
		}
		
		//��ã���� ���������ʽ��ϴ�. �޼��� �����ֱ�
		if(idx < 0) {
			System.out.println("�����Ͱ� �������� �ʽ��ϴ�.");
		}
		*/
	}
	//����
	public void updateData() {
		//������ �̸��Է� �޾Ƽ� �˻��ؼ� ��ġã�� : idx
		//����, ������� �Է¹޾� ���� 
	}
	//�Է�
	private PhoneInfo readData() {
		System.out.print("�̸�: ");
		String name=MenuViewer.keyboard.nextLine();
		System.out.print("��ȭ��ȣ: ");
		String phone=MenuViewer.keyboard.nextLine();
		System.out.print("�������: ");
		String birth=MenuViewer.keyboard.nextLine();
		
		return new PhoneInfo(name, phone, birth);
		
	}
	
	private PhoneInfo readUnivData() {
		System.out.print("�̸�: ");
		String name=MenuViewer.keyboard.nextLine();
		System.out.print("��ȭ��ȣ: ");
		String phone=MenuViewer.keyboard.nextLine();
		System.out.print("�������: ");
		String birth=MenuViewer.keyboard.nextLine();
		System.out.print("����: ");
		String major=MenuViewer.keyboard.nextLine();
		System.out.print("�г�: ");
		int grade=Integer.parseInt(MenuViewer.keyboard.nextLine());
		
		return new PhoneUnivInfo(name, phone, birth,major, grade);
		//curCnt++;
		//System.out.println("������ �Է��� �Ϸ�Ǿ����ϴ�. \n");
	}
	
	private PhoneInfo readCompData() {
		System.out.print("�̸�: ");
		String name=MenuViewer.keyboard.nextLine();
		System.out.print("��ȭ��ȣ: ");
		String phone=MenuViewer.keyboard.nextLine();
		System.out.print("�������: ");
		String birth=MenuViewer.keyboard.nextLine();
		System.out.print("ȸ��: ");
		String company=MenuViewer.keyboard.nextLine();
		
		return new PhoneCompInfo(name, phone, birth, company);
		//curCnt++;
		//System.out.println("������ �Է��� �Ϸ�Ǿ����ϴ�. \n");
	}
	
	public void inputData() throws MenuChoiceException
	{
		System.out.println("������ �Է��� �����մϴ�..");
		System.out.println("1. �Ϲ�, 2. ����, 3. ȸ��");
		System.out.print("����>> ");
		int choice = Integer.parseInt(MenuViewer.keyboard.nextLine());
		PhoneInfo info = null;
		
		if(choice< InputSelect.NORMAL || choice >InputSelect.COMPANY) {
			throw new MenuChoiceException(choice);
		}
		
		switch(choice) {
		 	case InputSelect.NORMAL:
		 		info = readData();
				break;
		 	case InputSelect.UNIV:
		 		info = readUnivData();
		 		break;
		 	case InputSelect.COMPANY:
		 		info = readCompData();
		}
		
		//infoStorage[curCnt]= info;
		//curCnt++;
		boolean isAdded = infoStorage.add(info);
		
		if(isAdded) {
			System.out.println("������ �Է��� �Ϸ�Ǿ����ϴ�. \n");
		}else {
			System.out.println("�̹� ����� �������Դϴ�.");
		}
		
	}
	
	public void displayAll() {
		//for(int i=0; i<curCnt; i++) {
		//	infoStorage[i].showPhoneInfo();
		//}
		
		Iterator itr= infoStorage.iterator();
		while(itr.hasNext()) {
			PhoneInfo curInfo =(PhoneInfo)itr.next();
			curInfo.showPhoneInfo();
		}
	}
	public void storeToFile() {
		try {
			FileOutputStream fos = new FileOutputStream(dataFile);
			ObjectOutputStream  out = new ObjectOutputStream(fos);
			Iterator<PhoneInfo> itr = infoStorage.iterator();
			while(itr.hasNext()) {
				out.writeObject(itr.next());
			}
			out.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	public void readFromFile() {
		if(dataFile.exists()==false) {
			return;
		}
		
		try {
			FileInputStream fis = new FileInputStream(dataFile);
			ObjectInputStream in = new ObjectInputStream(fis);
			
			while(true) {
				PhoneInfo info = (PhoneInfo)in.readObject();
				
				if(info == null)
					break;
				infoStorage.add(info);
			}
			
			in.close();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
