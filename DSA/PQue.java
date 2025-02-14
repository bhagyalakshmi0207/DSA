import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
//import java.util.LinkedList(); 

//Priority Queue follows - FIFO , high priority comes first and low priority comes next

public class PQue{
    public static void main(String[] args) {
    //Queue<Double> queue=new LinkedList<>();
        //When we used the Linkedlist cls it shows in a order of the given input we can use the Priority queue inplace of that it gives the order of the ascending 
     //Queue<Double> queue=new PriorityQueue<>();
        //for the order either desecending/ascending of the Collections.reverseOrder()
        Queue<Double> queue=new PriorityQueue<>(Collections.reverseOrder());
        // Inplace of double we use the int ,float,string 
        queue.offer(35.0);
        queue.offer(65.0);
        queue.offer(95.0);
        queue.offer(25.0);
        queue.offer(10.0);
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
        
    }
}