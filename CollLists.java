
import java.util.ArrayList;
import java.util.List;


public class CollLists {
    public static void main(String[] args) {
        //Creating a list of Strings using arraylist
        List<String> li = new ArrayList<>();

        li.add("Java");
        li.add("C#");
        li.add("React");
        li.add("Tailwindcss");
        li.add("DSA");

        System.out.println("Elements of list are:" + li);

        //Iterating through the list
        System.out.println("Elements of lists are: ");
        for(String s : li){
            System.out.println(s);
        }

        // Accessing elements
        System.out.println("\nElement at index 1: " + li.get(1));

        //Updating elements
        li.set(2, "Python");
        System.out.println("Updated List: " + li);

        //Remove elements
        li.remove(4);
        System.out.println("Updated List: " + li);
    }
}
