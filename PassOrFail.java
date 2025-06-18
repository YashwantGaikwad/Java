
import java.util.Scanner;

class PassOrFail {
    public static void main(String[] args) {
        System.out.print("Enter the marks:");
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();

        if(mark>=35 && mark<60){
            System.out.println("Pass with Grade C");
        }
        else if(mark>=60 && mark<=80){
            System.out.println("Pass with Grade B");
        }else if(mark>80 && mark<=100){
            System.out.println("Pass with Grade A");
        }else{
            System.out.println("Fail...");
        }
    }
}
