import java.util.ArrayList;

class Solution {
    public int countPrimes(int n) {
        int count=0;
        
        for(int i=2;i<n;i++){
            if(isPrime(i)){
              // System.out.println(i); 
              count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int n){
            
            for(int i=2;i<n;i++){
                if(n%i==0){
                    return false;
                }
                
            }
            return true;

        }
}


public class Count_Primes {
    public static void main(String[] args) {
        Solution obj=new Solution();
        System.out.println(obj.countPrimes(10));
    }
}
