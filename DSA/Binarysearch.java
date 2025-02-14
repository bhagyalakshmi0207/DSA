
import java.util.*;

public class Binarysearch{
    public static void main(String args[]){
        int[]arr={2,3,4,5,6,7,9,10,8}; 
    //Sorting of an array
        Arrays.sort(arr);
        System.out.println("The element is sorted");

    //for loop indication 

        for(int i=0;i<arr.length;i++){
          System.out.println(arr[i]+"");

        }
    // Binary Function

        int b=Arrays.binarySearch(arr,3);
        System.out.println("Element" + (b+1)  + "Position");
    }
}