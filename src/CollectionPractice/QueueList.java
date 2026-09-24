package CollectionPractice;
import java.util.*;

//Queue(I) extends Collection(I).PriorityQueue(C) implements Queue, Deque(I) extends Queue(I)
//offer() or add() to add elements
//peek() to retrieve elements
//poll() or remove() to delete elements
//clear() to remove all elements
public class QueueList {
    static void main(String[] args) {
        //PriorityQueue partially follows FIFO principle but sometimes the elements can be get by priority order.
        //Defal.siz =11
        //In integers the highest priority will small integers the head will always be highest priority
        //It doesn't allow null values and we can't access randomly the values.

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(3);
        pq.add(4);
        pq.add(6);
        pq.offer(1);
        pq.add(7);
        pq.add(9);
        System.out.println(pq);
        System.out.println("retrieval:"+ pq.peek());// we only get the head element
        System.out.println("Peeking:"+ pq.peek());
        System.out.println(pq);
        System.out.println("poll:"+pq.poll());
        System.out.println(pq);
        System.out.println("------------------------------------- DEQUE --------------------");
        //Arraydeque implements deque(I) which follows both head and tail updation.
        //offer,offerfirst, offerlast, add,addfirst,addlast
        //peek,peekfirst,peeklast
        //poll,pollfirst,polllast,remove.....
        //default capacity-17, don't allow null values
        ArrayDeque<Integer> aq = new ArrayDeque<>();
        aq.offer(3);
        aq.add(4);
        aq.addLast(6);
        aq.offerFirst(1);
        aq.addFirst(7);
        aq.offerLast(9);
        System.out.println(aq);
        System.out.println("retrieval:"+ aq.peek());// we only get the head element
        System.out.println("Peeking last:"+ aq.peekLast());
        System.out.println(aq);
        System.out.println("poll:"+aq.poll());
        System.out.println("last poll:"+aq.removeLast());
        System.out.println(aq);
    }
}
