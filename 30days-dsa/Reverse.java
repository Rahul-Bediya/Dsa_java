public class Reverse {

    public static void reverse(int arr[], int n){
        int j=n-1;
        for(int i=0;i<j;i++){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
        }
    }

    public static void main(String args[]){
       int arr[]={1,5,3,8,9,10};
       int n=arr.length;
      reverse(arr,n);
      for(int i=0; i<n; i++){
        System.out.print(arr[i]+",");
      }
    }


    
}
