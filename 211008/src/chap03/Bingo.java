package chap03;

import java.util.*;

public class Bingo {

	public static void main(String[] args) {
		//hashset linkedhashset둘다 중복되지않는 랜덤값을 가져오지만
		//hashset은 자체적인 저장방식이 있기에 비슷한자리에 같은숫자가 나온다
		//그러므로 이런건 hashset으로 말고 linkedhashset으로 하자
		
		//Set set = new HashSet();
		Set set = new LinkedHashSet();	
		int[][] board = new int[5][5];
		
		for(int i=0; set.size()<25; i++) {
			set.add((int)(Math.random()*50)+1+"");
		}
		Iterator it = set.iterator();
		
		for(int i=0; i<board.length; i++) {
			for(int j=0;j<board[i].length;j++) {
				board[i][j] = Integer.parseInt((String)it.next());
				System.out.println((board[i][j]<10?" ":" ") + board[i][j]);
			}
			System.out.println();
		}

	}

}
