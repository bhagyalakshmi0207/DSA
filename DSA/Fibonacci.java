// //Using for loop in a order

// import java.util.*;
// public class Fibonacci{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int a=0;
//         int b=1;
//         for(int i=1;i<=n;i++){
//             System.out.print(a + " ");
//             int temp=a+b;
//             a=b;
//             b=temp;
//         }
        
//     }
// }


//Using while loop
import java.util.*;
public class Fibonacci{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int count =2;
        while(count <=n){
            int temp=b;
            b=b+a;
            a=temp;
            count++;
        }System.out.print(b);
    }
}