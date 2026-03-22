package ExceptionHandling;
public class use_throw1 {

    static void check_age(int age){
        if(18>age){
            throw new IllegalArgumentException("age is less than 18 is not esible"); 
        }
    }

    public static void main(String[] args) {
        check_age(17);
    }
}