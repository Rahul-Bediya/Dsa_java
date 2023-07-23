public class RotateAtKpos {

    public static void rotateatkposition(int arr[],int n, int k){
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
    }
    public static void reverse(int arr[], int start, int end){
        int j=end;
        for(int i=start; i<j; i++){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7};
        int n=arr.length;
        rotateatkposition(arr, n, 3);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+",");
        }

    }

    
}
