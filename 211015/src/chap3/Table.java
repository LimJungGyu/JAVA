package chap3;

import java.util.ArrayList;

public class Table {
	String[] dishNames ={"donut","donut","burger"};  //도넛이 더 자주나옴
	final int MAX_FOOD=6;       //테이블에 놓을수 있는 최대 음식수
	
	private ArrayList<String> dishes = new ArrayList<>();
	

	public synchronized void add(String dish) {
		//테이블에 음식 꽉찼으면, 음식을 추가하지않음
		if(dishes.size()>=MAX_FOOD)
			return;
		dishes.add(dish);
		System.out.println("Dishes: "+dishes.toString());
		
	}

	public boolean remove(String dishName) {
		//지정된 요리와 일치하는 요리를 제거한다(고객이 먹는것)
		synchronized(this) {
			while(dishes.size()==0) {
				String name = Thread.currentThread().getName();
				System.out.println(name+"is waiting.");
				try {
					Thread.sleep(500);
				}catch(InterruptedException e){}
			
		}
		for(int i=0; i<dishes.size();i++)
			if(dishName.equals(dishes.get(i))) {
				dishes.remove(i);
				return true;
			}
		}	return false;
	}
	public int dishNum() {return dishNames.length;}

}
