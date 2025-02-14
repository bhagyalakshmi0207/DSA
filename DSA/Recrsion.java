/*TO find the sum of no from 1 to n using the reccursion*/

/*

class Recrsion{
    public static int sumOfNum(int i,int n){
        //base case-to terminate the recurisive cells
        if(i>5){
            //recursive call
            return 0;  
        }return i+sumOfNum(i+1,n);
    }
    public static void main(String[]args){
        int n=5;
        int ans=sumOfNum(1,n);
        System.out.println(ans);
    }
}
*/


class Recrsion{
    public static int proOfnum(int num1,int num2){
        //base case-to terminate the recurisive cells
        if(num1<num2)
            return proOfnum(num2,num1);
            else if(num2 !=0){
                return (num1+proOfnum(num1,num2-1));
            }
        else{
            return 0;
        }
    }
    public static void main(String[] args){
        int num1=2;
        int num2=3;
        System.out.println(proOfnum(num1,num2));
    }
}