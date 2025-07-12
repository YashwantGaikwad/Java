import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class CollSorted1 {
    public static void main(String[] args) {
        SortedSet<String> ss = new TreeSet<String>();

        ss.add("Yash");
        ss.add("Sk");
        ss.add("Pratik");
        ss.add("Panu");

        System.out.println("Sorted List: " + ss);

        ss.remove("Yash");
        System.out.println(ss);

        System.out.println("Iterating over set:");
        for(String value : ss){
            System.out.println(value + ",");
        }

    }
}
