public class Shape {
    double area() {
        return 0;
    }
    public static void main(String[] args) {
        Shape s;

        s = new Circle(7);
        System.out.println("Circle area: " + s.area());
        s = new Rectangle(5, 4);
        System.out.println("Rectangle area: " + s.area());
        s = new Triangle(6,3);
        System.out.println("Triangle area: " + s.area());
    }

}
class Circle extends Shape {
    double radius;
    Circle(double r) {
        radius = r;
    }
    double area() {
        return Math.PI*radius*radius;
    }
}
class Rectangle extends Shape {
    double length;
    double width;
    Rectangle(double int1, double  w) {
        length =1;
        width = w;
        
    }
    double area() {
        return length * width;
    }
}
class Triangle extends Shape {
    double base;
    double height;
    Triangle(double b, double h) {
        base = b;
        height = h;
    }
    double area() {
        return 0.5 * base * height;
    }
}