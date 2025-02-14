import java.util.*;
class stack{
    // array to store stack elements of some random size
    private int max_size = 1000;
    int arr[] = new int[max_size];
    int top = -1;
    //the actual value of the top and the increment of to becomes 0.
    
    //push method 
    public void push(int elm){
         top += 1;
         //check of overflow 
         if(top < max_size)
             arr[top] = elm;
         else 
             System.out.println("Stack overflow");
    }
 
    //pop method 
    public int pop(){
     // stack is empty, then cannot pop
     if(top == -1)
        return -1;
     else{
         int ans = arr[top];
         top -=1;
         return ans;
     }
 
    }
 
    //top method 
    public int peek(){
     if(top == -1){
         return -1;
     }
     return arr[top];
    }
 
    //to find the size
    public int size(){
     return top+1;
    }
 
    // to check if stack is empty or not 
    public boolean isEmpty(){
     if(top == -1) return true;
     else return false;
    }
 }

 public class Stackt{
     public static void main(String args[]){
         //Create stack object to use its methods 
         Stack<Integer> st = new Stack<Integer>();
         st.push(10);
         st.push(20);
         st.push(30);
         st.push(40);
         //deletes & returns 40 
         System.out.println(st.pop());
         //returns 30 
         System.out.println(st.peek());
         //returns 3 
         System.out.println(st.size());
         //returns false 
         System.out.println(st.isEmpty());
     }
 }