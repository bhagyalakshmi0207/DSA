class Rearrin{
    static void SumOfEven(int arr[],int i,int sum){
        if(i<0){ 
            System.out.println(sum);
            return;
        }
        if((arr[i])%2 ==0){
            sum +=(arr[i]);
        }
        SumOfEven(arr,i-1,sum);
    }
    public static void main(String[] args){
        int arr[]={10,2,3,5,1,6};
        int n=arr.length;
        int sum=0;
        SumOfEven(arr,n-1,sum);
        
    }
}