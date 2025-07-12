
import java.util.LinkedList;
import java.util.Queue;

public class CollQueue {
    public static void main(String[] args) {
        Queue<Integer> qq = new LinkedList<Integer>();
        for(int i = 0; i<=5; i++){
            qq.add(i);
        }
        System.out.println(qq);

        int remove = qq.remove();
        System.err.println("Removed Queue: " + remove);
        
    }
}