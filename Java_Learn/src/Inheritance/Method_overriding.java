package Inheritance;

class animal{
    void eat(){
        System.out.println("animal is eat");
    }
    void move(){
        System.out.println("animal is move");
    }

    private void display(){
        System.out.println("it privete method in animal class");
    }

    // public static void dip(){
    //     System.out.println("dispaly static method");
    // }
}
class dog extends animal{

    // public static void dip(){
    //     System.out.println("statioc method in dog ");
    // }
    
    void eat(){
        System.out.println("dog is eat");
        super.eat();
    }
    

}
class cat extends animal{
    void move(){
        System.out.println("cat is move");
        super.move();//class the parent class method
    }
}

public class Method_overriding {
    public static void main(String[] args) {

        animal a=new animal();
       // animal.display();
        cat c=new cat();
        c.eat();
        c.move(); //call the child class method 

        dog d=new dog();
        d.eat(); //call the child class method 
        d.move();
        
    }
}
