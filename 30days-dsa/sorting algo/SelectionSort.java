public class SelectionSort {

     public static void selectionsort(int a[], int n){
        int i,minindex;
        for( i=0; i<n-1; i++){
            minindex=i;
            for(int j=i+1; j<n; j++){
                if(a[j]<a[minindex]){
                    minindex=j;
                }
            }

            if(i!=minindex){
                int temp=a[i];
                a[i]=a[minindex];
                a[minindex]=temp;
            }

        }

     }

     public static void print(int arr[],int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+",");
        }
     }
    public static void main(String[] args) {
        int a[]={1,6,12,77,8,3};
        int n=a.length;
        selectionsort(a,n);
        print(a,n);
        
    }
    
}
