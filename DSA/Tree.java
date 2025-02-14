// Creating a LinkedList

class Node{
    int data;
    Node next;
    Node(int data){
      this.data=data;
      this.next=null;
    }
}
class LinkedList{
    Node head;
    public void display() {
        Node cur=head;
        while(cur !=null){
            System.out.print(cur.data);
            cur=cur.next;
        }
    }
}
public class Tree{
    public static void main(String[] args){
        LinkedList list=new LinkedList();
        list.head=new Node(4);
        list.head.next=new Node(6);
        list.head.next.next=new Node(9);
        list.display();
    }
}


/* // Using LinkedList Methods to add elements into a list
 
import java.util.LinkedList;
public class Main{
    public static void main(String[] args){
        LinkedList<Integer> list=new LinkedList();
        list.add(4);
        list.add(6);
        list.add(9);
        System.out.print(list);
    }
}

 */