package chap04;

public class Card {
	String kind;
	int number;
	
	static int width = 100;
	static int height = 150;
	
	Card(){}  ///����Ʈ ������
	
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;	
	}
	Card(String kind){
		this.kind = kind;
	}
	Card(int number){
		this.number =number;
	}
	
}
