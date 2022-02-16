package chap08;

public class Square {
		
	private int x;
	private int y;
	
	Square(){}
	Square(int x,int y){
		this.x=x;
		this.y=y;
	}
	int calcRound() {
		return (x+y)*2;
	}
	int calcArea() {
		return x*y;
	}
	
	
}
