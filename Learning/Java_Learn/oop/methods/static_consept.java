package oop.methods;
 class demo  {

    static{
        System.out.println("inside the class static block");
    }
    
}

 class Moblie {

   static String name;
   int price;
   String brand;

   public void show(){
    System.out.println("name "+name+" price "+price+" brand "+brand);
   }

   static void show1(Moblie obj){
    System.out.println("name "+name+" price "+obj.price+" brand "+obj.brand);
   }

    
} 

public class static_consept {
    public static void main(String[] args) throws ClassNotFoundException {
        
       // demo d=new demo();
       Class.forName("demo"); //without crate a object to lood class

       Moblie m=new Moblie();
       m.brand="iphone";
       m.price=200;
       Moblie.name="smartphone"; // class static varibale 
       m.show();
       m.show1(m); Moblie.show1(m); //this is class static method 


    }
}
