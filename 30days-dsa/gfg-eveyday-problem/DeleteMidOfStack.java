import java.util.Stack;

public class DeleteMidOfStack {
     public void deleteMid(Stack<Integer>s,int sizeOfStack){
        
        
        // code heresize
        helper(s,sizeOfStack,0);
    } 
     void helper(Stack<Integer>s,int n, int indx){
         
         if(indx==n/2){
             s.pop();
             return;
         }
         
         int x=s.pop();
         indx++;
         
         helper(s,n,indx);
         s.push(x);
     }
}
