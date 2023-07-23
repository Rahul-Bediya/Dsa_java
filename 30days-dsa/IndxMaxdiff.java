public class IndxMaxdiff {
    public static void maxdifference(int a[],int n){

        int maxdiff=-1000;
        int diff=0;
        int l=0,r=0;

        for(int i=0;i<n-1; i++){
            for(int j=i+1; j<n;j++){
                if(a[j]>a[i]){
                    diff=a[j]-a[i];
                }
                if(diff>maxdiff){
                    maxdiff=diff;
                    l=i;
                    r=j;
                }
            }
        }

        System.out.println(l+","+r+" and maxdif="+maxdiff);
       
    }
    public static void main(String args[]){

        int arr[]={1,4,6,3,45,2,36,45,6,34,2};
        int n=arr.length;
        maxdifference(arr,n);
     

    }
    
}
