package chap4;

import java.util.ArrayList;

public class Table {
	String[] dishNames ={"donut","donut","burger"};  //������ �� ���ֳ���
	final int MAX_FOOD=6;       //���̺� ������ �ִ� �ִ� ���ļ�
	
	private ArrayList<String> dishes = new ArrayList<>();
	

	public synchronized void add(String dish) {
		while(dishes.size() >=MAX_FOOD) {
			String name =Thread.currentThread().getName();
			System.out.println(name+" is waiting");
			try {
				wait();
				Thread.sleep(500);
				
			}catch(InterruptedException e) {}
		}
		dishes.add(dish);
		notify();
		System.out.println("Dishes: "+dishes.toString());
	}

	public boolean remove(String dishName) {
		//������ �丮�� ��ġ�ϴ� �丮�� �����Ѵ�(���� �Դ°�)
		synchronized(this) {
			
		String name = Thread.currentThread().getName();
		while(dishes.size()==0) {
		
			System.out.println(name+"is waiting.");
			try {
				Thread.sleep(500);
			}catch(InterruptedException e){}
			
		}
		while(true) {
		for(int i=0; i<dishes.size();i++) {
			if(dishName.equals(dishes.get(i))) {
				dishes.remove(i);
				notify();
				return true;
			}
		}
		try {
			System.out.println(name+" is waiting");
			wait();
			Thread.sleep(500);
			}catch(InterruptedException e) {}
			}
		}
	}
	public int dishNum() {return dishNames.length;}

}
