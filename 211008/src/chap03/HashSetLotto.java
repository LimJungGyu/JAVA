package chap03;
import java.util.*;
public class HashSetLotto {

	public static void main(String[] args) {
		Set set = new HashSet();
		int cnt=0;

		for(int i= 0;set.size()<6;i++) {
			int num = (int)(Math.random()*45)+1;
			if(!set.add(new Integer(num))) { 
				System.out.println(
						num+"은 중복입니다");
			}
			set.add(new Integer(num));
			cnt++;
			
		}
		List list = new LinkedList(set);
		Collections.sort(list);
		System.out.println(list);
		System.out.println(cnt++ +"번만에");
	}

}
