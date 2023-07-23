

public class KadensAlgo {

    public static int maxsubarray(int arr[]){
        int n=arr.length;
        int maxsum=-100;
        int cursum=0;
        for(int i=0; i<n; i++){
            cursum=cursum+arr[i];
            if(cursum>maxsum){
                maxsum=cursum;
            }
            if(cursum<0){
                cursum=0;
            }
        }
        return maxsum;
    }
public static void main(String args[]){
    int arr[]={12,6,1,78,-80,90,21};
    System.out.println(maxsubarray(arr));

}

    
}
