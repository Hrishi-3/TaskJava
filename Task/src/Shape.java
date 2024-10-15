/*Write a Java program to create a base class Shape with a method called calculateArea(). 
Create three subclasses: Circle, Rectangle, and Triangle. 
Override the calculateArea() method in each subclass to calculate and return the shape's area.*/
public class Shape {
	 double area;
	 void calculateArea(){ 
		
	}
}
class Circle extends Shape {
	double pi ;
	double radius;
	Circle(double pi,double radius){
		this.pi=pi;
		this.radius =radius;
	}
	@Override
	void calculateArea() {
		area = pi*radius*radius;
		System.out.println("Area of Circle: " +area);
	}
	
}
class Rectangle extends Shape{
	double length;
	double width;
	Rectangle(double length , double width){
		this.length=length;
		this.width=width;
	}
	@Override
    void calculateArea(){
		area = length*width;
		System.out.println("Area of Rectangle: "+area);
		
	}
}
class Triangle extends Shape{
	double base;
	double height;
	Triangle(double base , double height){
		this.base =base ;
		this. height = height;	
	}
	@Override
	 void calculateArea() {
		area =0.5*base*height;
		System.out.println("Area of Triangle: "+area);
	}
}