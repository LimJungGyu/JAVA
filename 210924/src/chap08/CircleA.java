package chap08;

public class CircleA {
	double r;
	final double PI =3.14;
	
	CircleA(){}
	CircleA(double r){
		if(r <=0) return;
		this.r = r;
	}
	double calcArea() {
		return r*r*PI;
	}
	double calcRound() {
		return 2*PI*r;
	}
}
