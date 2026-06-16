package oop.Polymorphism1;
class A1{

    //method overloding it is compile time 
    public int mul(int a,int b){
        return a*b;
    }

    public  double mul(double a,double b){
        return a*b;
    }

     public static double mul(double a,int b){
        return a*b;
    }


}



public class Compile_Time {
    public static void main(String arg[]){
       // System.out.println("hello");

       A1 a=new A1();
       System.out.println(a.mul(10, 20));
       System.out.println(a.mul(10.2, 20.6));

       System.out.println(A1.mul(10.1, 20));




    }

}
