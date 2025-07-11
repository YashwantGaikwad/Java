import java.io.*;
import java.util.*;

public class CollLists1 {
    public static void main(String[] args) {
    //     int n = 5;

    //     List<Integer> li = new ArrayList<Integer>(n);

    //     for (int i = 1; i <= n; i++)
    //         li.add(i);
    //     System.out.println(li);

    //     li.remove(3);
    //     System.out.println("Removed list:" + li);

    //     li.add(3, 10);
    //     System.out.println("Added list: " + li);

    //     for(int i = 0; i< li.size(); i++ )
    //     System.out.print(li.get(i) + " ");


    // Vector class
    // int n = 5;

    // List<Integer> li = new Vector<Integer>(n);

    // for (int i = 1; i <= n; i++)
    //     li.add(i);
    // System.out.println(li);

    // li.remove(3);
    // System.out.println("Removed list:" + li);

    // li.add(3, 10);
    // System.out.println("Added list: " + li);

    // for(int i = 0; i< li.size(); i++ )
    // System.out.print(li.get(i) + " ");
    
    // Stack
    // int n = 5;

    // List<Integer> li = new Stack<Integer>();

    // for (int i = 1; i <= n; i++)
    //     li.add(i);
    // System.out.println(li);

    // li.remove(3);
    // System.out.println("Removed list:" + li);

    // li.add(3, 10);
    // System.out.println("Added list: " + li);

    // for(int i = 0; i< li.size(); i++ )
    // System.out.print(li.get(i) + " ");

    // LinkedList
    int n = 5;

    List<Integer> li = new LinkedList<Integer>();

    for (int i = 1; i <= n; i++)
        li.add(i);
    System.out.println(li);

    li.remove(3);
    System.out.println("Removed list:" + li);

    li.add(3, 10);
    System.out.println("Added list: " + li);

    for(int i = 0; i< li.size(); i++ )
    System.out.print(li.get(i) + " ");

    }
}
