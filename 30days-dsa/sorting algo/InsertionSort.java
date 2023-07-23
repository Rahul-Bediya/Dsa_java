public class InsertionSort {

    public static void insertionsort(int arr[],int n){

        for(int i=1; i<n; i++){
            for(int j=i-1; j>=0; j--){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                else{
                    break;
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
        int arr[]={5,203,2,23,52,63,23,5};
        int n=arr.length;
        insertionsort(arr,n);
        print(arr,n);
        
    }
    
}
