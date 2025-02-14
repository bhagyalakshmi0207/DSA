/* Linked List: Iteration through the collection one element at a time
 * Slow gor large data sets - Dis advan
 * Adv - Small and Medium datasets it's fast
 * Doesn't need to sort
 * random access of elements
*/
public class Searching1{
    public static void main(String[]args){
        // Create an array
        int[] arr = {11,34,56,8,10};
        // Call the method of Linear Search
        int index= linearSearch(arr,10);
        if(index !=-1){
            System.out.println("The Element Found: "+index);
        }else{
            System.out.println("The Element not Found");
        }
    }
    public static int linearSearch(int[]arr,int value){
        // for checking the element with in the array or not
        for(int i=0;i<arr.length;i++){
            if(arr[i]==value){
                return i; // Return the index if the element is found
            }
        }
        return -1; // Return -1 if the element is not found
    }
}