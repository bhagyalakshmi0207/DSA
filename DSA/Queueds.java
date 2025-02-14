import java.util.*;

/*  Queue is a FIFO ,Linear ds.
  enqueue - adding ,offer() . Dequeue - remove , poll()
  queue is an interface not a cls
  queue provides an interface of the Linkedlist from that we create a cls so created the linkedlist instide of the queue or an priotity queue
*/
public class Queueds{
    public static void main(String args[]){
        Queue<String> queue = new LinkedList<String>();
        System.out.println(queue.isEmpty());
        //push,pop,peek
        for (int i = 0; i < 10; i++) {
            
        }
        queue.offer("Sita");
        queue.offer("Rama");
        queue.offer("Laxman");
        queue.offer("Hanuman");
        // finding the first or top element
        System.out.println(queue.peek());
        System.out.println(queue);
        // finding the popped element
        queue.poll();
        System.out.println(queue);
        // checking the queue isEmpty(),size(),contains("")
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("Rama"));
        System.out.println(queue.contains("Lakshmi"));
    }
}









//Uses - Keyboard buffer, printer queue, linked lists,priority queue,breath first search