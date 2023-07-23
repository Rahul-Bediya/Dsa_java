import java.util.*;
public class DistinckSum {

    public static int distinctsum(int arr[], int n){
        Arrays.sort(arr);
        int sum=0;
        for(int i=0; i<n-1; i++){
            if(arr[i]!=arr[i+1]){
                sum=sum+arr[i];
            }
        }
        sum=sum+arr[n-1];
        return sum;

    }
    public static void main(String args[]){
        int arr[]={1,3,4,12,1,1};
        int n=arr.length;
        System.out.println(distinctsum(arr, n));

    }
    
}
