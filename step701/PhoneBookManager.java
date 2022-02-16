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
	
	//조회
	public void searchData() {
		System.out.print("검색할 이름 입력>>>>");
		String name = MenuViewer.keyboard.nextLine();
		
		PhoneInfo info = search(name);
		if(info == null) {
			System.out.println("데이터가 존재하지 않습니다.");
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
	
	//삭제
	public void deleteData() {
		System.out.print("삭제할 이름 입력>>>>");
		String name = MenuViewer.keyboard.nextLine();
		
		Iterator itr = infoStorage.iterator();
		
		while(itr.hasNext()) {
			PhoneInfo curInfo = (PhoneInfo)itr.next();
			if(name.equals(curInfo.name)) {
				itr.remove();
				System.out.println("삭제가 완료되었습니다.");
				return;
			}
		}
		
		System.out.println("데이터가 존재하지 않습니다.");
		/*
		//삭제할 데이터 위치를 찾기
		int idx = -1;
		
		for(int i=0; i<curCnt; i++) {
			if(name.equals(infoStorage[i].name)) {
				idx = i;
				//찾았으면해당배열값을 삭제하기
				//1. 삭제할 위치보다 큰배열을 옮긴다.
				//2.curCnt 감소;
				for(int j=idx; j<curCnt-1; j++) {
					infoStorage[j] = infoStorage[j+1];
				}
				System.out.println("삭제가 완료되었습니다.");
				curCnt--; //수행하지 않은경우 ?
			}
		}
		
		//못찾으면 존재하지않습니다. 메세지 보여주기
		if(idx < 0) {
			System.out.println("데이터가 존재하지 않습니다.");
		}
		*/
	}
	//수정
	public void updateData() {
		//수정할 이름입력 받아서 검색해서 위치찾기 : idx
		//전번, 생년월일 입력받아 저장 
	}
	//입력
	private PhoneInfo readData() {
		System.out.print("이름: ");
		String name=MenuViewer.keyboard.nextLine();
		System.out.print("전화번호: ");
		String phone=MenuViewer.keyboard.nextLine();
		System.out.print("생년월일: ");
		String birth=MenuViewer.keyboard.nextLine();
		
		return new PhoneInfo(name, phone, birth);
		
	}
	
	private PhoneInfo readUnivData() {
		System.out.print("이름: ");
		String name=MenuViewer.keyboard.nextLine();
		System.out.print("전화번호: ");
		String phone=MenuViewer.keyboard.nextLine();
		System.out.print("생년월일: ");
		String birth=MenuViewer.keyboard.nextLine();
		System.out.print("전공: ");
		String major=MenuViewer.keyboard.nextLine();
		System.out.print("학년: ");
		int grade=Integer.parseInt(MenuViewer.keyboard.nextLine());
		
		return new PhoneUnivInfo(name, phone, birth,major, grade);
		//curCnt++;
		//System.out.println("데이터 입력이 완료되었습니다. \n");
	}
	
	private PhoneInfo readCompData() {
		System.out.print("이름: ");
		String name=MenuViewer.keyboard.nextLine();
		System.out.print("전화번호: ");
		String phone=MenuViewer.keyboard.nextLine();
		System.out.print("생년월일: ");
		String birth=MenuViewer.keyboard.nextLine();
		System.out.print("회사: ");
		String company=MenuViewer.keyboard.nextLine();
		
		return new PhoneCompInfo(name, phone, birth, company);
		//curCnt++;
		//System.out.println("데이터 입력이 완료되었습니다. \n");
	}
	
	public void inputData() throws MenuChoiceException
	{
		System.out.println("데이터 입력을 시작합니다..");
		System.out.println("1. 일반, 2. 대학, 3. 회사");
		System.out.print("선택>> ");
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
			System.out.println("데이터 입력이 완료되었습니다. \n");
		}else {
			System.out.println("이미 저장된 데이터입니다.");
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
