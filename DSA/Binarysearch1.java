
import java.util.Arrays;

public class Binarysearch1{
    public static void main(String[]args){
        int[]array=new int[100];
        int target=98;
        //for loop
        for(int i=0;i<array.length;i++){
            array[i]=i;
        }
        //Binary function
        int index=Arrays.binarySearch(array,target);
        if(index==-1){
            System.out.println(target+"Not found");
        }
        else{
            System.out.println("found"+index);
        }
    }
    private static int binarySearch(int[]array,int target){
        int low=0;
        int high=array.length-1;
        while(low<=high){
            int middle=low+(high-low)/2;
            int value=array[middle];
            System.out.println("middle"+value);
            if(value< target){
                 low= middle+1;
            }
            else if(value > target){
                 high=middle-1;
            }
            else{
                return middle;
            }
     }
     return -1;
    }
}

