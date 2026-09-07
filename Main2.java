class Main2{
 public static void main(String[] args) {
     Toyota corolla = new Toyota(80);
     System.out.println("The Speed of my Car is " + corolla.speed + " km/h");
 }
     }
class Car {
    int speed;
}
class Toyota extends Car {
    Toyota(int speed) {
        super.speed = speed;
    }
}