public class Vehicle {
         void move() {
        System.out.println("Vehicle is moving");
}
        public static void main(String[] args) {
            Vehicle v1 = new car();
            Vehicle v2 = new Bike();
            v1.move();
            v2.move();
        }

}
 class car extends Vehicle {
    void move() {
        System.out.println("Car is driving");
    }
    
}
class Bike extends Vehicle {
 void move() {
        System.out.println("Bike is riding");
    }
  
}
