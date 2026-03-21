package ExceptionHandling;

public class demo {
 
    public static void main(String[] args) {
        
        int a=0,b=2,r=0;
        int[] arr=new int[5];

        try {
            r=a/b; // ArithmeticException
            System.out.println(arr[4]);
        }catch(ArithmeticException e){
            System.out.println("not divide in zero");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index is out of bounds..");
        }catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("finally complet code output..");
        }
        System.out.println(r);
    }
}
