import java.util.Queue;
import java.util.LinkedList;

public class basics {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println("Queue: " + queue);
        System.out.println("Front element: " + queue.peek());
        System.out.println("Removed element: " + queue.remove());
        System.out.println("Queue after remove: " + queue);
    }
    
}
