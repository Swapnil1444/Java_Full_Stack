import java.util.ArrayList;

public class remove_prime {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // int n=4;
        // System.out.println(isPrime(n));

        for(int i=0;i<list.size();i++){
            if(!isPrime(list.get(i))){
               list.remove(i);
            }
        }
        System.out.println(list);
        
    }
    



    public static boolean isPrime(int n){
            if(n==1){
                return true;
            }
            for(int i=2;i<n;i++){
                if(n%i==0){
                    return false;
                }
                
            }
            return true;

        }
}
