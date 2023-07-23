import java.util.*;
public class IsfrequensyUnique {

    public static boolean isfrequencyuniqe(int arr[], int n){

        HashMap<Integer,Integer>map=new HashMap<>();
        for(int x:arr){
            map.put(x, map.getOrDefault(x,0)+1);
        }

        Set <Integer>set=new HashSet<>();
        for(int x:map.values()){
            if(set.contains(x)){
                return false;
            }
            set.add(x);
                
            
        }
        return true;
    }    
    public static void main(String[] args) {
        int arr[]={1,2,1,5,3,5};
        int n=arr.length;

        System.out.println(isfrequencyuniqe(arr,n));
        
    }
    
}
