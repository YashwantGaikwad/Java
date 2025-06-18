
import java.util.Scanner;

class AreaOfRectangle{
    public static void main(String args[]){
        float length, breadth;
        double area;
        Scanner  sc = new Scanner(System.in);
        System.out.print("Enter the length:");
        length = sc.nextInt();
        System.out.print("Enter the breadth:");
        breadth = sc.nextInt();
        area = 2*length*breadth;
        System.out.println("Area of Rectangle:" +area);
    }
}