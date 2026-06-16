package oop.methods;

import oop.packages.*;

  class Stud{

    private int roll_no; //privete access modifier
    private String name;

    //useing the getter and setter method to acccess
    public int getRoll_no() {
        return roll_no;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }


}

 class Car {

    String carName; //default access modifier
}

 class Vehicle {
     protected int speed;     // protected 
}

  class Bike extends Vehicle {
    void setSeed(int speed){
    this.speed=speed;
  } 

  int getSpeed(){
    return speed;
  }
}

 class A1 {
 public String text1;
   public void printText(){
    System.out.println(text1);
   }
}


public class Access_Modifier {
    public static void main(String[] args) {
        Stud s=new Stud();
        s.setName("swapnil"); //call setter method 
        s.setRoll_no(1);
        System.out.println("name: "+s.getName()+" roll_no: "+s.getRoll_no()); //fach deta

        // access default modifar
        Car c=new Car();
        c.carName="BMW";
        System.out.println("Car name: "+c.carName);


        P1 p=new P1(); // access packeges class
        p.hello();


        //Protected Access Modifier

        Bike b=new Bike();
        b.setSeed(100);
        System.out.println(" Bike Speed:"+b.getSpeed());

        //public 
        A1 a=new A1();
        a.text1="hello swapnil supekar your learn java ?";
        a.printText();
         
    }
}
