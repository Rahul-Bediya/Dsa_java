public class TransposeMatrix {

    public static void transpose(int n, int a[][]){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int a[][]={ {1, 1, 1, 1},
           {2, 2, 2, 2},
           {3, 3, 3, 3},
           {4, 4, 4, 4}};
            int n=4;

            transpose(n,a);

    }
    
}
