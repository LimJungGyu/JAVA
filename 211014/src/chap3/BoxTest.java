package chap3;

public class BoxTest {
	
	public static void main(String[] args) {
	Box b1 = new Box();
	Box2<String> b2 = new Box2<String>();  //선언할때 타입적으면됨
	
	b1.setItem(new Object());
	//b2.setItem(new Object()); 스트링 타입으로 이미 정해져서 다른타입은 오류남
	
	b1.setItem("ABC");
	b2.setItem("ABC");
	String item = (String)b1.getItem();
	String item2 = b2.getItem();  //이미 스트링타입만 오기때문에 형변환 불필요
}
}