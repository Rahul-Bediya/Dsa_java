public class QuickSort {

    public static void quicksort(int a[],int l, int r){

        if(l<r){
            int q=partition(a,l,r);
            quicksort(a,l,q-1);
            quicksort(a,q+1,r);
        }

    }

    public static int partition(int a[], int l, int r){
        int pivot=a[r];
        int i=l-1;
        for(int j=l;j<r;j++){
            if(a[j]<pivot){
                i=i+1;
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        int tmp=a[r];
        a[r]=a[i+1];
        a[i+1]=tmp;
        return i+1;
    }
    public static void print(int arr[],int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+",");
        }
     }
    public static void main(String[] args) {
        
        int arr[]={4,53,26,23,62,2,6,35,63,45};
        int l=0;
        int r=arr.length-1;
        quicksort(arr,l,r);
        print(arr,arr.length);

    }
    
}
