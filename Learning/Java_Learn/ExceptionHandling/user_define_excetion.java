package ExceptionHandling;

class SwapnilException extends Exception{
    public SwapnilException(String msg){
        super(msg);
    }
}
public class user_define_excetion {

public static void main(String[] args) {
    
      int i=0;
    try{
        if(i==0){
            throw new SwapnilException(" not accept bye 0");
        }
    }catch(SwapnilException e){
        System.out.println("it is user defind exception "+e);
    }

}
    
}
