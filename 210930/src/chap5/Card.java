package chap5;

public class Card {
	static final int  KIND_MAX=4;
	static final int NUM_MAX=13;
	
	static final int SPADE =4;
	static final int DIAMOND=3;
	static final int HEART=2;
	static final int CLOVER=1;
	int kind;
	int number;
	
	
	
	Card(int kind, int number){
		this.kind=kind;
		this.number=number;
	}
	Card(){
		this(SPADE,1);
	}
	@Override
	public String toString() {
		String[]kinds = {"","CLOVER","HEART","DIAMOND","SPADE"};
		String numbers ="123456789XJQK";
		return "kind: "+kinds[this.kind]+",number:"+numbers.charAt(this.number);
	}
	
	
}