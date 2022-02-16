package chap3;

public class Circle extends Shape{
	///상속하지않고 is a /has a 를 생각해서 상속받을지 결정
	Point center;
	
	int r;
	
	Circle(){
		center =new Point(0,0);         //////하나
		r=100;
	
	}
	Circle(Point center, int r){         //////둘 중 선택해서 사용
		this.center = center;
		this.r = r;
	}
	@Override
	void draw() {
		System.out.printf("[center=(%d,%d)],r=%d,color=%s]%n",center.x,center.y,r,color);
		
	}
	}
	
