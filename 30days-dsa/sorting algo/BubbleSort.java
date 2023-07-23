public class BubbleSort {

     public static void bubblesort(int arr[], int n){

        for(int pass=1; pass<n; pass++){
            for(int i=0; i<n-1-pass; i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
     }

     public static void print(int arr[],int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+",");
        }
     }
    public static void main(String[] args) {

        int arr[]={5,1,10,12,6,7,45};
        int n=arr.length;
        bubblesort(arr,n);
        print(arr,n);
        
    }
    
}
