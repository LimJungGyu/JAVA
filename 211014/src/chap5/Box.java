package chap5;

import java.util.ArrayList;

class Box<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item)	{list.add(item);}
	T get(int i) 		{return list.get(i);}
	int size() 			{return list.size();}
	
	public String toString() {return list.toString();}
	
	
	ArrayList<T> getList(){
		return list;
	}
}