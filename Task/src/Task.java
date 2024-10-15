/*Write a Java program to create a base class Shape with methods draw() and calculateArea(). 
 * Create three subclasses: Circle, Square, and Triangle. 
 * Override the draw() method in each subclass to draw the respective shape, and override the calculateArea() method to calculate and return the area of each shape.
 */

class Shape1 {
	double area;
	 void draw() {
		 System.out.println("Drawing shapes....");
		 
	 }
	void calculateArea() {
		System.out.println("calculating areas....");
		
	}
}
class Circle1 extends Shape1{
	double pi ;
	double radius;
	Circle1(double pi,double radius){
		this.pi=pi;
		this.radius =radius;
	}
	@Override
	void calculateArea() {
		area = pi*radius*radius;
		System.out.println("Area of Circle: " +area);
	}
	@Override
	void draw() {
		System.out.println("Drawing Circle...");
	}
	
}
class Square extends Shape1{
	double side;
	Square(double side){
		this.side=side;
	}
	@Override
	void calculateArea() {
		area = side*side;
		System.out.println("Area of Square: "+area);
	}
	@Override
	void draw() {
		System.out.println("Drawing Square...");
	}
	
}
class Triangle1 extends Shape1{
	double base;
	double height;
	Triangle1(double base , double height){
		this.base =base ;
		this. height = height;	
	}
	@Override
	 void calculateArea() {
		area =0.5*base*height;
		System.out.println("Area of Triangle: "+area);
	}
	@Override
	void draw() {
		System.out.println("Drawing Triangle...");
	}
	
	
}
class Cylinder extends Shape1{
	double height;
	
	double radius;
	Cylinder(double height,double radius){
		this.height= height;
		this.radius=radius;
	}
	@Override
	void calculateArea() {
		area = (2*height*radius *3.14) + (2*3.14*radius*radius);
		System.out.println("Surface area of cylinder: "+area);
	}
	
	@Override
	void draw() {
		System.out.println("Drawing Cylinder...");
	}
	
	
}
public class Task {

	public static void main(String[] args) {
		Circle1 c = new Circle1 (3.14,6);
		c.calculateArea();
		c.draw();
		
		Triangle1 t =new Triangle1(5,6);
		t.calculateArea();
		t.draw();
		
		Square s = new Square(2);
		s.calculateArea();
		s.draw();
		
		Cylinder c1 = new Cylinder(5,7);
		c1.calculateArea();
		c1.draw();
		
		Shape s1 = new Circle(3.14,6);
		s1.calculateArea();
		
		

	}

}
