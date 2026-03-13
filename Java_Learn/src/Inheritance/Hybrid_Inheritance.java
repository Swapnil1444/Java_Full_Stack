package Inheritance;



class vechal{
    void dispv(){
        System.out.println("vechal");
    }
}
class bus extends vechal{
  public void dispb(){
        System.out.println("bus");
    }
}
 interface fare1{
     void dispf();
}
class Car1 extends vechal implements fare1{

    void dispc1(){
        System.out.println("car");
    }
    public void dispf(){
        System.out.println("fare");
    }
}

public class Hybrid_Inheritance {

    public static void main(String[] args) {
        
        
       bus b = new bus();
       b.dispb();
       b.dispv();

       Car1 c=new Car1();
       c.dispc1();
       c.dispf();
       c.dispv();


    }
    }

