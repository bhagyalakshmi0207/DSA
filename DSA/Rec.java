class Rec{
    
    public static int sum(){
        int[] arr={10,2,3,5,1,6};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum +=arr[i];
        }return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum());
    }
}