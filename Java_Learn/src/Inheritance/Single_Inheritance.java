package Inheritance;


class A{

    int id=10;
    void sound(){
        System.out.println("parent class ");
    }
}
class B1 extends A{

    void ID(){
        System.out.println(id);
    }

}

public class Single_Inheritance {

    public static void main(String[] args) {
     B1 b=new B1();
    b.sound();
    b.ID();
    }
    
    
}
