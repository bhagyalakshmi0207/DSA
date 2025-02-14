// // Finding the largest of 3 No's using the Math class 
import java.util.*;
public class Loops{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int max=Math.max(a,b);
        System.out.println(max);
        int maximum=Math.max(c,Math.max(a,b));
        System.out.println(maximum);
        int maxi=Math.max(c,Math.max(48,22));
        System.out.println(maxi);


    }
}


// Using the max=0 and finding it's sol

// import java.util.*;
// public class Loops{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int c=sc.nextInt();
//         int max=0;
//         if(a>b){
//             max=a;
//         }else{
//             max=b;
//         }
//         if(c>max){
//             max=c;
//         }System.out.println(max);
//     }
// }


// Considering max=a and finding it's sol

// import java.util.*;
// public class Loops{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int c=sc.nextInt();
//         int max=a;
//         if(b>max){
//             max=b;
//         }
//         if(c>max){
//             max=c;
//         }System.out.println(max);

//     }
// }