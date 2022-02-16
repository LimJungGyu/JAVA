package chap3;

public class Point {
	int x;
	int y;
	
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	Point(){
		this(5,5);
	}
	String getXY() {
		return "("+x+","+y+")";
	}
}
