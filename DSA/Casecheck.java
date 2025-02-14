import java.util.*;
public class Casecheck{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        //next is used to create a string from that we access the character and trim is heplful to remove extraspaces charAt is used to convert string to char at specific index
        char ch=sc.next().trim().charAt(0);
        System.out.println(ch);
        
        String s="Bhagya";
        System.out.println(s.charAt(3));

        //Checking the conditions of lower or Upper cases 
        if(ch>='a' && ch<='z'){
            System.out.println("Lowercase:"+ch);
        }else{
            System.out.println("Uppercase:"+ ch);
        }


    }
}