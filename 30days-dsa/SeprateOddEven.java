public class SeprateOddEven {

    public static void seprateoddeven(int arr[], int n){
        int l=0;
        int r=n-1;
        while(l<r){
            while(arr[l]%2==0){
                l++;
            }
            while(arr[r]%2==1){
                r--;
            }
            if(l<r){
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }
        }
    }
    public static void main(String args[]){
        int arr[]={1,52,4,75,5,35,2,44,87};
        int n=arr.length;
        seprateoddeven(arr,n);

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+",");
        }

    }
    
}
