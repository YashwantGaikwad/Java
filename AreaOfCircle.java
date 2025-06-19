
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        final float pi = 3.14f; //The final keyword is useful when you want a variable to always store the same value, like PI (3.14159...). The final keyword is called a "modifier"
        double radius;
        
        System.out.print("Enter the radius:");
        Scanner sc = new Scanner(System.in);
        radius = sc.nextInt();
        
        double area = pi*radius*radius;
        System.out.println("Enter the area of circle:"+area);
    }
}
