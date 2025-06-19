/*Create a Car object named myCar. Call the fullThrottle() and speed() methods on the myCar object, and run the program: */

public class ClassMethod1 {
    public void fullThrottle(){
        System.out.println("This car is at full speed..!");
    }
    public void speed(int maxspeed){
        System.out.println("Max speed is :"+ maxspeed);
    }

    public static void main(String[] args) {
        ClassMethod1 myCar = new ClassMethod1();
        myCar.fullThrottle();
        myCar.speed(220);
    }
}
