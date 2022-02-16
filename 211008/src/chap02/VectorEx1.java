package chap02;

import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {
		Vector v = new Vector (5); //용량(capcity) 5인 백터생성
		v.add("1");  //숫자아니고 문자다\
		
		v.add("2");
		v.add("3");
		print(v);
		
		v.trimToSize(); //(빈공간 없앤다. 용량과크기 같아짐)
		System.out.println("======After trimToSize()");
		print(v);
		
		v.ensureCapacity(6); //(용량이 최소한 6이 되도록한다)
		System.out.println("======After ensureCapacity(6)");
		
		v.setSize(7);//크기를 7로한다 --> 용량 모자람-->백터는 자동적으로 기존크기(6)의 두배로 만듬
		System.out.println("======After setSize(7)");
		print(v);
		
		v.clear();//모든 요소 삭제-->크기 0/용량은 6의 2배인 12
		System.out.println("======After clear()");
		print(v);	
	}
	public static void print(Vector v) {
		System.out.println(v);
		System.out.println("size: "+v.size());
		System.out.println("capacity : "+ v.capacity());
	}

}
