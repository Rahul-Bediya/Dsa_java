import java.util.*;
public class Duplicate {

    public static void duplicate(int a[],int n){
        HashSet<Integer>h=new HashSet<>();
        for(int i=0;i<n;i++){
            if(h.contains(a[i])){
                System.out.print(a[i]+',');
            }
            else{
                h.add(a[i]);
            }
        }

    }
    public static void main(String args[]){
        int a[]={22,51,462,1,45,3,3,12,22,51};
        int n=a.length;
        duplicate(a, n);


    }
    
}
