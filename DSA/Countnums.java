// Finding the no of elements repeating 
public class Countnums{
    public static void main(String[]args){
        int n=221102;
        int count=0;
        while(n > 0){
            int rem = n % 10; // Gives the last digit
            if(rem==2){
                count++;
            }
            n=n/10;
        }System.out.println(count);
    }
}