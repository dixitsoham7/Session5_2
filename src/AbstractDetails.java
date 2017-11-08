/*Program includes abstract class named Figure which has 2 abstract methods
 *there are 3 subclasses which define this abstract methods
 *Our task is to find area and perimeter i.e to define this two abstract methods
 *in three subclasses and calculate area and perimeter of three shapes viz. circle, rectangle, triangle
 *Abstract Class also includes data members which are initialized using constructor
 *Program is as follows*/


import java.util.Scanner;

abstract class Figure  //abstract class Figure whose object cannot be created
{
	double dim1,dim2,dim3;  //data members
	
	Figure(double a)   //constructor with one parameter
	{
		dim1=a;   ////initializing data member
	}
	
	Figure(double a, double b)  //constructor with two parameters
	{
		dim1=a;  //initializing data member
		dim2=b;  //initializing data member
	}
	
	Figure(double a, double b, double c)  //constructor with three parameters
	{
		dim1=a;  //initializing data member
		dim2=b;  //initializing data member
		dim3=c;  //initializing data member
	}
	
	abstract void findArea();  //abstract method declared
	abstract void findPerimeter();  //abstract method declared
}

class Circle extends Figure  //subclass extending abstract class
{

	Circle(double radius){   //parameterized constructor
		super(radius);  //calling constructor with one parameter of parent class
	}
	@Override
	void findArea() {  //defining abstract method
		double carea;  //variable of type double
		carea=3.14*dim1*dim1; //area of circle
		System.out.println("Area of Circle : "+carea);  //printing
	}

	@Override
	void findPerimeter() {  //defining abstract method
		double cperi; //variable of type double
		cperi=2*3.14*dim1; //perimeter of circle
		System.out.println("Perimeter of Circle : "+cperi);  //printing
	}
	
}

class Rectangle extends Figure  //subclass extending abstract class
{

	Rectangle(double length, double breadth){  //parameterized constructor
		super(length, breadth);  //calling constructor with two parameters of parent class
	}
	@Override
	void findArea() {  //defining abstract method
		double rarea;  //variable of type double
		rarea=dim1*dim2; //area of rectangle
		System.out.println("Area of Rectangle : "+rarea); //printing
	}

	@Override
	void findPerimeter() {  //defining abstract method
		double rperi;  //variable of type double
		rperi=2*(dim1+dim2); //perimeter of rectangle
		System.out.println("Perimeter of Circle : "+rperi);   //printing
	}
	
}

class Triangle extends Figure  //subclass extending abstract class
{

	Triangle(double base, double height){  //parameterized constructor
		super(base,height);  //calling constructor with two parameters of parent class
	}
	@Override
	void findArea() {
		double tarea;      //variable of type double
		tarea= 0.5*(dim1*dim2); //area of triangle
		System.out.println("Area of Triangle : "+tarea); //printing
	}
	
	Triangle(double side1, double side2, double base)  //parameterized constructor 
	{
		super(side1,side2,base);    //calling constructor with three parameters of parent class
	}
	@Override
	void findPerimeter() {     //defining abstract method declared in abstract class
		double tperi;  //variable of type double
		tperi=dim3+dim1+dim2;   //perimeter of triangle
		System.out.println("Perimeter of Triangle : "+tperi);  //printing
	}
}

public class AbstractDetails {      
	
	public static void main(String[] args) {   //main function
		
		Scanner sc = new Scanner(System.in);  //object of scanner
		
		System.out.println("Dimensions of Circle : ");  //input dimensions of circle
		System.out.print("Enter Radius : "); //inputing radius
		double radius = sc.nextDouble();  //storing radius
		Circle c = new Circle(radius);  //creating object of Circle class and passing radius
		c.findArea();  //calling abstract method
		c.findPerimeter();  //calling abstract method
		
		System.out.println("\nDimensions of Rectangle : ");  //input dimensions of rectangle
		System.out.print("Enter Length : "); //input length
		double length = sc.nextDouble(); //storing length
		System.out.print("Enter Breadth : "); //input breadth
		double breadth = sc.nextDouble(); //storing breadth
		Rectangle r = new Rectangle(length,breadth); //creating object of Rectangle class and passing length and breadth
		r.findArea();  //calling abstract method
		r.findPerimeter(); //calling abstract method
		
		System.out.println("\nDimensions of Triangle : ");   //input dimensions of triangle
		System.out.print("Enter Base : ");  //input base
		double base = sc.nextDouble();  //storing value of base
		System.out.print("Enter Height : "); //input height
		double height = sc.nextDouble();  //storing value of height
		System.out.print("Enter Side 1 : "); //input value of side 1
		double side1 = sc.nextDouble(); //storing value of side 1
		System.out.print("Enter Side 2 : "); //input value of side 2
		double side2 = sc.nextDouble(); //storing value of side 2
		Triangle t = new Triangle(base,height);	//creating object of Triangle class and passing base and height
		t.findArea(); //calling abstract method
		Triangle tr = new Triangle(base,side1,side2);  //creating object and passing base, side1 and side 2 to calculate perimeter of triangle
		tr.findPerimeter();//calling abstract method
		
	} //end of main

} //end of class

//Circle : area = 3.14*radius*radius   perimeter = 2*3.14*radius
//Rectangle : area = length*breadth    perimeter = 2*(length + breadth)
//Triangle : area = 0.5(base * height) perimeter = base +side1+side2
