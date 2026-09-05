class Note1ass3 {
    public static void main(String[] args) {
        System.out.println("Area of a Square " + area(7));//area of a square
        System.out.println("Area of a Rectangle " + area(4.65, 2.89));//area of a rectangle
        System.out.println("Area of a Circle " + area(7.3));//area of a circle

    }
    static int area(int length){
        // Call this method when we want area of a square
        return length*length;
    }
    static double area(double length, double width) {
        // Call this method when we want area of a rectangle
        return length * width;
    }
    static double area(double radius) {
        // Call this method when we want area of a circle
        return Math.PI * radius * radius;
    }
}