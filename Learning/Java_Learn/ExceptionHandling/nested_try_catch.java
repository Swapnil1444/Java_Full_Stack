package ExceptionHandling;

public class nested_try_catch {
    public static void main(String[] args) {
        try{
            System.out.println("Outar try block");
            try{
                int i=10;
                System.out.println(20/i);
                System.out.println("ineer try block");
            }catch(ArithmeticException e){
                System.out.println("Divide bye 0 exception:"+e);
            }

            try{
                String s=null;
                System.out.println(s.length());
                
            }catch(NullPointerException e){
                System.out.println(""+e);
            }

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
