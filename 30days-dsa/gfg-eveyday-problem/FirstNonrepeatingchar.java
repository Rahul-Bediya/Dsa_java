import java.util.LinkedList;
import java.util.Queue;

public class FirstNonrepeatingchar {
    public String FirstNonRepeating(String A)
    {
        // code c
        StringBuilder ans=new StringBuilder();
        int n=A.length();
        int arr[]=new int[26];
        
        Queue<Character>q=new LinkedList<>();
        for(int i=0;i<n;i++){
            char ch=A.charAt(i);
            arr[ch-'a']++;
            q.add(ch);
            
            while(!q.isEmpty()){
                if(arr[q.peek()-'a']==1){
                    ans.append(q.peek());
                    break;
                }
                else{
                    q.poll();
                }
                
            }
            if(q.isEmpty()){
                ans.append("#");
            }
            
        }
        return ans.toString();
    }
}
