package chap08;

public class Circle {
	
	private double r;
	
	Circle(){}
	Circle(double x){
		this.r= x;
	}
	double calcRound() {
		return r*2*3.14;}
	double calcArea() {
		return r*r*3.14;}
	
}
