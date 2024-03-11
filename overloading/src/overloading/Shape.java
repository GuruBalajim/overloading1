package overloading;
class Shapes {
    public double perimeter() {
        return 0.0;
    }
    
    public void printShapeType(String shapeType) {
        System.out.println("This is a " + shapeType);
    }
}

class Circle extends Shapes {
    public double radius;

    public Circle(double radius) {
       this. radius = radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Square extends Shapes {
    public double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }
}

class Triangle extends Shapes {
    public double s1;
    public double s2;
    public double s3;

    public Triangle(double s1, double s2, double s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }
    @Override
    public double perimeter() {
        return s1 + s2 + s3;
    }
}


public class Shape {

	public Shape() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {Circle circle = new Circle(5);
    Square square = new Square(4);
    Triangle triangle = new Triangle(3, 4, 5);

    circle.printShapeType("Circle");
    System.out.println("Perimeter of Circle: " + circle.perimeter());
    
    square.printShapeType("Square");
    System.out.println("Perimeter of Square: " + square.perimeter());
    
    triangle.printShapeType("Triangle");
    System.out.println("Perimeter of Triangle: " + triangle.perimeter());
		// TODO Auto-generated method stub

	}

}
