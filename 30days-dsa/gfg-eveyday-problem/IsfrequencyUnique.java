import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class IsfrequencyUnique {
     public static boolean isFrequencyUnique(int n, int[] arr) {
        // code here
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int x: arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        
        Set<Integer>set=new HashSet<>();
        for(int x: map.values()){
            if(set.contains(x)){
                return false;
            }
            set.add(x);
        }
        return true;
    }

    public static void main(String args[]){
        
    }
    
}
