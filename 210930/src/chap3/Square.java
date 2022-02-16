package chap3;

public class Square extends Shape {
	Point[] p =new Point[4];
	
	Square(Point[] p) {
		this.p =p;
	}

	@Override
	void draw() {
		System.out.printf("[p1=%s,p2=%s,p3=%s,p4=%s, color=%s]%n"
				,p[0].getXY(),p[1].getXY(),p[2].getXY(),p[3].getXY(),color);
	}
	void testMethod() {
		System.out.println("test");
	}
}
