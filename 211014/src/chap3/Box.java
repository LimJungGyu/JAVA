package chap3;

public class Box {
	Object item;

	public Object getItem() {
		return item;
	}
	public void setItem(Object item) {
		this.item = item;
	}	
}
class Box2<T>{ //선언할때 타입적으면됨
	T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
}
