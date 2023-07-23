public class SmallestMissingNo {
    public static int SmallestMissingNumber(int arr[], int n){
        int count=0;
        
        int sum=0;
        for(int i=0; i<n; i++){
            if(arr[i]>0){
                sum=sum+arr[i];
               

            }
            else{
                count++;
            }
        }
        int N=(n-count)+1;
        int maxsum=(N*(N+1))/2;

        return maxsum-sum;
    }

    public static void main(String args[]){
        int a[]={1 ,-2 ,0 ,-1, -2 ,1 ,-4 ,2 ,-3};
        int n=9;
        System.out.println(SmallestMissingNumber(a,n));
    }
    
}
