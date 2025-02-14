import java.util.*;
import java.util.LinkedList;
import javax.security.auth.login.CredentialException;

//create node
class Node{
    int data;
    Node next;
    //constructor
    public Node(int data){
      this.data=data;
      next=null;
    }
    //traverse 
    public void traverse(Node head){
        Node cur=head;
        while(cur !=null){
            System.out.println(cur.data);
            cur=cur.next;
        }
    }
    //length of the linkedlist
    public void length(Node head){
        Node cur=head;
        int count=0;
        while(cur !=null){
            count++;
            cur=cur.next;
        }
        System.out.println("The length of the Linkedlist is: "+count);
    }
    //New Node at Head
    public void insertFront(Node newNode,Node head){
        newNode.next=head;
        head=newNode;
    }
    //New Node at the last
    public void insertLast(Node newNode,Node head){
       if(head==null){
        head=newNode;
        return;
       }
       Node cur=head;
       while(cur.next !=null){
         cur=cur.next;
       }
       cur.next=newNode;
    }

    

}
class Linkedlist{
    public static void main(String[] args){
        //create a head node 
       Node head=new Node(10);
       Node obj=head;
       head.next=new Node(20);
       head.next.next=new Node(30);
       head.next.next.next=new Node(40);
       //Traverse  in a Linkedlist
       obj.traverse(head);
       //length of a linkedlist
       obj.length(head);
       //New Node at Head
       Node NewNode=new Node(5);
       obj.insertFront(NewNode,head);
       head=NewNode;
       System.out.println("Before Traversal and After Traversal");
       obj.traverse(head);
       //New node at last
       Node NewNode=new Node(5);
       obj.insertLast(NewNode,head);
       head=NewNode;
       System.out.println("Before Traversal and After Traversal");
       obj.traverse(head);


    }

}