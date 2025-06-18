
import java.util.Scanner;

class MaxValue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a First number:");
        int a = sc.nextInt();
        System.out.print("Enter a Second number:");
        int b = sc.nextInt();

        int max = a>b ? a:b; 
        System.out.println("Maximum number is:"+max);
    }
}
