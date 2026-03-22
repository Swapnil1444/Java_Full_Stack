package ExceptionHandling;
public class use_throw1 {

    static void check_age(int age,int b){
        if(18>age){
            throw new IllegalArgumentException("age is less than 18 is not esible"); 
        }
        int r=age/b;
        if(r==0){
            throw new ArithmeticException("zero not enter");
        }
        System.out.println(r);

    }

    public static void main(String[] args) {
        check_age(10,18);
    }
}