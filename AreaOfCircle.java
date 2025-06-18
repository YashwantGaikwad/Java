
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        float pi = 3.14f;
        double radius;
        
        System.out.print("Enter the radius:");
        Scanner sc = new Scanner(System.in);
        radius = sc.nextInt();
        
        double area = pi*radius*radius;
        System.out.println("Enter the area of circle:"+area);
    }
}
