package oop.Inheritance;

class A11{
    int a;
    int b;
}
class B11 extends A11{
    public B11(int a,int b){
       this.a=a;
       this.b=b;
    }
    
}
class C11 extends B11{
    public C11(int a,int b){
        super(a, b);
    }
    public int sum(){
        return a+b;
    }
}


public class Multilevel_inheritance {

    public static void main(String[] args) {
      
        C11 c=new C11(10, 20);
        System.out.println(c.sum());
        

    }
}