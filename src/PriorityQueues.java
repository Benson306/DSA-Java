import java.util.*;

public class PriorityQueues {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();

        queue.offer("B");
        queue.offer("A");
        queue.offer("D");

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }


    }
}
