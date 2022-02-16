package chap3;

public class DrawShape {
	public static void main(String[]args) {
		
		Point[] p = {new Point(100,100),
		             new Point(140,50),
		             new Point(200,100),
		             new Point(50,50),
		             new Point(150,150)};
		
		Triangle t = new Triangle(p);
		Circle c = new Circle(new Point(150,150),50);
		Square s = new Square(p);
		t.color="red";
		c.color="blue";
		s.color="green";
		
		t.draw();
		c.draw();
		s.draw();
		s.testMethod();
	}
}
