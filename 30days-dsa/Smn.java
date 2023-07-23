public class Smn {
    public static int smallestMissingNumber(int arr[]){
        int n=arr.length+1;
        int maxsum=(n*(n+1))/2;
        int sum=0;
        for(int i=0;i<n-1;i++){
            sum=sum+arr[i];
        }
        return maxsum-sum;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,5,6,7,8};
        System.out.println(smallestMissingNumber(arr));
    }
    
}
