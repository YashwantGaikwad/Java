
import java.util.ArrayList;
import java.util.List;

public class Autoboxing1 {
    public static void main(String[] args) {
        //ArrayList<Integer> al = new ArrayList<Integer>();
        // al.add(10);
        // al.add(20);
        // al.add(30);

        // System.out.println("ArrayList: " + al);

        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<=10; i++){
            System.out.println(list.add(Integer.valueOf(i)));
        }
    }
}
