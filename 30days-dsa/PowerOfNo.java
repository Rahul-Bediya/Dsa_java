public class PowerOfNo {

    public static long power(int N, int R){
        int mod=1000000007;
        
        if(R==0){
            return 1;
        }
        
        long ans=0;
        if(R%2==0){
            ans=power(N,R/2);
            ans=(ans*ans)%mod;
        }
        else{
            ans=N%mod;
            ans=(ans*power(N,R-1)%mod)%mod;
        }
        
        return ans%mod;
        
    }
    public static void main(String[] args) {
        int n=12;
        int r=21;

        System.out.println(power(n,r));
        
    }
    
}
