package Inheritance;

class A111{
    int a,b;
}
class B111 extends A111{
    public B111(int a,int b)
    {
        this.a=a;
        this.b=b;

    }
    int multification(){
        return a*b;
    }
}
class C111 extends A111{

    public C111(int a,int b)
    {
        this.a=a;
        this.b=b;

    }
    int Sum(){
        return a+b;
    }
}

public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        
        B111 b=new B111(10,23);
        C111 c=new C111(20,40);
         
        System.out.println("muti"+b.multification());
        System.out.println("sum"+c.Sum());

    }
}
