import java.util.*;
public class Pairsumclosestto0 {

    public static void pairsumclosesttozero(int arr[], int n){
        int closetsum=9999;
        int cursum=0;
        Arrays.sort(arr);
        int left=0;
        int right=n-1;
        int l=0,r=0;
        while(left<right){
            cursum=arr[left]+arr[right];
            if(Math.abs(cursum)<Math.abs(closetsum)){
                closetsum=cursum;
                l=left;
                r=right;
            }
            if(cursum<0){
                left++;
            }
            else{
                right--;
            }
        }
       System.out.println(l+","+r);

       
    }
    public static void main(String args[]){
        int a[]={1,4,-2,45,-23,-2,45,23,32};
        int n=a.length;
        pairsumclosesttozero(a, n);

    }

    
}
