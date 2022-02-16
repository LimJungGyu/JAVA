package chap05;

import java.util.*;

public class TreeSetLotto {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		Set set2 = new HashSet();
		
		for(int i = 0; set.size()<6; i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(num); //set.add(new Integer(num));이랑 같다
			set2.add(num);
		}
		System.out.println(set);
		System.out.println(set2);
		
		System.out.println(set.headSet(25)); ///25보다 작은거
		System.out.println(set.tailSet(25));///큰거
	}

}

