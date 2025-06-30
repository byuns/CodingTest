import java.util.Collections;
import java.util.PriorityQueue;

public class HeapMethod {
    public static void main(String[] args){
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // 최소힙

        pq.offer(2); pq.offer(5); pq.offer(1); pq.offer(4); pq.offer(3);
        System.out.println("pq(pq.offer) : " + pq);

        System.out.println("pq.peek() : " + pq.peek()); // poll할 값만 보여줌

        // 우선순위가 높은 순서로 꺼냄
        System.out.println("pq.poll() : " + pq.poll());
        System.out.println("pq.poll() : " + pq.poll());
        System.out.println("pq.poll() : " + pq.poll());
        System.out.println("pq.poll() : " + pq.poll());
        System.out.println("pq.poll() : " + pq.poll());

        System.out.println("pq.isEmpty() : " + pq.isEmpty());


        System.out.println("");

        PriorityQueue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder()); // 최대힙

        maxPq.offer(2); maxPq.offer(5); maxPq.offer(1); maxPq.offer(4); maxPq.offer(3);
        System.out.println("maxPq(maxPq.offer) : " + maxPq);

        // 우선순위가 높은 순서로 꺼냄
        System.out.println("maxPq.poll() : " + maxPq.poll());
        System.out.println("maxPq.poll() : " + maxPq.poll());
        System.out.println("maxPq.poll() : " + maxPq.poll());
        System.out.println("maxPq.poll() : " + maxPq.poll());
        System.out.println("maxPq.poll() : " + maxPq.poll());
    }
    
}
