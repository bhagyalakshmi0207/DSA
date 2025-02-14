public class Linearsearch{
    public static void main(String args[]){
        int[]array={9,4,5,6,7};
        int index=LinearSearch(array,5);
        if(index!=-1){
            System.out.println("Element found:"+index);
        }
        else{
            System.out.println("Not found");
        }
    }
        private static int LinearSearch(int[] array, int data) {     
            for(int i=0;i<array.length;i++){
            if(array[i]==data){
                return i;
            }
        }
        return -1;
    }
 
}
