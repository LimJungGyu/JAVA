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
class Box2<T>{ //�����Ҷ� Ÿ���������
	T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
}
