import java.util.*;
public class Stackds{
    public static void main(String[]args){
        // Syntax - Stack<obj> name=new Stack<obj/dtype>();

        Stack<String> stack= new Stack<String>();

        // Stack contains 5 unique methods -empty,push,pop,peek,finging the element with in the stack

        System.out.println(stack.empty());
        
        // Push means ad of the element into the stack
        stack.push("Bhagya");
        stack.push("Rama");
        stack.push("Hema");
        stack.push("Riya");
        stack.push("Gowtham");
        System.out.println(stack);

        String name = stack.pop();
        System.out.println(name);
        // remove the last element in the stack and display the popped element
        System.out.println(stack);


         System.out.println(stack.peek());
         // doesn't remove any element only display the top element
         System.out.println(stack);


        //pop of the elmement means remove the first ele with in thee stack
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);

        // Finding an element with in the stack
        System.out.println(stack.search("Bhagya"));
        //Neagative value indicates ther's no element present with int the stack
        System.out.println(stack.search("Lakshmi"));

    }
}

//Uses - Undo & redo operations,moving back and forward , backtracking alg, Calling functions