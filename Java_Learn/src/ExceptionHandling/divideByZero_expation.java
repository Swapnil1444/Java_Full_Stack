package ExceptionHandling;

public  class divideByZero_expation{

    public static void exption_one(){
         
        int a=10;
        int b=0;
        int r=0;
        try {
            r=a/b;
        } catch (ArithmeticException e) {
            System.out.println(" connot be the / bye zero");
        }
        System.out.println(r);
    }


    public static void main(String[] args) {
        exption_one(); 
    }
 }