public class WaveForm {

    public static void maxminarray(int arr[]){
        int n=arr.length;
        for(int i=0; i<n; i++){
            if(i-1>=0 && arr[i]<arr[i-1]){
                int temp=arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=temp;
            }

            if(i+1<n && arr[i]<arr[i+1]){
                   int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                
            }
        }

    }
    public static void main(String args[]){

        int arr[]={1,4,10,2,5,30,32,5,10};
        maxminarray(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+",");
        }

    }
    
}
