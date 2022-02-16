package chap03;

import java.util.*;

public class IteratorEx2 {

	public static void main(String[] args) {
		ArrayList original = new ArrayList(10);
		ArrayList copy1    = new ArrayList(10);
		ArrayList copy2    = new ArrayList(10);
		
		for(int i=0; i<10;i++) 
			original.add(i+"");   //숫자로 생긴 문자
		
		Iterator it = original.iterator();
		
		while(it.hasNext())
			copy1.add(it.next());
		System.out.println("=Original에서 copy1로 복사(copy)=");
		System.out.println("original:"+original);
		System.out.println("copy1:"+copy1);
		System.out.println();
		
		it = original.iterator();  //iterator는 재사용불가능-새로 얻어와야함
		
		while(it.hasNext()){
			copy2.add(it.next()); //사실상 이동의 효과 (카피하고 전꺼는 삭제하고)
			it.remove();
		
		}
		System.out.println("=Original에서 copy2로 이동(move)=");
		System.out.println("original:"+original);
		System.out.println("copy2:"+copy2);
	}
	
}
