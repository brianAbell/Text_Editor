import java.util.*;

public class Main {

    public static void main(String[] args) {        
        Queue<Integer> queue = new ArrayDeque<>(Arrays.asList(1, 2, 3, 4));

        queue.add(5);
        queue.remove();
        queue.remove();

        System.out.println(queue);
    }
}