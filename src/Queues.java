import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) { //FIFO
        Queue<String> queue = new LinkedList<String>();

        queue.offer("Karen");
        queue.offer("Mike");
        queue.offer("Donna");
        queue.offer("Harvey");

        System.out.println(queue.peek()); // See What's at the head of our queue

        queue.poll();

        System.out.println(queue.size()); // Size of a queue

        System.out.println(queue);
    }
}
