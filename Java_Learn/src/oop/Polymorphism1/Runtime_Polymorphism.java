package oop.Polymorphism1;

//method overriding it a runtime polymorphime

class parent{

    void display(){
        System.out.println("parent class");
    }
}
class chied extends parent{

    void display(){
        System.out.println("chide class");
    }
    
}



public class Runtime_Polymorphism {
    public static void main(String[] args) {
        
        parent c=new chied();
        c.display();

        parent p=new parent();
        p.display();
    }
}
