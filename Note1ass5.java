class Note1ass5 {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(3), new Rectangle(3, 6), new Triangle(3, 7)};
        for (Shape shape : shapes){
            String name = shape.getClass().getSimpleName();
            System.out.println("The Area of a "+ name + " is "+ shape.area());
        }
    }
    static abstract class Shape {
        abstract double area();
    }
    static class Circle extends Shape{
        double radius;
        Circle(double radius){
            this.radius = radius;
        }
        double area(){
            // Area of a circle
            double result = Math.PI * radius * radius;
            return result;
        }
    }
    static class Rectangle extends Shape {
        double length;
        double width;
        Rectangle(double length, double width){
            this.length = length;
            this.width = width;
        }
        double area() {
            // Area of a rectangle
            double result = length * width;
            return result;
        }
    }
    static class Triangle extends Shape{
        double breadth;
        double height;
        Triangle(double breadth, double height){
            this.breadth = breadth;
            this.height = height;
        }
        double area(){
            // Area if A Triangle
            double result = 0.5 * breadth * height;
            return result;
        }
    }
}