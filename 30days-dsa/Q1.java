public class Q1 {
   

    public static int sumarray(int arr[]){
        int n=arr.length;
        int sum=0;
        for(int i=0; i<n; i++){
            sum=sum+arr[i];
        }
        return sum;
    }
   

    


    public static void main(String[] args) {
          int arr[]={4,2,7,33,4,45,63};
        int sum=sumarray(arr);
        System.out.println(sum);
        
    }
    
}
